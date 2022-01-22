// Automatically generated - do not modify!

package typescript

external interface ImportDeclaration : Statement {
    override val kind: SyntaxKind.ImportDeclaration
    override val parent: dynamic /* SourceFile | ModuleBlock */
    val importClause: ImportClause?

    /** If this is not a StringLiteral it will be a grammar error. */
    val moduleSpecifier: Expression
    val assertClause: AssertClause?
}
