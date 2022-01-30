// Automatically generated - do not modify!

package typescript

sealed external interface NewExpression : PrimaryExpression, Declaration, Union.NewExpression_ {
    override val kind: SyntaxKind.NewExpression
    val expression: LeftHandSideExpression
    val typeArguments: NodeArray<TypeNode>?
    val arguments: NodeArray<Expression>?
}
