El proyecto 11 se realizó utilizando la herramienta antlr4, versión 4.7. Usando java 1.8.0_131.

Los ficheros .java que no se generan automáticamente por antlr4 son VmVisitor.java, SymbolInfo.java, SymbolTable.java, GlobalTable.java, LocalTable.java, VmWriter.java y MainVmCompiler.java. Este último es el que contiene el método main.

Al ejecutar el programa se debe pasar como argumento todos los ficheros ".jack" a compilar, y el programa generará un archivo ".vm" por cada uno de ellos.
