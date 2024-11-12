grammar Pdraw2;

program: statement* ;

statement: command ';'
         | variable_declaration ';'
         | assignment ';'
         | while_loop ;

command: position_command
        | pen_control
        | move_command
        | turn_command
        | define_command ;

position_command: 'position' '(' expression ',' expression ')' ;

pen_control: 'down'
           | 'up' ;

move_command: 'forward' expression
            | 'backward' expression ;

turn_command: 'left' expression 'º'
            | 'right' expression 'º' ;

define_command: 'define' 'pen' ID '{' pen_attribute* '}' ;

pen_attribute: 'color' '=' COLOR ';'
             | 'position' '=' '(' expression ',' expression ')' ';'
             | 'orientation' '=' expression 'º' ';'
             | 'thickness' '=' expression ';'
             | 'pressure' '=' expression ';'
             | 'label' '=' STRING ';' ;

variable_declaration: 'int' ID '=' expression ;

assignment: ID '=' expression ;

expression: NUMBER
          | ID
          | expression ('+' | '-' | '*' | '/') expression
          | '(' expression ')' ;

while_loop: 'while' '(' condition ')' '{' statement* '}' ;

condition: expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression ;

ID: [a-zA-Z][a-zA-Z0-9]* ;

COLOR: [a-zA-Z]+ ;

STRING: '"' (~[\r\n"] | '""')* '"' ;

NUMBER: '-'? DIGIT+ ('.' DIGIT+)? ;

DIGIT: [0-9] ;

WHITESPACE: [ \t\r\n]+ -> skip ;

COMMENT: '%' ~[\r\n]* -> skip ;
