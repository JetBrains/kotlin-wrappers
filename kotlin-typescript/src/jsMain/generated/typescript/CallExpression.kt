// Automatically generated - do not modify!

package typescript

sealed external interface CallExpression : LeftHandSideExpression, Declaration, HasTypeArguments, SpreadElementParent,
    CallLikeExpression, FlowArrayMutationNode, IsCallOrNewExpressionResultPredicate {
    override val kind: SyntaxKind.CallExpression
    val expression: LeftHandSideExpression
    val questionDotToken: QuestionDotToken?
    val typeArguments: NodeArray<TypeNode>?
    val arguments: NodeArray<Expression>
}
