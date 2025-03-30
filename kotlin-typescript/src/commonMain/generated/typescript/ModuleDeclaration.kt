// Automatically generated - do not modify!

package typescript

sealed external interface ModuleDeclaration : DeclarationStatement, JSDocContainer, LocalsContainer, HasJSDoc,
    HasModifiers {
    override val kind: SyntaxKind.ModuleDeclaration
    override val parent: ModuleDeclarationParent
    val modifiers: NodeArray<ModifierLike>?
    override val name: ModuleName
    val body: (ModuleDeclarationBody)?
}
