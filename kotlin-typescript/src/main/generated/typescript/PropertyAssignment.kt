// Automatically generated - do not modify!

package typescript

sealed external interface PropertyAssignment : ObjectLiteralElement, JSDocContainer {
    override val kind: SyntaxKind.PropertyAssignment
    override val parent: ObjectLiteralExpression
    override val name: PropertyName
    val questionToken: QuestionToken?
    val exclamationToken: ExclamationToken?
    val initializer: Expression
}
