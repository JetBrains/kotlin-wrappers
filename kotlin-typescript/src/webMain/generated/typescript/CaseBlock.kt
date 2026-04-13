// Automatically generated - do not modify!

package typescript

external interface CaseBlock :
    Node,
    LocalsContainer {
    override val kind: SyntaxKind.CaseBlock
    override val parent: SwitchStatement
    val clauses: NodeArray<CaseOrDefaultClause>
}
