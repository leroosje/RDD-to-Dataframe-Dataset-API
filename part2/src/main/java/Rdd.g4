grammar Rdd;

fragment DIGIT : ('0'..'9');
fragment LETTER : ('a'..'z') | ('A'..'Z') | '_';

//lexer
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip;
SC : 'sc';
VAL : 'val';
IF : 'if';
ELSE : 'else';
ASSIGN : '=';
DOT : '.';
LB : '{';
RB : '}';
LP : '(';
RP : ')';
COMMA : ',';
SEMICOLON : ';';
ARROW : '=>';
OP : '+' | '-' | '*' | '%';
COMP : '==' | '<' | '>' | '!=' | '>=' | '<=';
ID : LETTER (LETTER | DIGIT)*;
NUMBER : DIGIT+;

//parser
start : SC DOT 'range' LP NUMBER COMMA NUMBER RP mapops DOT 'collect' LP RP
;

mapops : mapops DOT 'map' LP udf RP
       |
;

udf : ID ARROW expression
;

expression : simpleexpression
           | LB complexexpression RB
;

simpleexpression : pureexpression
                 | LP tupleexpression RP
;

tupleexpression : pureexpression COMMA pureexpression
                | tupleexpression COMMA pureexpression
;

complexexpression : simpleexpression
                  | assignmentexpressions SEMICOLON simpleexpression
;

assignmentexpressions : assignmentexpression
                      | assignmentexpressions SEMICOLON assignmentexpression
;

assignmentexpression : VAL ID ASSIGN pureexpression
;

pureexpression : ID
               | ID DOT ID
               | NUMBER
               | LP pureexpression RP
               | pureexpression OP pureexpression
               | IF LP comparisonexpression RP pureexpression ELSE pureexpression
;

comparisonexpression : pureexpression COMP pureexpression
;
