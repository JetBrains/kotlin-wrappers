// Automatically generated - do not modify!

package typescript

sealed external interface ModuleBlock : Node, Statement, BlockLike, NamespaceBody, ImportEqualsDeclarationParent,
    ImportDeclarationParent, ExportDeclarationParent {
    override val kind: SyntaxKind.ModuleBlock
    override val parent: ModuleDeclaration
    val statements: NodeArray<Statement>
}
