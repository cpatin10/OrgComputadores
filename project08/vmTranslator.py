#!/usr/bin/python3

import sys
import os

memSegment = {"stack": 256, "temp": 5, "pointer": 3} 
heapSegment = {"local": 1, "argument": 2, "this": 3, "that": 4}
binaryOp = {"add": "+", "sub": "-", "and": "&", "or": "|"}
unitaryOp = {"neg": "-", "not": "!"}
compOp = {"eq", "lt", "gt"}

#Desplaza SP a la posición de memoria anterior
def incSP():
    code = "\n" + "@SP" + "\n" + "M=M+1"
    return code

#Desplaza SP a la posición de memoria anterior
def decSP():
    code = "\n" + "@SP" + "\n" + "M=M-1"
    return code

#Escribe una Etiqueta
def writeLabel(label):
    code = "\n" + "(" + label  + ")"
    return code

#Verifica que la etiqueta dada no se cruce con las definidas internamente por la máquina virtual, de ser así la redefine para evitar fallos
def checkLabel(label, jmpCount):
    label = label.upper()
    if (label.find("JUMP") == 0 and label[4:].isdigit()) or label == "END":
        label = "JUMP" + str(jmpCount)
        jmpCount += 1
    return label, jmpCount    

#Almacena en D un valor dado el cual puede ser operado y que depende de un valor inicial (index)
def setConst(index, origin):
    code = "\n" + "@" + str(index) + "\n" + "D=" + origin
    return code

#Almacena en el registro M, de un registro A dado (dirc) el valor guardado por el registro D
def changeVal(dirc):
    code = "\n" + "@" + dirc + "\n" + "A=M" + "\n" + "M=D"
    return code

#Almacena en el registro D el valor encontrado en el registro M, de un registro A
def saveVal():
    code = "\n" + "A=M" + "\n" + "D=M"
    return code

#Guarda lo que hay en D en el registro del segmento temporal indicado
def writeTemp(index):
    code = "\n" + "@R" + str(index) + "\n" + "M=D"
    return code

#Reposiciona ARG = SP - nargs - 5 (necesario para el call())
def repositionArg(nargs):
    code = "\n" + "@SP" + "\n" + "D=M"
    code = code + "\n" + "@" + nargs + "\n" + "D=D-A"
    code = code + "\n" + "@5" + "\n" + "D=D-A"
    code = code + "\n" + "@ARG" + "\n" + "M=D"
    return code

#Reposiciona LCL = SP (necesario para el call())
def repositionLcl():
    code = "\n" + "@SP" + "\n" + "D=M"
    code = code + "\n" + "@LCL" + "\n" + "M=D"
    return code

#Define la variable temporal frame = LCL, necesaria para la ejecución del return
def frameDef():
    code = "\n" + "@LCL" + "\n" + "D=M"
    code = code + "\n" + "@R11" + "\n" + "M=D"
    return code

#Define la variable temporal retAddr = *(frame - 5), necesaria para la ejecución del return
def retAddrDef():
    code = "\n" + "@5" + "\n" + "A=D-A" + "\n" + "D=M"
    code = code + "\n" + "@R12" + "\n" + "M=D"
    return code

#Define SP = ARG + 1, necesaria para la ejecución del return
def spRetDef():
    code = "\n" + "@ARG" + "\n" + "D=M"
    code = code + "\n" + "@SP" + "\n" + "M=D+1"
    return code

#Restaura el segmento indicado después de la llamada (call), necesaria para la ejecución del return (se debe realizar en el siguiente orden: THAT, THIS, ARG, LCL, para que se ejecute correctamente)
def restoreCallers(segment):
    code = "\n" + "@R11" + "\n" + "M=M-1" + "\n" + "A=M" + "\n" + "D=M"
    code = code + "\n" + "@" + segment + "\n" + "M=D"
    return code

#Hace pop de lo que hay en la posición de memoria anteriormente apuntada por SP y desplaza SP a la posición de memoria anterior
def popD():
    code = decSP() + saveVal()
    return code

#Hace pop de la pila y lo almacena en el segmento static
def popStatic(textName, index):
    code = popD() + "\n" + "@" + textName + "." + index
    code = code + "\n" + "M=D"
    return code    

#Hace pop de la pila y almacena el dato en la posición indicada del segmento de memoria indicado, si se desea acceder a los segmentos del heap el tercer parámetro es true (Para static usar popStatic())
def popMem(segment, index, heap):
    if not heap:
        base = memSegment[segment]
        register = "A"
    else:
        base = heapSegment[segment]
        register = "M"
    code = setConst(base, register) + setConst(index, "A+D") + writeTemp(13)
    code = code + popD() + changeVal("R13")
    return code

#Hace la operación *ARG = pop, necesaria para la ejecución del return
def popArg():
    code = popD() + changeVal("ARG")
    return code

