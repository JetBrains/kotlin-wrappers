// Automatically generated - do not modify!

package typescript

sealed external interface ExportDeclaration : DeclarationStatement, JSDocContainer, Union.ExportDeclaration_ {
    override val kind: SyntaxKind.ExportDeclaration
    override val parent: Union.ExportDeclaration_parent
    val modifiers: NodeArray<Modifier>?
    val isTypeOnly: Boolean

    /** Will not be assigned in the case of `export * from "foo";` */
    val exportClause: NamedExportBindings?

    /** If this is not a StringLiteral it will be a grammar error. */
    val moduleSpecifier: Expression?
    val assertClause: AssertClause?
}
