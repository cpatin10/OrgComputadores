El proyecto 10 se realizó utilizando la herramienta antlr4, versión 4.7. Usando java 1.8.0_131.

Los ficheros que no se generan automáticamente por antlr4 son XmlVisitor.java y MainXmlCompiler.java. Este último es el que contiene el método main.

Al ejecutar el programa se generan dos archivos xml. El primero, lleva "Tc" al final del nombre y es el fichero de tokens. El segundo, lleva "C" al final del nombre y es el fichero con el xml completo (incluye el recorrido del árbol). Estas extenciones al nombre son para facilitar la comparación con los ficheros dados por nand2Tetris.
