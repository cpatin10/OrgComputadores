#!/usr/bin/python3

import sys

memSegment = {"stack": 256, "static": 16, "temp": 5, "pointer": 3}
heapSegment = {"local": 1, "argument": 2, "this": 3, "that": 4}
binaryOp = {"add": "+", "sub": "-", "and": "&", "or": "|"}
unitaryOp = {"neg": "-", "not": "!"}
compOp = {"eq", "lt", "gt"}

#Desplaza SP a la siguiente posición de memoria
def incSP():
    code = "\n" + "@SP" + "\n" + "M=M+1"
    return code

#Desplaza SP a la posición de memoria anterior
def decSP():
    code = "\n" + "@SP" + "\n" + "M=M-1"
    return code

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

#Hace pop de lo que hay en la posición de memoria anteriormente apuntada por SP y desplaza SP a la posición de memoria anterior
def popD():
    code = decSP() + saveVal()
    return code

#Hace pop de la pila y almacena el dato en la posición indicada del segmento de memoria indicado, si se desea acceder a los segmentos del heap el tercer parámetro es true
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

#Hace push de lo que hay en D en la posición actual del stack y desplaza el SP a la siguiente posición de memoria
def pushD():
    code = changeVal("SP") + incSP()
    return code

#Hace push del valor constante dado (index) en la posición actual del stack y desplaza el SP a la siguiente posición de memoria
def pushConstant(index):
    code = setConst(index, "A") + pushD()
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

#Lee una línea del código en el lenguaje de la máquina virtual y lo traduce a assembler
def lineTranslator(line, jmpCount, lineCount):
    words = line.split(" ")
    wordsCount = len(words)
    if wordsCount == 3 and words[2].isdigit():
        if words[0] == "pop":
            if words[1] in memSegment:
                return popMem(words[1], words[2], False), jmpCount
            elif words[1] in heapSegment:
                return popMem(words[1], words[2], True), jmpCount
        elif words[0] == "push":
            if words[1] in memSegment:
                return pushMem(words[1], words[2], False), jmpCount
            elif words[1] in heapSegment:
                return pushMem(words[1], words[2], True), jmpCount
            elif words[1] == "constant":
                return pushConstant(words[2]), jmpCount
    elif wordsCount == 1:
        if words[0] in binaryOp:
            return binaryOperation(binaryOp[words[0]]), jmpCount
        elif words[0] in unitaryOp:
            return unitaryOperation(unitaryOp[words[0]]), jmpCount
        elif words[0] in compOp:
            return compOperation(words[0], jmpCount)
    raise NameError("Error de argunmentos en la línea " + str(lineCount))

def infiniteLoop():
    code = "\n" + "(END)" + "\n" + "@END" + "\n" + "0;JMP"
    return code

#Lee el texto dado en el lenguaje de la máquina virtual y va generando el código en assembler traduciendo línea por línea
def translator(textName):
    jmpCount = 0
    lineCount = 0
    archive = open(textName, "r")
    asmText = ""
    for line in archive.readlines():
        lineCount += 1
        commIndex = line.find("//")
        if commIndex != -1:
            line = line[:commIndex]
        line = line.strip()
        if line != "":
            asmTemp, jmpCount = lineTranslator(line, jmpCount, lineCount)
            asmText = asmText + asmTemp
    asmText = asmText + infiniteLoop()
    return asmText

#Crea un nuevo fichero de extensión .asm a partir del nombre dado, y escribe en él el texto designado
def writeText(name, text):
    hackFile = open(name + "asm", "w")
    hackFile.write(text)

#Programa para traducir un archivo en el lenguaje de máquina virtual a assembler
def main():
    try:
        if len(sys.argv) == 2:
            textName = sys.argv[1]
        else:
            raise NameError("El archivo se pasa como parámetro del programa")
        #textName = input("Ingrese el nombre del fichero: ")
        if textName[-3:] != ".vm":
            raise NameError("El fichero no es extensión .vm")
        asmText = translator(textName)
        writeText(textName[:-2], asmText)
    except NameError as e:
        print(e)

if __name__  == "__main__":
    main()

