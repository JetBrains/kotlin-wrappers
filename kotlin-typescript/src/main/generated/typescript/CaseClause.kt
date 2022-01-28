// Automatically generated - do not modify!

package typescript

sealed external interface CaseClause : Node {
    override val kind: SyntaxKind.CaseClause
    override val parent: CaseBlock
    val expression: Expression
    val statements: NodeArray<Statement>
}
