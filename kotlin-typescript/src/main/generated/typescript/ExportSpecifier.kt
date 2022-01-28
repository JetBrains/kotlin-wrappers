// Automatically generated - do not modify!

package typescript

sealed external interface ExportSpecifier : NamedDeclaration {
    override val kind: SyntaxKind.ExportSpecifier
    override val parent: NamedExports
    val isTypeOnly: Boolean
    val propertyName: Identifier?
    override val name: Identifier
}
