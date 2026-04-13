// Automatically generated - do not modify!

package typescript

external interface ImportSpecifier :
    NamedDeclaration,
    ImportOrExportSpecifier,
    IsImportOrExportSpecifierResultPredicate {
    override val kind: SyntaxKind.ImportSpecifier
    override val parent: NamedImports
    val propertyName: ModuleExportName?
    override val name: Identifier
    val isTypeOnly: Boolean
}
