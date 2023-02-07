// Automatically generated - do not modify!

package typescript

sealed external interface ImportClause : NamedDeclaration, Union.ImportClause_ {
    override val kind: SyntaxKind.ImportClause
    override val parent: ImportDeclaration
    val isTypeOnly: Boolean
    override val name: Identifier?
    val namedBindings: NamedImportBindings?
}
