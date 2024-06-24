// Automatically generated - do not modify!

package typescript

sealed external interface ImportDeclaration : Statement, HasJSDoc, HasModifiers, ImportAttributesParent {
    override val kind: SyntaxKind.ImportDeclaration
    override val parent: ImportDeclarationParent
    val modifiers: NodeArray<ModifierLike>?
    val importClause: ImportClause?

    /** If this is not a StringLiteral it will be a grammar error. */
    val moduleSpecifier: Expression

    /** @deprecated */
    val assertClause: AssertClause?
    val attributes: ImportAttributes?
}
