grammar Pdraw;

program : statement* EOF ;

// ------------------------------------------------------------------
// [ PDRAW ] : Possible declarations
statement : penDefinition           // 1.)
          | penDeclaration          // 2.)
          | penExecution            // 3.)
          | command                 // 4.)
          | loop                    // 5.)
          | conditional             // 6.)
          | outputCommand           // 7.)
          | inputCommand            // 8.)
          | assignment              // 9.)
          | canvasDefinition        // 10.)
          | variableDeclaration     // 11.)
          | expressionStatement     // 12.)
          | endStatement            // 13.)
          ;

// ------------------------------------------------------------------
// 1.) [ PEN ] : Basic definitions
penDefinition : 'define' 'pen' ID '{' penAttributes '}' ';' ;           
penAttributes : (penAttribute ';')* ;
penAttribute : 'color' '=' colorExpression                          
             | 'position' '=' '(' expression ',' expression ')'   
             | 'orientation' '=' degreeExpression                   
             | 'thickness' '=' expression                     
             | 'pressure' '=' expression                      
             ;

// ------------------------------------------------------------------
// 2.) [ PEN DECLARATION ] :
penDeclaration : 'pen' ID '=' 'new' ID ';'
                |'pen' ID '=' 'new' ';'
                ;

// ------------------------------------------------------------------
// 3.) [ PEN EXECUTION ] :
penExecution : ID '<-' 'execute' STRING ';' ;

// ------------------------------------------------------------------
// 4.) [ COMMAND ] :
command : penCommand 
    | drawCommand 
    | 'pause' expression (';')* 
    |  penCommand 
    | drawCommand 
    // | 'pause' expression  ('left'|'right')* ';' //aqui
    | ('forward' | 'backward' | 'left' | 'right') expression
;

penCommand : ID ('down' | 'up') ';' ;
drawCommand : ID ('forward' | 'backward' | 'left' | 'right') expression (command)*  ';' ;


// ------------------------------------------------------------------
// 5.) [ LOOP ] : 
loop : 'for' '(' variableDeclaration expression ';' ID '=' expression ')' '{' statement* '}' ';'
      | 'until' '(' expression ')' '{' statement* '}' ';';
      

// ------------------------------------------------------------------
// 6.) [ CONDITIONAL ] :
conditional : 'if' '(' expression ')' '{' statement* '}' ;

// ------------------------------------------------------------------
// 7.) [ OUTPUT COMMAND ] :
outputCommand : expression '->' 'stdout' ';' ;

// ------------------------------------------------------------------
// 8.) [ INPUT COMMAND ] :

//p1 = new PenType1;
inputCommand : ID '=' 'new' '(' STRING ')' ';' 
            | ID '=' expressionStatement
            | 'new' STRING ';';

// ------------------------------------------------------------------
// 9.) [ ASSIGNMENT ] :
assignment : ID '<-' attributeAssign (';'|',')*;
attributeAssign : 'position' ('=')* '(' expression ',' expression ')' 
                | ('orientation' | 'thickness' | 'pressure') ('=')* expression 
                | 'color' ('=')* colorExpression;

// ------------------------------------------------------------------
// 10.) [ CANVAS DEFINITION ] :
canvasDefinition : 'define' 'canvas' ID STRING '(' expression ',' expression ')' ';' ;

// ------------------------------------------------------------------
// 11.) [ VARIABLE DECLARATION ] : 
variableDeclaration : (dataType)* ID (('=' (expression | STRING))?) (',' ID (('=' (expression | STRING))?))* ';' ;
dataType : 'int' | 'real' | 'string' | 'bool' ;


// ------------------------------------------------------------------
// 12.) [ EXPRESSION STATEMENT ] :
expressionStatement : expression ';' ;

// ------------------------------------------------------------------
// 13.) [ END STATEMENT ] :
endStatement : expression '=' expression 'or' expression ';' ;


// ------------------------------------------------------------------
// EX.) [ EXPRESSIONS ] :

expression
    : expression ('+' | '-' | '*' | '/') expression   # Arithmetic      // EX1
    | ('+' | '-' | '*' | '/') expression              # Unary           // EX2
    | '(' expression ')'                              # Grouping        // EX3
    | '(' expression ',' expression')'                # Tuple           // EX4
    | expression '+' expression                       # Concatenation   // EX5
    | expression ('>'|'<') expression                 # Comparation     // EX6
    | expression ('=='|'!=') expression               # Equality        // EX7
    | degreeExpression                                # Degree          // EX8
    | NUMBER                                          # Plain           // EX9
    | STRING                                          # Strings         // EX10
    | BOOLEAN                                         # Booleans        // EX11
    | functionCall                                    # Function        // EX12
    | ID '->' ID                                      # Attribute       // EX13
    | ID                                              # Variable        // EX14
    | 'stdin' STRING                                  # Input           // EX15
    | typeCast '(' expression ')'                     # Type            // EX16
    | dataType expression                             # Data            // EX17
    ;

// ------------------------------------------------------------------
// R.) [ REST ] :

// R1.)
typeCast
    : 'real'
    | 'int'
    | 'string'
    | 'bool'
    ;

// R2.)
functionCall
    : ID '(' argumentList? ')' 
    ;

// R3.)
degreeExpression : DEGREE;                   

// R4.)
argumentList
    : expression (',' expression)* ;                 

// R5.)
colorExpression : COLOR | ID ;

// R6.)
value : expression | COLOR | DEGREE ;

// ------------------------------------------------------------------
// [ ENDING ] :

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER : [0-9]+ ;

DEGREE : NUMBER 'º' ;
COLOR : '#' HEX HEX HEX HEX HEX HEX | 'green' | 'black' | 'red' | 'yellow' | 'blue' | 'white';
fragment HEX : [0-9a-fA-F] ;

STRING : '"' ('\\' . | ~('\\'|'"'))* '"' ;
BOOLEAN : 'true' | 'false' ;

LT : '<';
WS : [ \t\r\n]+ -> skip ;
COMMENT : '%' ~[\r\n]* -> skip ;