import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			CharStream input = CharStreams.fromString("1%2 + 1%5 \n");
			HelloLexer lexer = new HelloLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			HelloParser parser = new HelloParser(tokens);
			ParseTree tree = parser.prog(); 
			System.out.println(tree.toStringTree(parser)); 
			ParseTreeWalker walker = new ParseTreeWalker();
			MiListener listener = new MiListener();
			walker.walk(listener, tree);
			}
			catch(Exception e) {
				System.out.println("Error: "+e);
			}
	}
}
