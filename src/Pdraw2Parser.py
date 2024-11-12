# Generated from Pdraw2.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,41,169,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        1,0,5,0,30,8,0,10,0,12,0,33,9,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,3,1,45,8,1,1,2,1,2,1,2,1,2,1,2,3,2,52,8,2,1,3,1,3,1,3,1,
        3,1,3,1,3,1,3,1,4,1,4,1,5,1,5,1,5,1,5,3,5,67,8,5,1,6,1,6,1,6,1,6,
        1,6,1,6,1,6,1,6,3,6,77,8,6,1,7,1,7,1,7,1,7,1,7,5,7,84,8,7,10,7,12,
        7,87,9,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,
        1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,
        1,8,1,8,1,8,1,8,1,8,3,8,124,8,8,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,
        10,1,10,1,11,1,11,1,11,1,11,1,11,1,11,1,11,3,11,142,8,11,1,11,1,
        11,1,11,5,11,147,8,11,10,11,12,11,150,9,11,1,12,1,12,1,12,1,12,1,
        12,1,12,5,12,158,8,12,10,12,12,12,161,9,12,1,12,1,12,1,13,1,13,1,
        13,1,13,1,13,0,1,22,14,0,2,4,6,8,10,12,14,16,18,20,22,24,26,0,3,
        1,0,6,7,1,0,24,27,1,0,29,34,174,0,31,1,0,0,0,2,44,1,0,0,0,4,51,1,
        0,0,0,6,53,1,0,0,0,8,60,1,0,0,0,10,66,1,0,0,0,12,76,1,0,0,0,14,78,
        1,0,0,0,16,123,1,0,0,0,18,125,1,0,0,0,20,130,1,0,0,0,22,141,1,0,
        0,0,24,151,1,0,0,0,26,164,1,0,0,0,28,30,3,2,1,0,29,28,1,0,0,0,30,
        33,1,0,0,0,31,29,1,0,0,0,31,32,1,0,0,0,32,1,1,0,0,0,33,31,1,0,0,
        0,34,35,3,4,2,0,35,36,5,1,0,0,36,45,1,0,0,0,37,38,3,18,9,0,38,39,
        5,1,0,0,39,45,1,0,0,0,40,41,3,20,10,0,41,42,5,1,0,0,42,45,1,0,0,
        0,43,45,3,24,12,0,44,34,1,0,0,0,44,37,1,0,0,0,44,40,1,0,0,0,44,43,
        1,0,0,0,45,3,1,0,0,0,46,52,3,6,3,0,47,52,3,8,4,0,48,52,3,10,5,0,
        49,52,3,12,6,0,50,52,3,14,7,0,51,46,1,0,0,0,51,47,1,0,0,0,51,48,
        1,0,0,0,51,49,1,0,0,0,51,50,1,0,0,0,52,5,1,0,0,0,53,54,5,2,0,0,54,
        55,5,3,0,0,55,56,3,22,11,0,56,57,5,4,0,0,57,58,3,22,11,0,58,59,5,
        5,0,0,59,7,1,0,0,0,60,61,7,0,0,0,61,9,1,0,0,0,62,63,5,8,0,0,63,67,
        3,22,11,0,64,65,5,9,0,0,65,67,3,22,11,0,66,62,1,0,0,0,66,64,1,0,
        0,0,67,11,1,0,0,0,68,69,5,10,0,0,69,70,3,22,11,0,70,71,5,11,0,0,
        71,77,1,0,0,0,72,73,5,12,0,0,73,74,3,22,11,0,74,75,5,11,0,0,75,77,
        1,0,0,0,76,68,1,0,0,0,76,72,1,0,0,0,77,13,1,0,0,0,78,79,5,13,0,0,
        79,80,5,14,0,0,80,81,5,35,0,0,81,85,5,15,0,0,82,84,3,16,8,0,83,82,
        1,0,0,0,84,87,1,0,0,0,85,83,1,0,0,0,85,86,1,0,0,0,86,88,1,0,0,0,
        87,85,1,0,0,0,88,89,5,16,0,0,89,15,1,0,0,0,90,91,5,17,0,0,91,92,
        5,18,0,0,92,93,5,36,0,0,93,124,5,1,0,0,94,95,5,2,0,0,95,96,5,18,
        0,0,96,97,5,3,0,0,97,98,3,22,11,0,98,99,5,4,0,0,99,100,3,22,11,0,
        100,101,5,5,0,0,101,102,5,1,0,0,102,124,1,0,0,0,103,104,5,19,0,0,
        104,105,5,18,0,0,105,106,3,22,11,0,106,107,5,11,0,0,107,108,5,1,
        0,0,108,124,1,0,0,0,109,110,5,20,0,0,110,111,5,18,0,0,111,112,3,
        22,11,0,112,113,5,1,0,0,113,124,1,0,0,0,114,115,5,21,0,0,115,116,
        5,18,0,0,116,117,3,22,11,0,117,118,5,1,0,0,118,124,1,0,0,0,119,120,
        5,22,0,0,120,121,5,18,0,0,121,122,5,37,0,0,122,124,5,1,0,0,123,90,
        1,0,0,0,123,94,1,0,0,0,123,103,1,0,0,0,123,109,1,0,0,0,123,114,1,
        0,0,0,123,119,1,0,0,0,124,17,1,0,0,0,125,126,5,23,0,0,126,127,5,
        35,0,0,127,128,5,18,0,0,128,129,3,22,11,0,129,19,1,0,0,0,130,131,
        5,35,0,0,131,132,5,18,0,0,132,133,3,22,11,0,133,21,1,0,0,0,134,135,
        6,11,-1,0,135,142,5,38,0,0,136,142,5,35,0,0,137,138,5,3,0,0,138,
        139,3,22,11,0,139,140,5,5,0,0,140,142,1,0,0,0,141,134,1,0,0,0,141,
        136,1,0,0,0,141,137,1,0,0,0,142,148,1,0,0,0,143,144,10,2,0,0,144,
        145,7,1,0,0,145,147,3,22,11,3,146,143,1,0,0,0,147,150,1,0,0,0,148,
        146,1,0,0,0,148,149,1,0,0,0,149,23,1,0,0,0,150,148,1,0,0,0,151,152,
        5,28,0,0,152,153,5,3,0,0,153,154,3,26,13,0,154,155,5,5,0,0,155,159,
        5,15,0,0,156,158,3,2,1,0,157,156,1,0,0,0,158,161,1,0,0,0,159,157,
        1,0,0,0,159,160,1,0,0,0,160,162,1,0,0,0,161,159,1,0,0,0,162,163,
        5,16,0,0,163,25,1,0,0,0,164,165,3,22,11,0,165,166,7,2,0,0,166,167,
        3,22,11,0,167,27,1,0,0,0,10,31,44,51,66,76,85,123,141,148,159
    ]

