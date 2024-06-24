// Automatically generated - do not modify!

package typescript

sealed external interface ShorthandPropertyAssignment : ObjectLiteralElement, JSDocContainer, HasJSDoc,
    ObjectLiteralElementLike, VariableLikeDeclaration, ObjectBindingOrAssignmentElement {
    override val kind: SyntaxKind.ShorthandPropertyAssignment
    override val parent: ObjectLiteralExpression
    override val name: Identifier
    val equalsToken: EqualsToken?
    val objectAssignmentInitializer: Expression?
}
