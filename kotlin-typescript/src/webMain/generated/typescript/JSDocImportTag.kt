// Automatically generated - do not modify!

package typescript

external interface JSDocImportTag :
    JSDocTag,
    ImportClauseParent {
    override val kind: SyntaxKind.JSDocImportTag
    override val parent: JSDoc
    val importClause: ImportClause?
    val moduleSpecifier: Expression
    val attributes: ImportAttributes?
}