#Hace push de lo que hay en D en la posición actual del stack y desplaza el SP a la siguiente posición de memoria
def pushD():
    code = changeVal("SP") + incSP()
    return code

#Hace push del valor constante dado (index) en la posición actual del stack y desplaza el SP a la siguiente posición de memoria
def pushConstant(index):
    code = setConst(index, "A") + pushD()
    return code

def pushStatic(textName, index):
    code = "\n" + "@" + textName + "." + index
    code = code + "\n" + "D=M" + pushD()
    return code

#Hace push a la pila el valor tomado de la posición indicada del segmento de memoria indicado, si se desea acceder a los segmentos del heap el tercer parámetro es true
def pushMem(segment, index, heap):
    if not heap:
        base = memSegment[segment]
        register = "A"
    else:
        base = heapSegment[segment]
        register = "M"
    code = setConst(base, register) + setConst(index, "A+D") + "\n" + "A=D"
    code = code + "\n" + "D=M" + pushD()
    return code

#Hace push a la pila del segmento indicado (para el desarrollo del call)
def pushSegment(segment):
    code = "\n" + "@" + segment + "\n" + "D=M"
    code = code + pushD()
    return code

#Guarda el lugar a saltar en el registro A y hace un salto directo (true) o si es diferente de 0 (false)
def gotoDep(label, direct):
    target = "\n" + "@" + label + "\n"
    if direct:
        code = target + "0;JMP"
    else:
        code = popD() + target + "D;JNE"
    return code

#Escribe el código en assembler correspondiente al llamado de una función dada
def call(function, nargs, jmpCount):
    retLabel = "RETURN_ADD" + str(jmpCount)
    jmpCount += 1
    #se hace push de la dirección de retorno
    code = "\n" + "@" + retLabel + "\n" + "D=A"
    code = code + pushD()
    code = code + pushSegment("LCL")
    code = code + pushSegment("ARG")
    code = code + pushSegment("THIS")
    code = code + pushSegment("THAT")
    code = code + repositionArg(nargs)
    code = code + repositionLcl()
    code = code + gotoDep(function, True)
    code = code + writeLabel(retLabel)
    return code, jmpCount

#Escribe el código en assembler correspondiente a la ejecución de una función dada
def function(name, nargs):
    code = writeLabel(name)
    nargs = int(nargs)
    for i in range(nargs):
        code = code + pushConstant(0)
    return code

#Escribe el código en assembler correspondiente a la finalización de una función representada por el retorno al código original ("resturn")
def returnFunct():
    code = frameDef() + retAddrDef() + popArg() + spRetDef()
    code = code + restoreCallers("THAT") + restoreCallers("THIS") + restoreCallers("ARG") + restoreCallers("LCL")
    code = code + "\n" + "@R12" + "\n" + "A=M" + "\n" + "0;JMP"
    return code

#Hace la operación binaria indicada: hace 2 pop, la operación y 1 push. Para ello utiliza una de los registros del segmento de propósito general: 13
def binaryOperation(operator):
    code = popD() + writeTemp(13) + popD() + "\n" + "@R13" + "\n"
    code = code + "D=D" + operator + "M"
    code = code + pushD()
    return code

#Hace la operación unitaria indicada: decrementa SP, hace la operación e incrementaSP nuevamente
def unitaryOperation(operator):
    code = decSP() + "\n" + "A=M"
    code = code + "\n" + "M=" + operator + "M"
    code = code + incSP()
    return code

#Hace la operación de comparación, escribiendo en el tope de la memoria -1 si el resultado es falso o 0 si es verdadero. Para ello usa un registro de propósito general: 13
def compOperation(operator, jmpCount):
    code = popD() + writeTemp(13) + popD() + "\n" + "@R13" + "\n" + "D=D-M"
    jumpLabel = "JUMP" + str(jmpCount)
    code = code + "\n" + "@" +  jumpLabel
    jmpCount += 1
    code = code + "\n" + "D;J" + operator.upper()
    code = code + "\n" + "D=0" + "\n" + "@JUMP" + str(jmpCount)
    code = code + "\n" + "0;JMP" + "\n" + "(" + jumpLabel + ")" +  "\n" + "D=-1"
    code = code + "\n" + "(JUMP" + str(jmpCount) + ")"
    code = code + pushD()
    jmpCount += 1
    return code, jmpCount

#Traduce las líneas que se componen de una sola palabra
def oneWordCommand(words, jmpCount, lineCount):
    if words[0] in binaryOp:
        return binaryOperation(binaryOp[words[0]]), jmpCount
    elif words[0] in unitaryOp:
        return unitaryOperation(unitaryOp[words[0]]), jmpCount
    elif words[0] in compOp:
        return compOperation(words[0], jmpCount)
    elif words[0] == "return":
        return returnFunct(), jmpCount
    raise NameError("Error de argumentos en la línea" + str(lineCount))

