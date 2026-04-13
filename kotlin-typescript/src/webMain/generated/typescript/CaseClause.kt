// Automatically generated - do not modify!

package typescript

external interface CaseClause :
    Node,
    JSDocContainer,
    HasJSDoc,
    CaseOrDefaultClause {
    override val kind: SyntaxKind.CaseClause
    override val parent: CaseBlock
    val expression: Expression
    val statements: NodeArray<Statement>
}
