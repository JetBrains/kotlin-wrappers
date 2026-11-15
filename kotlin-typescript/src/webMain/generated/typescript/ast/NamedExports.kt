// Automatically generated - do not modify!

package typescript.ast

external interface NamedExports :
    Node,
    NamedExportBindings,
    NamedImportsOrExports {
    override val kind: SyntaxKind.NamedExports
    override val parent: ExportDeclaration?
    val elements: NodeArray<ExportSpecifier>
}
