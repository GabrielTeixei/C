# Just ensure every inconsistent old executable disappears
antlr4-clean

antlr4-clean -python

# Compile the main grammar
antlr4-build

#Compile the secondary grammar, for the interpreter
antlr4-build -python Pdraw2.g4
