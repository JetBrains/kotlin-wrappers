// Automatically generated - do not modify!

package typescript.ast

external interface ImportSpecifier :
    NamedDeclaration,
    ImportOrExportSpecifier,
    IsImportOrExportSpecifierResultPredicate {
    override val kind: SyntaxKind.ImportSpecifier
    override val parent: NamedImports?
    val propertyName: ModuleExportName?
    override val name: Identifier
    val isTypeOnly: Boolean
}