class Pdraw2Parser ( Parser ):

    grammarFileName = "Pdraw2.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'position'", "'('", "','", "')'", 
                     "'down'", "'up'", "'forward'", "'backward'", "'left'", 
                     "'\\u00BA'", "'right'", "'define'", "'pen'", "'{'", 
                     "'}'", "'color'", "'='", "'orientation'", "'thickness'", 
                     "'pressure'", "'label'", "'int'", "'+'", "'-'", "'*'", 
                     "'/'", "'while'", "'=='", "'!='", "'<'", "'<='", "'>'", 
                     "'>='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "ID", "COLOR", 
                      "STRING", "NUMBER", "DIGIT", "WHITESPACE", "COMMENT" ]

    RULE_program = 0
    RULE_statement = 1
    RULE_command = 2
    RULE_position_command = 3
    RULE_pen_control = 4
    RULE_move_command = 5
    RULE_turn_command = 6
    RULE_define_command = 7
    RULE_pen_attribute = 8
    RULE_variable_declaration = 9
    RULE_assignment = 10
    RULE_expression = 11
    RULE_while_loop = 12
    RULE_condition = 13

    ruleNames =  [ "program", "statement", "command", "position_command", 
                   "pen_control", "move_command", "turn_command", "define_command", 
                   "pen_attribute", "variable_declaration", "assignment", 
                   "expression", "while_loop", "condition" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    T__29=30
    T__30=31
    T__31=32
    T__32=33
    T__33=34
    ID=35
    COLOR=36
    STRING=37
    NUMBER=38
    DIGIT=39
    WHITESPACE=40
    COMMENT=41

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Pdraw2Parser.StatementContext)
            else:
                return self.getTypedRuleContext(Pdraw2Parser.StatementContext,i)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = Pdraw2Parser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34636576708) != 0):
                self.state = 28
                self.statement()
                self.state = 33
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def command(self):
            return self.getTypedRuleContext(Pdraw2Parser.CommandContext,0)


        def variable_declaration(self):
            return self.getTypedRuleContext(Pdraw2Parser.Variable_declarationContext,0)


        def assignment(self):
            return self.getTypedRuleContext(Pdraw2Parser.AssignmentContext,0)


        def while_loop(self):
            return self.getTypedRuleContext(Pdraw2Parser.While_loopContext,0)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = Pdraw2Parser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_statement)
        try:
            self.state = 44
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2, 6, 7, 8, 9, 10, 12, 13]:
                self.enterOuterAlt(localctx, 1)
                self.state = 34
                self.command()
                self.state = 35
                self.match(Pdraw2Parser.T__0)
                pass
            elif token in [23]:
                self.enterOuterAlt(localctx, 2)
                self.state = 37
                self.variable_declaration()
                self.state = 38
                self.match(Pdraw2Parser.T__0)
                pass
            elif token in [35]:
                self.enterOuterAlt(localctx, 3)
                self.state = 40
                self.assignment()
                self.state = 41
                self.match(Pdraw2Parser.T__0)
                pass
            elif token in [28]:
                self.enterOuterAlt(localctx, 4)
                self.state = 43
                self.while_loop()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def position_command(self):
            return self.getTypedRuleContext(Pdraw2Parser.Position_commandContext,0)


        def pen_control(self):
            return self.getTypedRuleContext(Pdraw2Parser.Pen_controlContext,0)


        def move_command(self):
            return self.getTypedRuleContext(Pdraw2Parser.Move_commandContext,0)


        def turn_command(self):
            return self.getTypedRuleContext(Pdraw2Parser.Turn_commandContext,0)


        def define_command(self):
            return self.getTypedRuleContext(Pdraw2Parser.Define_commandContext,0)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_command

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCommand" ):
                listener.enterCommand(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCommand" ):
                listener.exitCommand(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommand" ):
                return visitor.visitCommand(self)
            else:
                return visitor.visitChildren(self)




    def command(self):

        localctx = Pdraw2Parser.CommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_command)
        try:
            self.state = 51
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 46
                self.position_command()
                pass
            elif token in [6, 7]:
                self.enterOuterAlt(localctx, 2)
                self.state = 47
                self.pen_control()
                pass
            elif token in [8, 9]:
                self.enterOuterAlt(localctx, 3)
                self.state = 48
                self.move_command()
                pass
            elif token in [10, 12]:
                self.enterOuterAlt(localctx, 4)
                self.state = 49
                self.turn_command()
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 5)
                self.state = 50
                self.define_command()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Position_commandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Pdraw2Parser.ExpressionContext)
            else:
                return self.getTypedRuleContext(Pdraw2Parser.ExpressionContext,i)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_position_command

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPosition_command" ):
                listener.enterPosition_command(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPosition_command" ):
                listener.exitPosition_command(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPosition_command" ):
                return visitor.visitPosition_command(self)
            else:
                return visitor.visitChildren(self)




    def position_command(self):

        localctx = Pdraw2Parser.Position_commandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_position_command)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(Pdraw2Parser.T__1)
            self.state = 54
            self.match(Pdraw2Parser.T__2)
            self.state = 55
            self.expression(0)
            self.state = 56
            self.match(Pdraw2Parser.T__3)
            self.state = 57
            self.expression(0)
            self.state = 58
            self.match(Pdraw2Parser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Pen_controlContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_pen_control

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPen_control" ):
                listener.enterPen_control(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPen_control" ):
                listener.exitPen_control(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPen_control" ):
                return visitor.visitPen_control(self)
            else:
                return visitor.visitChildren(self)




    def pen_control(self):

        localctx = Pdraw2Parser.Pen_controlContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_pen_control)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            _la = self._input.LA(1)
            if not(_la==6 or _la==7):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Move_commandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(Pdraw2Parser.ExpressionContext,0)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_move_command

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMove_command" ):
                listener.enterMove_command(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMove_command" ):
                listener.exitMove_command(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMove_command" ):
                return visitor.visitMove_command(self)
            else:
                return visitor.visitChildren(self)




    def move_command(self):

        localctx = Pdraw2Parser.Move_commandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_move_command)
        try:
            self.state = 66
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.enterOuterAlt(localctx, 1)
                self.state = 62
                self.match(Pdraw2Parser.T__7)
                self.state = 63
                self.expression(0)
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 2)
                self.state = 64
                self.match(Pdraw2Parser.T__8)
                self.state = 65
                self.expression(0)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Turn_commandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(Pdraw2Parser.ExpressionContext,0)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_turn_command

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTurn_command" ):
                listener.enterTurn_command(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTurn_command" ):
                listener.exitTurn_command(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTurn_command" ):
                return visitor.visitTurn_command(self)
            else:
                return visitor.visitChildren(self)




    def turn_command(self):

        localctx = Pdraw2Parser.Turn_commandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_turn_command)
        try:
            self.state = 76
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [10]:
                self.enterOuterAlt(localctx, 1)
                self.state = 68
                self.match(Pdraw2Parser.T__9)
                self.state = 69
                self.expression(0)
                self.state = 70
                self.match(Pdraw2Parser.T__10)
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 2)
                self.state = 72
                self.match(Pdraw2Parser.T__11)
                self.state = 73
                self.expression(0)
                self.state = 74
                self.match(Pdraw2Parser.T__10)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Define_commandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(Pdraw2Parser.ID, 0)

        def pen_attribute(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Pdraw2Parser.Pen_attributeContext)
            else:
                return self.getTypedRuleContext(Pdraw2Parser.Pen_attributeContext,i)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_define_command

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDefine_command" ):
                listener.enterDefine_command(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDefine_command" ):
                listener.exitDefine_command(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDefine_command" ):
                return visitor.visitDefine_command(self)
            else:
                return visitor.visitChildren(self)




    def define_command(self):

        localctx = Pdraw2Parser.Define_commandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_define_command)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(Pdraw2Parser.T__12)
            self.state = 79
            self.match(Pdraw2Parser.T__13)
            self.state = 80
            self.match(Pdraw2Parser.ID)
            self.state = 81
            self.match(Pdraw2Parser.T__14)
            self.state = 85
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 7995396) != 0):
                self.state = 82
                self.pen_attribute()
                self.state = 87
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 88
            self.match(Pdraw2Parser.T__15)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Pen_attributeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COLOR(self):
            return self.getToken(Pdraw2Parser.COLOR, 0)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Pdraw2Parser.ExpressionContext)
            else:
                return self.getTypedRuleContext(Pdraw2Parser.ExpressionContext,i)


        def STRING(self):
            return self.getToken(Pdraw2Parser.STRING, 0)

        def getRuleIndex(self):
            return Pdraw2Parser.RULE_pen_attribute

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPen_attribute" ):
                listener.enterPen_attribute(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPen_attribute" ):
                listener.exitPen_attribute(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPen_attribute" ):
                return visitor.visitPen_attribute(self)
            else:
                return visitor.visitChildren(self)




    def pen_attribute(self):

        localctx = Pdraw2Parser.Pen_attributeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_pen_attribute)
        try:
            self.state = 123
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [17]:
                self.enterOuterAlt(localctx, 1)
                self.state = 90
                self.match(Pdraw2Parser.T__16)
                self.state = 91
                self.match(Pdraw2Parser.T__17)
                self.state = 92
                self.match(Pdraw2Parser.COLOR)
                self.state = 93
                self.match(Pdraw2Parser.T__0)
                pass
            elif token in [2]:
                self.enterOuterAlt(localctx, 2)
                self.state = 94
                self.match(Pdraw2Parser.T__1)
                self.state = 95
                self.match(Pdraw2Parser.T__17)
                self.state = 96
                self.match(Pdraw2Parser.T__2)
                self.state = 97
                self.expression(0)
                self.state = 98
                self.match(Pdraw2Parser.T__3)
                self.state = 99
                self.expression(0)
                self.state = 100
                self.match(Pdraw2Parser.T__4)
                self.state = 101
                self.match(Pdraw2Parser.T__0)
                pass
            elif token in [19]:
                self.enterOuterAlt(localctx, 3)
                self.state = 103
                self.match(Pdraw2Parser.T__18)
                self.state = 104
                self.match(Pdraw2Parser.T__17)
                self.state = 105
                self.expression(0)
                self.state = 106
                self.match(Pdraw2Parser.T__10)
                self.state = 107
                self.match(Pdraw2Parser.T__0)
                pass
            elif token in [20]:
                self.enterOuterAlt(localctx, 4)
                self.state = 109
                self.match(Pdraw2Parser.T__19)
                self.state = 110
                self.match(Pdraw2Parser.T__17)
                self.state = 111
                self.expression(0)
                self.state = 112
                self.match(Pdraw2Parser.T__0)
                pass
            elif token in [21]:
                self.enterOuterAlt(localctx, 5)
                self.state = 114
                self.match(Pdraw2Parser.T__20)
                self.state = 115
                self.match(Pdraw2Parser.T__17)
                self.state = 116
                self.expression(0)
                self.state = 117
                self.match(Pdraw2Parser.T__0)
                pass
            elif token in [22]:
                self.enterOuterAlt(localctx, 6)
                self.state = 119
                self.match(Pdraw2Parser.T__21)
                self.state = 120
                self.match(Pdraw2Parser.T__17)
                self.state = 121
                self.match(Pdraw2Parser.STRING)
                self.state = 122
                self.match(Pdraw2Parser.T__0)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Variable_declarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(Pdraw2Parser.ID, 0)

        def expression(self):
            return self.getTypedRuleContext(Pdraw2Parser.ExpressionContext,0)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_variable_declaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable_declaration" ):
                listener.enterVariable_declaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable_declaration" ):
                listener.exitVariable_declaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariable_declaration" ):
                return visitor.visitVariable_declaration(self)
            else:
                return visitor.visitChildren(self)




    def variable_declaration(self):

        localctx = Pdraw2Parser.Variable_declarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_variable_declaration)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 125
            self.match(Pdraw2Parser.T__22)
            self.state = 126
            self.match(Pdraw2Parser.ID)
            self.state = 127
            self.match(Pdraw2Parser.T__17)
            self.state = 128
            self.expression(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(Pdraw2Parser.ID, 0)

        def expression(self):
            return self.getTypedRuleContext(Pdraw2Parser.ExpressionContext,0)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignment" ):
                return visitor.visitAssignment(self)
            else:
                return visitor.visitChildren(self)




    def assignment(self):

        localctx = Pdraw2Parser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 130
            self.match(Pdraw2Parser.ID)
            self.state = 131
            self.match(Pdraw2Parser.T__17)
            self.state = 132
            self.expression(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(Pdraw2Parser.NUMBER, 0)

        def ID(self):
            return self.getToken(Pdraw2Parser.ID, 0)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Pdraw2Parser.ExpressionContext)
            else:
                return self.getTypedRuleContext(Pdraw2Parser.ExpressionContext,i)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpression" ):
                return visitor.visitExpression(self)
            else:
                return visitor.visitChildren(self)



    def expression(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = Pdraw2Parser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 22
        self.enterRecursionRule(localctx, 22, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 141
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [38]:
                self.state = 135
                self.match(Pdraw2Parser.NUMBER)
                pass
            elif token in [35]:
                self.state = 136
                self.match(Pdraw2Parser.ID)
                pass
            elif token in [3]:
                self.state = 137
                self.match(Pdraw2Parser.T__2)
                self.state = 138
                self.expression(0)
                self.state = 139
                self.match(Pdraw2Parser.T__4)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 148
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = Pdraw2Parser.ExpressionContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                    self.state = 143
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 144
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 251658240) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 145
                    self.expression(3) 
                self.state = 150
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class While_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def condition(self):
            return self.getTypedRuleContext(Pdraw2Parser.ConditionContext,0)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Pdraw2Parser.StatementContext)
            else:
                return self.getTypedRuleContext(Pdraw2Parser.StatementContext,i)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_while_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile_loop" ):
                listener.enterWhile_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile_loop" ):
                listener.exitWhile_loop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhile_loop" ):
                return visitor.visitWhile_loop(self)
            else:
                return visitor.visitChildren(self)




    def while_loop(self):

        localctx = Pdraw2Parser.While_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_while_loop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 151
            self.match(Pdraw2Parser.T__27)
            self.state = 152
            self.match(Pdraw2Parser.T__2)
            self.state = 153
            self.condition()
            self.state = 154
            self.match(Pdraw2Parser.T__4)
            self.state = 155
            self.match(Pdraw2Parser.T__14)
            self.state = 159
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 34636576708) != 0):
                self.state = 156
                self.statement()
                self.state = 161
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 162
            self.match(Pdraw2Parser.T__15)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(Pdraw2Parser.ExpressionContext)
            else:
                return self.getTypedRuleContext(Pdraw2Parser.ExpressionContext,i)


        def getRuleIndex(self):
            return Pdraw2Parser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = Pdraw2Parser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 164
            self.expression(0)
            self.state = 165
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 33822867456) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 166
            self.expression(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[11] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expression_sempred(self, localctx:ExpressionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 2)
         




