import sys
from io import FileIO
from antlr4 import InputStream, CommonTokenStream
from Pdraw2Lexer import Pdraw2Lexer
from Pdraw2Parser import Pdraw2Parser
from Interpreter import Interpreter

def main(argv):
    with open(argv[1], 'r') as file:
        input_stream = InputStream(file.read())
    lexer = Pdraw2Lexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = Pdraw2Parser(stream)
    tree = parser.program()
    
    visitor = Interpreter()
    visitor.visit(tree)

if __name__ == '__main__':
    main(sys.argv)
