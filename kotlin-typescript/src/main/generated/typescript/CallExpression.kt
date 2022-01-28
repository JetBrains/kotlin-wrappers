// Automatically generated - do not modify!

package typescript

sealed external interface CallExpression : LeftHandSideExpression, Declaration {
    override val kind: SyntaxKind.CallExpression
    val expression: LeftHandSideExpression
    val questionDotToken: QuestionDotToken?
    val typeArguments: NodeArray<TypeNode>?
    val arguments: NodeArray<Expression>
}
