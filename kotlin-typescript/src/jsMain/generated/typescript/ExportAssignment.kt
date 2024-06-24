// Automatically generated - do not modify!

package typescript

/**
 * This is either an `export =` or an `export default` declaration.
 * Unless `isExportEquals` is set, this node was parsed as an `export default`.
 */
sealed external interface ExportAssignment : DeclarationStatement, JSDocContainer, HasJSDoc, HasModifiers {
    override val kind: SyntaxKind.ExportAssignment
    override val parent: SourceFile
    val modifiers: NodeArray<ModifierLike>?
    val isExportEquals: Boolean?
    val expression: Expression
}
