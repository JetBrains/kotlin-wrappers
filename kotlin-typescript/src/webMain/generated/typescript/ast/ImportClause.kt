// Automatically generated - do not modify!

package typescript.ast

external interface ImportClause :
    NamedDeclaration,
    TypeOnlyCompatibleAliasDeclaration {
    override val kind: SyntaxKind.ImportClause
    override val parent: ImportClauseParent?

    val phaseModifier: ImportPhaseModifierSyntaxKind?
    override val name: Identifier?
    val namedBindings: NamedImportBindings?
}
