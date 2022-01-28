// Automatically generated - do not modify!

package typescript

sealed external interface TypeAssertion : UnaryExpression {
    override val kind: SyntaxKind.TypeAssertionExpression
    val type: TypeNode
    val expression: UnaryExpression
}
