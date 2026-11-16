// Automatically generated - do not modify!

package typescript.ast

external interface TryStatement :
    Statement,
    FlowContainer,
    HasJSDoc {
    override val kind: SyntaxKind.TryStatement
    val tryBlock: Block
    val catchClause: CatchClause?
    val finallyBlock: Block?
}
