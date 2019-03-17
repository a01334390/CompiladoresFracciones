// Generated from Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(HelloParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(HelloParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(HelloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(HelloParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(HelloParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(HelloParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(HelloParser.FractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(HelloParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(HelloParser.DigitContext ctx);
}