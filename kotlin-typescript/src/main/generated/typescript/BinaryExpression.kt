// Automatically generated - do not modify!

package typescript

sealed external interface BinaryExpression : Expression, Declaration {
    override val kind: SyntaxKind.BinaryExpression
    val left: Expression
    val operatorToken: BinaryOperatorToken
    val right: Expression
}
