// Automatically generated - do not modify!

package typescript

sealed external interface FunctionDeclaration : FunctionLikeDeclarationBase, DeclarationStatement, LocalsContainer,
    HasJSDoc, HasModifiers, SignatureDeclaration, FunctionLikeDeclaration {
    override val kind: SyntaxKind.FunctionDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val name: Identifier?
    override val body: FunctionBody?
}
