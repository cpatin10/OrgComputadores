/** 
 * Definición de la gramática para el lenguaje Jack
 */

grammar GrammarJack;

classAxiom      : 'class' className '{'  (classVarDec)* (subroutineDec)* '}'
                ;

classVarDec     : ('static' | 'field') type varName (',' varName)* ';'
                ;

type            : 'int'         # entero
                | 'char'        # caracter
                | 'boolean'     # booleano
                | className     # nombreClase
                ;

subroutineDec   : ('constructor' | 'function' | 'method') ('void' | type) subroutineName'(' parameterList ')' subroutineBody
                ;

parameterList   : ((type varName)(',' type varName)*)?
                ;

subroutineBody  : '{' (varDec)* statements '}'
                ;

varDec		    : 'var' type varName(','varName)* ';'
                ;


className       : IDENTIFIER
                ;

subroutineName  : IDENTIFIER
                ;

varName         : IDENTIFIER
                ;

statements      : (statement)*
                ;
    
statement       : letStatement      # operationLet
                | ifStatement       # operationIf
                | whileStatement    # operationWhile
                | doStatement       # operationDo
                | returnStatement   # operationReturn
                ;

letStatement    : 'let' varName ('[' expression ']')? '=' expression ';'
                ;

ifStatement     : 'if' '(' expression ')' '{' statements '}' ('else' '{' statements '}')?
                ;

whileStatement  : 'while' '(' expression ')' '{' statements'}'
                ;

doStatement     : 'do' subroutineCall ';'
                ;

returnStatement : 'return' (expression)? ';'
                ;

expression      : term (operator term)*
                ;

term            : INTEGERCONSTANT       # constantInt
                | STRINGCONSTANT        # constantString
                | keywordConstant       # constantKeyword
                | varName               # variableName
                | varName'[' expression ']'     # varArray
                | subroutineCall        # subroutCall
                | '(' expression ')'    # expresionParent
                | unaryOperator term    # unaryOp
                ;

subroutineCall  : subroutineName'(' expressionList ')'     # directCall
                | (className | varName ) '.' subroutineName '(' expressionList ')'                                                 # objectCall
                ;

expressionList  : (expression (','expression)* )?
                ;

operator        : '+'       # suma
                | '-'       # resta
                | '*'       # mult
                | '/'       # division
                | '&'       # and
                | '|'       # or
                | '<'       # menor
                | '>'       # mayor
                | '='       # igual
                ;

unaryOperator   : '-'       # neg
                | '~'       # not
                ;

keywordConstant : 'true'     # true
                | 'false'    # false
                | 'null'     # null
                | 'this'     # this
                ;


INTEGERCONSTANT
        : (('1'..'9')('0'..'9')* | '0')
        ;

STRINGCONSTANT
        : '"' .*?  '"'
        ;

KW1 : 'class'
    ;
KW2 : 'constructor'
    ;
KW3 : 'function'
    ;
KW4 : 'method'
    ;
KW5 : 'field'
    ;
KW6 : 'static'
    ;
KW7 : 'var'
    ;
KW8 : 'int'
    ;
KW9 : 'char'
        ;
KW10    : 'boolean'
        ;
KW11    : 'void'
        ;
KW12    : 'true'
        ;
KW13    : 'false'
        ;
KW14    : 'null'
        ;
KW15    : 'this'
        ;
KW16    : 'let'
        ;
KW17    : 'do'
        ;
KW18    : 'if'
        ;
KW19    : 'else'
        ;
KW20    : 'while'
        ;
KW21    : 'return'
        ;


SIM1    : '{'
        ;
SIM2    : '}'
        ;
SIM3    : '('
        ;
SIM4    : ')'
        ;
SIM5    : '['
        ;
SIM6    : ']'
        ;
SIM7    : '.'
        ;
SIM8    : ','
        ;
SIM9    : ';'
        ;
SIM10   : '+'
        ;
SIM11   : '-'
        ;
SIM12   : '*'
        ;
SIM13   : '/'
        ;
SIM14   : '&'
        ;
SIM15   : '|'
        ;
SIM16   : '<'
        ;
SIM17   : '>'
        ;
SIM18   : '='
        ;
SIM19   : '~'
        ;

IDENTIFIER
        : ('a'..'z'|'A'..'Z')('_'|'a'..'z'|'A'..'Z'|'0'..'9')*
        ;


WS  : (' '
    | '\t'
    | '\r'
    | '\n'
    | '\f'
    ) -> skip
    ;

LINE_COMMENT
    : '//' .*? '\r'? '\n' -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;
