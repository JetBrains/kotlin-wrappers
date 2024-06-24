// Automatically generated - do not modify!

package typescript

sealed external interface ExportDeclaration : DeclarationStatement, JSDocContainer, HasJSDoc, HasModifiers,
    ImportAttributesParent, TypeOnlyCompatibleAliasDeclaration {
    override val kind: SyntaxKind.ExportDeclaration
    override val parent: ExportDeclarationParent
    val modifiers: NodeArray<ModifierLike>?
    val isTypeOnly: Boolean

    /** Will not be assigned in the case of `export * from "foo";` */
    val exportClause: NamedExportBindings?

    /** If this is not a StringLiteral it will be a grammar error. */
    val moduleSpecifier: Expression?

    /** @deprecated */
    val assertClause: AssertClause?
    val attributes: ImportAttributes?
}
