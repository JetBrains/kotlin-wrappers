// Automatically generated - do not modify!

package typescript

sealed external interface TryStatement : Statement, Union.TryStatement_ {
    override val kind: SyntaxKind.TryStatement
    val tryBlock: Block
    val catchClause: CatchClause?
    val finallyBlock: Block?
}
