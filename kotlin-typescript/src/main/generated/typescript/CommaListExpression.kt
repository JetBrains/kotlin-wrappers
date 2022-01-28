// Automatically generated - do not modify!

package typescript

/**
 * A list of comma-separated expressions. This node is only created by transformations.
 */
sealed external interface CommaListExpression : Expression {
    override val kind: SyntaxKind.CommaListExpression
    val elements: NodeArray<Expression>
}
