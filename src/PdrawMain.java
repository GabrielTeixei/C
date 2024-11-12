import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class PdrawMain {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java PdrawMain <input file>");
            System.exit(1);
        }

        String inputFile = args[0];
        InputStream is = new FileInputStream(inputFile);

        CharStream input = CharStreams.fromStream(is);
        PdrawLexer lexer = new PdrawLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PdrawParser parser = new PdrawParser(tokens);
        ParseTree tree = parser.program();

        // Ensure that the root of the parse tree is a ProgramContext
        if (!(tree instanceof PdrawParser.ProgramContext)) {
            throw new IllegalStateException("ERROR: Invalid parse tree root type.");
        }

        // Cast the ParseTree object to ProgramContext
        PdrawParser.ProgramContext programContext = (PdrawParser.ProgramContext) tree;

        NewSemantyc semantic_Check = new NewSemantyc();
        semantic_Check.visitProgram(programContext);
    }
}