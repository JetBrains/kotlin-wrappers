// Automatically generated - do not modify!

package typescript

sealed external interface PropertyDeclaration : ClassElement, JSDocContainer, Union.PropertyDeclaration_ {
    override val kind: SyntaxKind.PropertyDeclaration
    override val parent: ClassLikeDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val name: PropertyName
    val questionToken: QuestionToken?
    val exclamationToken: ExclamationToken?
    val type: TypeNode?
    val initializer: Expression?
}
