// Automatically generated - do not modify!

package typescript

sealed external interface PropertyDeclaration : ClassElement, JSDocContainer, HasJSDoc, HasType,
    HasExpressionInitializer, HasDecorators, HasModifiers, VariableLikeDeclaration,
    NodeFactoryReplacePropertyNameTConstraint {
    override val kind: SyntaxKind.PropertyDeclaration
    override val parent: ClassLikeDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val name: PropertyName
    val questionToken: QuestionToken?
    val exclamationToken: ExclamationToken?
    val type: TypeNode?
    val initializer: Expression?
}
