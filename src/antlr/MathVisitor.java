// Generated from Math.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MathParser#compileUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompileUnit(MathParser.CompileUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link MathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(MathParser.InfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(MathParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link MathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(MathParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link MathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(MathParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link MathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(MathParser.ParensExprContext ctx);
}