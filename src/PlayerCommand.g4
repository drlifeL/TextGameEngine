grammar PlayerCommand;

/** the start rule, begin parsing here

 * 表示匹配前一个字符串或者表达式零次或者多次
 + 表示匹配前一个字符串或者表达式一次或者多次（至少一次）
 ? 表示匹配前一个字符或子表达式零次或一次
 **/


command :  (
    'door' N               |
    'pickup'NAME           |
    'exit'                 |
    'describe'             |
    'admire' NAME          |
    'eat' NAME             |
    'attack'               |
    'status'               |
    'wield' NAME           |
    'open' NAME            |
    'help'
) + NEWLINE;


N:[0-9]+;
NAME:[a-zA-Z]+;

NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS: [ \t] -> skip;