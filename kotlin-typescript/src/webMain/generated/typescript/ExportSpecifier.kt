// Automatically generated - do not modify!

package typescript

sealed external interface ExportSpecifier :
    NamedDeclaration,
    JSDocContainer,
    HasJSDoc,
    ImportOrExportSpecifier,
    IsImportOrExportSpecifierResultPredicate {
    override val kind: SyntaxKind.ExportSpecifier
    override val parent: NamedExports
    val isTypeOnly: Boolean
    val propertyName: ModuleExportName?
    override val name: ModuleExportName
}
