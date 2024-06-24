// Automatically generated - do not modify!

package typescript

sealed external interface ImportSpecifier : NamedDeclaration, ImportOrExportSpecifier,
    IsImportOrExportSpecifierResultPredicate {
    override val kind: SyntaxKind.ImportSpecifier
    override val parent: NamedImports
    val propertyName: Identifier?
    override val name: Identifier
    val isTypeOnly: Boolean
}
