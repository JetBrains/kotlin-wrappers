// Automatically generated - do not modify!

package typescript

sealed external interface FunctionDeclaration : FunctionLikeDeclarationBase, DeclarationStatement, LocalsContainer,
    Union.FunctionDeclaration_ {
    override val kind: SyntaxKind.FunctionDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val name: Identifier?
    override val body: FunctionBody?
}
