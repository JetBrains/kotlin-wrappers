// Automatically generated - do not modify!

package typescript.ast

external interface NamespaceImport :
    NamedDeclaration,
    NamedImportBindings,
    TypeOnlyCompatibleAliasDeclaration {
    override val kind: SyntaxKind.NamespaceImport
    override val parent: ImportClause?
    override val name: Identifier
}
