// Automatically generated - do not modify!

package typescript

sealed external interface CaseBlock : Node {
    override val kind: SyntaxKind.CaseBlock
    override val parent: SwitchStatement
    val clauses: NodeArray<CaseOrDefaultClause>
}
