// Automatically generated - do not modify!

package typescript

/**
 * This is either an `export =` or an `export default` declaration.
 * Unless `isExportEquals` is set, this node was parsed as an `export default`.
 */
external interface ExportAssignment : DeclarationStatement, JSDocContainer {
    override val kind: SyntaxKind.ExportAssignment
    override val parent: SourceFile
    val isExportEquals: Boolean?
    val expression: Expression
}
