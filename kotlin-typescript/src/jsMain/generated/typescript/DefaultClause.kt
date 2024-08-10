// Automatically generated - do not modify!

package typescript

sealed external interface DefaultClause : Node, CaseOrDefaultClause {
    override val kind: SyntaxKind.DefaultClause
    override val parent: CaseBlock
    val statements: NodeArray<Statement>
}
