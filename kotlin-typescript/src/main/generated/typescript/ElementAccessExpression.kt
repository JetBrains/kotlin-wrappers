// Automatically generated - do not modify!

package typescript

sealed external interface ElementAccessExpression : MemberExpression, Union.ElementAccessExpression_ {
    override val kind: SyntaxKind.ElementAccessExpression
    val expression: LeftHandSideExpression
    val questionDotToken: QuestionDotToken?
    val argumentExpression: Expression
}
