// Automatically generated - do not modify!

package typescript

sealed external interface AssertEntry : Node {
    override val kind: SyntaxKind.AssertEntry
    override val parent: AssertClause
    val name: AssertionKey
    val value: StringLiteral
}
