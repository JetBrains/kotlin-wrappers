// Automatically generated - do not modify!

package typescript

sealed external interface Block : Statement, LocalsContainer, HasJSDoc, BlockLike {
    override val kind: SyntaxKind.Block
    val statements: NodeArray<Statement>
}
