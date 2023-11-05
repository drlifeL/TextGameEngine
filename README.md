# 项目简介
这是一个基于 antlr4 开发的文字游戏。游戏的内容是闯迷宫，玩家的目标是找到出口房间。

## 项目运行环境
- JDK Azul Zulu Version 17.0.7
- antlr4-runtime-4.12.0

## 游戏玩法
1. 初始阶段玩家会出现在地图中的入口房间.房间内存在物品或者有几率出现怪物.
2. 游戏主要有战斗模式和探索模式。玩家进入房间后会根据概率随机进入战斗模式（当前房间有怪物的情况下）或者探索模式。
3. 在 **战斗模式** 中玩家可以装备和切换武器同怪物进行战斗,直到一方死亡。
4. 在 **探索模式** 中玩家可以探索和拾取房间内的物品,使用物品增加生命值或者信心。

## 项目特色
1. 基于面向对象的思想,自底向上通过抽象语法树,构建游戏世界。
2. 基于 java *switch case* 配合 *antlr* 的词法分析器,规则处理用户指令输入。
3. 地图自定义生成。开发者可以基于已经编写好的 *antlr* 的语法规则文件 *GameMap.g4* 文件生成地图。并在游戏入口处指定地图文件的位置,程序会自动生成对应的地图。
4. 自定义语法错误和语义错误监听器。构建地图时,若地图文件存在不符合语法规则或者语义问题,会在控制台中给出相应的提示,易于定位问题。

## 核心文件和解析类
- 程序入口 [GameEngine.java](src%2Fgameplay%2FGameEngine.java)
- 地图语法规则文件 [GameMap.g4](src%2FGameMap.g4)
- 玩家指令语法规则文件 [PlayerCommand.g4](src%2FPlayerCommand.g4)
- 地图声明文件示例 [test0.txt](lib%2Ftest0.txt)
- 自定义语法规则错误监听器 [SyntaxErrorListener.java](src%2Fprocess%2FSyntaxErrorListener.java)
- Antlr 构建RoomItem [AntlrToItem.java](src%2Fprocess%2FAntlrToItem.java) 
- Antlr 构建Room [AntlrToGameMap.java](src%2Fprocess%2FAntlrToGameMap.java)
- 构建游戏世界 [ReadWorldDataFile.java](src%2Fgameplay%2FReadWorldDataFile.java)

## 参考资料
- 非常好用的 *idea* antlr 语法解析树生成查看插件 [ANTLR v4](https://plugins.jetbrains.com/plugin/7358-antlr-v4)
- 讲的特别棒的 Antlr4 教程 [York Lassonde EECS4302 ANTLR4 Parser Generator Tutorial](https://youtube.com/playlist?list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&si=olSISHyt0pbQbYoT)