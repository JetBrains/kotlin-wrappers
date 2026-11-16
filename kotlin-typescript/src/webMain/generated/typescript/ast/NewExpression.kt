// Automatically generated - do not modify!

package typescript.ast

external interface NewExpression :
    PrimaryExpression,
    Declaration,
    HasTypeArguments,
    SpreadElementParent,
    CallLikeExpression,
    IsCallOrNewExpressionResultPredicate {
    override val kind: SyntaxKind.NewExpression
    val expression: LeftHandSideExpression
    val typeArguments: NodeArray<TypeNode>?
    val arguments: NodeArray<Expression>?
}
