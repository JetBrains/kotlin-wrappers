// Automatically generated - do not modify!

package typescript.ast

external interface AsExpression :
    Expression,
    AssertionExpression {
    override val kind: SyntaxKind.AsExpression
    val expression: Expression
    val type: TypeNode
}
