// Automatically generated - do not modify!

package typescript.ast

external interface TypeAssertion :
    UnaryExpression,
    AssertionExpression {
    override val kind: SyntaxKind.TypeAssertionExpression
    val type: TypeNode
    val expression: UnaryExpression
}
