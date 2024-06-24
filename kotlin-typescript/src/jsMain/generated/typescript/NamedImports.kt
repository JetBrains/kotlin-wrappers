// Automatically generated - do not modify!

package typescript

sealed external interface NamedImports : Node, NamedImportBindings, NamedImportsOrExports {
    override val kind: SyntaxKind.NamedImports
    override val parent: ImportClause
    val elements: NodeArray<ImportSpecifier>
}
