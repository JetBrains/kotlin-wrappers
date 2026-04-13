// Automatically generated - do not modify!

package typescript

external interface ElementAccessExpression :
    MemberExpression,
    Declaration,
    JSDocContainer,
    FlowContainer,
    HasJSDoc,
    DeclarationName,
    BindingOrAssignmentElementTarget,
    AccessExpression {
    override val kind: SyntaxKind.ElementAccessExpression
    val expression: LeftHandSideExpression
    val questionDotToken: QuestionDotToken?
    val argumentExpression: Expression
}
