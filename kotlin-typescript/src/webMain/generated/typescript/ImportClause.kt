// Automatically generated - do not modify!

package typescript

sealed external interface ImportClause :
    NamedDeclaration,
    TypeOnlyCompatibleAliasDeclaration {
    override val kind: SyntaxKind.ImportClause
    override val parent: ImportClauseParent

    /** @deprecated Use `phaseModifier` instead */
    val isTypeOnly: Boolean
    val phaseModifier: ImportPhaseModifierSyntaxKind?
    override val name: Identifier?
    val namedBindings: NamedImportBindings?
}
