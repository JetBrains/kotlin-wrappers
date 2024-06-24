// Automatically generated - do not modify!

package typescript

sealed external interface ConstructorDeclaration : FunctionLikeDeclarationBase, ClassElement, JSDocContainer,
    LocalsContainer, HasJSDoc, HasModifiers, SignatureDeclaration, FunctionLikeDeclaration {
    override val kind: SyntaxKind.Constructor
    override val parent: ClassLikeDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val body: FunctionBody?
}