#Traduce las líneas que se componen de dos palabras
def twoWordsCommand(words, lineCount, jmpCount):
    if words[0] == "label" and not words[1][0].isdigit():
        label, jmpCount = checkLabel(words[1], jmpCount)
        return writeLabel(label), jmpCount
    elif words[0] == "goto":
        return gotoDep(words[1].upper(), True), jmpCount
    elif words[0] == "if-goto":
        return gotoDep(words[1].upper(), False), jmpCount
    raise NameError("Error de argumentos en la línea" + str(lineCount))

#Traduce las líneas que se componen por trés palabras y que corresponden a los push y pop, function y call
def threeWordsCommand(words, lineCount, jmpCount, textName):
    if words[0] == "pop":
        if words[1] == "static":
            return popStatic(textName, words[2]), jmpCount
        if words[1] in memSegment:
            return popMem(words[1], words[2], False), jmpCount
        elif words[1] in heapSegment:
            return popMem(words[1], words[2], True), jmpCount
    elif words[0] == "push":
        if words[1] == "static":
            return pushStatic(textName, words[2]), jmpCount
        if words[1] in memSegment:
            return pushMem(words[1], words[2], False), jmpCount
        elif words[1] in heapSegment:
            return pushMem(words[1], words[2], True), jmpCount
        elif words[1] == "constant":
            return pushConstant(words[2]), jmpCount
    elif words[2].isdigit():
        if words[0] == "call":
            return call(words[1], words[2], jmpCount)
        elif words[0] == "function":
            return function(words[1], words[2]), jmpCount
    raise NameError("Error de argumentos en la línea" + str(lineCount))
    
#Lee una línea del código en el lenguaje de la máquina virtual y lo traduce a assembler
def lineTranslator(line, jmpCount, lineCount, textName):
    words = line.split(" ")
    wordsCount = len(words)
    if wordsCount == 3 and words[2].isdigit():
        return threeWordsCommand(words, lineCount, jmpCount, textName)
    elif wordsCount == 1:
        return oneWordCommand(words, jmpCount, lineCount)
    elif wordsCount == 2:
        return twoWordsCommand(words, lineCount, jmpCount)
    raise NameError("Error de argunmentos en la línea " + str(lineCount))

#Escribe las líneas correspondientes para el final del código en assembler, que corresponde al loop infinito
def infiniteLoop():
    code = "\n" + "(END)" + "\n" + "@END" + "\n" + "0;JMP"
    return code

#Escribe el código necesario para la inicialización de algunos ficheros .asm
def bootstrap(jmpCount):
    code, jmpCount = call("Sys.init", "0", jmpCount)
    code = setConst(256, "A") + "\n" + "@SP" + "\n" + "M=D" + code + "\n"   
    return code, jmpCount

#Trascribe un único fichero .vm a assembler (.asm)
def singleTextTranslator(textName, jmpCount, fname):
    lineCount = 0
    asmText = ""
    archive = open(textName, "r")
    for line in archive.readlines():
        lineCount += 1
        commIndex = line.find("//")
        if commIndex != -1:
            line = line[:commIndex]
        line = line.strip()
        if line != "":
            asmTemp, jmpCount = lineTranslator(line, jmpCount, lineCount, fname)
            asmText = asmText + asmTemp
    return asmText, jmpCount


#Lee el texto dado en el lenguaje de la máquina virtual y va generando el código en assembler traduciendo línea por línea
def translator(name, directory):
    jmpCount = 0
    asmText = ""
    if directory:
        for root, dirs, files in os.walk(name):
            for fname in files:
                if (fname[-3:] == ".vm"):
                    textName = os.path.join(root, fname)
                    asmTemp, jmpCount = singleTextTranslator(textName, jmpCount, fname)
                    asmText = asmText + asmTemp + "\n"
        if "Sys.vm" in files:
            asmTemp, jmpCount = bootstrap(jmpCount)
            asmText = asmTemp + asmText
    else:
        asmText, jmpCount = singleTextTranslator(name, jmpCount, name)
        if name == "Sys.vm":
            asmTemp, jmpCount = bootstrap(jmpCount)
            asmText = asmTemp + asmText
    return asmText

#Crea un nuevo fichero de extensión .asm a partir del nombre dado, y escribe en él el texto designado
def writeText(name, text):
    hackFile = open(name + ".asm", "w")
    hackFile.write(text)

#Programa para traducir un archivo en el lenguaje de máquina virtual a assembler
def main():
    try:
        if len(sys.argv) == 2:
            name = sys.argv[1]
        else:
            raise NameError("El archivo se pasa como parámetro del programa")
        if name[-3:] != ".vm":
            asmText = translator(name, True)
            writeText(name, asmText)
        else:
            asmText = translator(name, False)
            writeText(name[:-3], asmText)
    except NameError as e:
        print(e)

if __name__  == "__main__":
    main()
