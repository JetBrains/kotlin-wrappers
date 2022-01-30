// Automatically generated - do not modify!

package typescript

sealed external interface PrefixUnaryExpression : UpdateExpression, Union.PrefixUnaryExpression_ {
    override val kind: SyntaxKind.PrefixUnaryExpression
    val operator: PrefixUnaryOperator
    val operand: UnaryExpression
}
