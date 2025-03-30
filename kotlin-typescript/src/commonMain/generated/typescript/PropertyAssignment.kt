// Automatically generated - do not modify!

package typescript

sealed external interface PropertyAssignment : ObjectLiteralElement, JSDocContainer, HasJSDoc, HasExpressionInitializer,
    ObjectLiteralElementLike, VariableLikeDeclaration, ObjectBindingOrAssignmentElement,
    NodeFactoryReplacePropertyNameTConstraint {
    override val kind: SyntaxKind.PropertyAssignment
    override val parent: ObjectLiteralExpression
    override val name: PropertyName
    val initializer: Expression
}
