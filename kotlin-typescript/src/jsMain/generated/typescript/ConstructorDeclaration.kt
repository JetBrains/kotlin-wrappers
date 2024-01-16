// Automatically generated - do not modify!

package typescript

sealed external interface ConstructorDeclaration : FunctionLikeDeclarationBase, ClassElement, JSDocContainer,
    LocalsContainer, Union.ConstructorDeclaration_ {
    override val kind: SyntaxKind.Constructor
    override val parent: ClassLikeDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val body: FunctionBody?
}
