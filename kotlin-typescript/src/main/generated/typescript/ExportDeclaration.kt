// Automatically generated - do not modify!

package typescript

sealed external interface ExportDeclaration : DeclarationStatement, JSDocContainer {
    override val kind: SyntaxKind.ExportDeclaration
    override val parent: dynamic /* SourceFile | ModuleBlock */
    val isTypeOnly: Boolean

    /** Will not be assigned in the case of `export * from "foo";` */
    val exportClause: NamedExportBindings?

    /** If this is not a StringLiteral it will be a grammar error. */
    val moduleSpecifier: Expression?
    val assertClause: AssertClause?
}
