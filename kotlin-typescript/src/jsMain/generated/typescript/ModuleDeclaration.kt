// Automatically generated - do not modify!

package typescript

sealed external interface ModuleDeclaration : DeclarationStatement, JSDocContainer, LocalsContainer,
    Union.ModuleDeclaration_ {
    override val kind: SyntaxKind.ModuleDeclaration
    override val parent: Union.ModuleDeclaration_parent
    val modifiers: NodeArray<ModifierLike>?
    override val name: ModuleName
    val body: Union.ModuleDeclaration_body?
}
