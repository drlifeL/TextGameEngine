grammar GameMap;


gameMap: (rd |
          roomLink |
          roomItem |
          roomExit |
          roomEnter )+ EOF
    ;

rd: ID # roomDeclaration
    ;

roomName: ID
    ;

roomLink: roomName '->' roomName
    ;

roomItem: roomName '[' item ( ',' item)* ']'
    ;

roomExit: roomName 'exit'
    ;

roomEnter: roomName 'enter'
    ;

item: (
        wieldable        |
        food             |
        valuable         |
        opener           |
        openable         |
        monster
);

wieldable:  'axe'   ':' ID ':' ID    # axe
         |  'sword' ':' ID ':' ID    # sword
;



food: 'mead'       ':' ID  # mead
    | 'bread'      ':' ID  # bread
    | 'roastboar'  ':' ID  # roastboar
;

valuable: 'chalice'      ':' ID # chalice
        | 'mobile'       ':' ID # mobile
        | 'coin'         ':' ID # coin
        | 'goldBars'     ':' ID # goldBars
        | 'ring'         ':' ID # ring
        | 'moneyBag'     ':' ID # moneyBag
        | 'jewel'        ':' ID # jewel
;

opener: 'lockPick' # lockPick
      | 'key'      # key
;

openable: 'treasireChest' ':' valuable # treasireChest
        | 'warChest' ':' wieldable     # warChest
;

monster: 'ogre'   ':' ID ':' ID ':' ID  # ogre
       | 'Zombie' ':' ID ':' ID ':' ID  # zombie
       | 'Dragon' ':' ID ':' ID ':' ID  # dragon

;

// Tokens
ID: [0-9]+;
NAME: [a-zA-Z]+;
COMMENT: '--' ~[\r\n]* -> skip;
WS: [ \t\n] -> skip;
