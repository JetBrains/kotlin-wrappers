// Automatically generated - do not modify!

package typescript

sealed external interface CatchClause : Node, LocalsContainer, VariableDeclarationParent {
    override val kind: SyntaxKind.CatchClause
    override val parent: TryStatement
    val variableDeclaration: VariableDeclaration?
    val block: Block
}
