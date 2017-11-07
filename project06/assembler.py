#!/usr/bin/python3

jump = {"null": "000", "JGT": "001", "JEQ": "010", "JGE": "011", "JLT": "100", "JNE": "101", "JLE": "110", "JMP": "111"}
dest = {"null": "000", "M": "001", "D": "010", "MD": "011", "A": "100", "AM": "101", "AD": "110", "AMD": "111"}
comp = {"0": "0101010", "1": "0111111", "-1": "0111010", "D": "0001100", "A": "0110000", "!D": "0001101", "!A": "0110011", "-D": "0001111", "-A": "0110011", "D+1": "0011111", "A+1": "0110111", "D-1": "0001110", "A-1": "0110010", "D+A": "0000010", "A+D": "0000010", "D-A": "0010011", "A-D": "0000111", "D&A": "0000000", "A&D": "0000000", "D|A": "0010101", "A|D": "0010101", "M": "1110000", "!M": "1110001", "-M": "1110011", "M+1": "1110111", "M-1": "1110010", "D+M": "1000010", "M+D": "1000010", "D-M": "1010011", "M-D": "1000111", "D&M": "1000000", "M&D": "1000000", "D|M": "1010101", "M|D": "1010101"}
symbol = {"R0": "000000000000000", "R1": "000000000000001", "R2": "000000000000010", "R3": "000000000000011", "R4": "000000000000100", "R5": "000000000000101", "R6": "000000000000110", "R7": "000000000000111", "R8": "000000000001000", "R9": "000000000001001", "R10": "00000000001010", "R11": "000000000001011", "R12": "000000000001100", "R13": "000000000001101", "R14": "000000000001110", "R15": "000000000001111", "SP": "000000000000000", "LCL": "000000000000001", "ARG": "000000000000010", "THIS": "000000000000011", "THAT": "000000000000100", "SCREEN": "100000000000000", "KBD": "110000000000000"}



def toBinary(number, line):
    if number > (2**15)-1:
        raise NameError("Valor no válido" + line)
    number = bin(number)
    number = number[2:]
    numLen = 15 - len(number)
    return ("0"*numLen) + str(number)
    

def firstReadText(name):
    list = []
    lineCont = 0
    archive = open(name, "r")
    for line in archive.readlines():
        lineCont += 1
        line = line.strip()
        line = line.replace(" ", "")
        temp = line.split("//")
        line = temp[0]
        if line != '':
            if line[0] == '(':
                if line.find('(', 1) == -1 and line[-1] == ')' and line.find(')') == len(line)-1:
                    key = line[1:-1]
                    if key not in symbol:
                        symbol[key] = toBinary(len(list), lineCont)
                    else:
                        raise NameError("SyntaxError: two labels with same name: " + str(lineCont))
                else:
                    raise NameError("SyntaxError: at line: " + str(lineCont))
            else:
                list.append((line, lineCont))
    return list

    
#verificar que la línea enviada se encuentre en el diccionario especificado, si sí escribir binario correspondiente, si no lanzar error
def dictVerify(dictionary, line, lineNum):
    if line in dictionary:
        return dictionary[line]
    raise NameError("Error de sintáxis en comando C: " + lineNum)

    
#verificar si tiene = si sí dictVerify(dest, linea hasta el =), sino verificar si tiene ; si sí dictVerify(jump, linea desde el ;). Todo lo demás se envía a comp(). Tener en cuenta el orden en que se sobreescribe el nuevo string para que el binario quede en el debido orden.
def commandC(line, lineNum):
    binary = ""
    #for dest
    eqIndex = line.find('=')
    if eqIndex != -1:
        binary = binary + dictVerify(dest, line[:eqIndex], lineNum)
        line = line[eqIndex+1:]
    else:
        binary = binary + dest["null"]    
    #for jump
    jmpIndex = line.find(';')
    if jmpIndex != -1:
        binary = binary + dictVerify(jump, line[jmpIndex+1:], lineNum)
        line = line[:jmpIndex]
    else:
        binary = binary + jump["null"]
    #for comp
    binary = dictVerify(comp, line, lineNum) + binary
    return binary


#verificar que si empieza con número todo sea un número (escribir el correspondiente binario), sino verificar que la etiqueta se encuentre ya en symbol si ya está escribir binario correspondiente, sino verificar que sea etiqueta válida si sí guardar en symbol, si no lanzar error (crear método para la verificación de etiquetas correctas y usarlo, también en firstTextRead)
def commandA(line, contSymbol, lineNum):
    if line.isdigit():
        number = int(line)
        number = toBinary(number, lineNum)
        return number, contSymbol
    if line[0].isdigit():
        raise NameError("Etiqueta (variable) no válida, en línea " + lineNum)
    for i in line:
        a = ord(i)
        if a not in range(65, 91) and a not in range(97, 123) and a not in range(48, 58) and a!=36 and a!=46 and a!=58 and a!=95:      
            raise NameError("Etiqueta (variable) no válida, en línea " + lineNum)
    if line not in symbol:
        binNum = toBinary(contSymbol, lineNum)
        symbol[line] = binNum
        contSymbol += 1
        return binNum, contSymbol
    return symbol[line], contSymbol

    
#verificar si tiene arroba y si está en la primera posición, si sí mandar a commandA(), sino, si tiene arroba error, sino mandar a commandC()
def command(line, contSymbol, lineNum):
    line = str(str(line))
    if line[0] == '@':
        line = line[1:]
        if line == "":
            raise NameError("Syntax Error, comando A vacío")
        binLine, contSymbol = commandA(line, contSymbol, lineNum)
        return "0" + binLine, contSymbol
    else:
        binLine = commandC(line, lineNum)
        return "111" + binLine, contSymbol
    

#hacer for para cada posición en list mandar a command()
def secondReadText(list):
    contSymbol = 16
    binText = ""
    for i, val in enumerate(list):
        binLine, contSymbol = command(str(val[0]), contSymbol, str(val[1]))
        binText = binText + binLine + "\n"
    return binText


def writeText(name, text):
    hackFile = open(name[:-3] + "hack", "w")
    hackFile.write(text)
    

def main():
    try:
        textName = input("Ingrese el nombre del fichero: ")
        if textName[-4:] != ".asm":
            raise NameError("El archivo no es extensión .asm")
        textList = firstReadText(textName)
        binaryText = secondReadText(textList)
        writeText(textName, binaryText)
    except NameError as e:
        print(e)

if __name__  == "__main__":
    main()




