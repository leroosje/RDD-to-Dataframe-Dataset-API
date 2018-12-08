// Generated from /Users/jordan/Desktop/512/project-part2/src/main/java/Rdd.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RddParser}.
 */
public interface RddListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RddParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(RddParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(RddParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link RddParser#mapops}.
	 * @param ctx the parse tree
	 */
	void enterMapops(RddParser.MapopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#mapops}.
	 * @param ctx the parse tree
	 */
	void exitMapops(RddParser.MapopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RddParser#udf}.
	 * @param ctx the parse tree
	 */
	void enterUdf(RddParser.UdfContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#udf}.
	 * @param ctx the parse tree
	 */
	void exitUdf(RddParser.UdfContext ctx);
	/**
	 * Enter a parse tree produced by {@link RddParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RddParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RddParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RddParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleexpression(RddParser.SimpleexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleexpression(RddParser.SimpleexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RddParser#tupleexpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleexpression(RddParser.TupleexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#tupleexpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleexpression(RddParser.TupleexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RddParser#complexexpression}.
	 * @param ctx the parse tree
	 */
	void enterComplexexpression(RddParser.ComplexexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#complexexpression}.
	 * @param ctx the parse tree
	 */
	void exitComplexexpression(RddParser.ComplexexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RddParser#assignmentexpressions}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpressions(RddParser.AssignmentexpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#assignmentexpressions}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpressions(RddParser.AssignmentexpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RddParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(RddParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(RddParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RddParser#pureexpression}.
	 * @param ctx the parse tree
	 */
	void enterPureexpression(RddParser.PureexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#pureexpression}.
	 * @param ctx the parse tree
	 */
	void exitPureexpression(RddParser.PureexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RddParser#comparisonexpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonexpression(RddParser.ComparisonexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RddParser#comparisonexpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonexpression(RddParser.ComparisonexpressionContext ctx);
}