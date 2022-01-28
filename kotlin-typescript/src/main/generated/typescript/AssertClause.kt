// Automatically generated - do not modify!

package typescript

sealed external interface AssertClause : Node {
    override val kind: SyntaxKind.AssertClause
    override val parent: dynamic /* ImportDeclaration | ExportDeclaration */
    val elements: NodeArray<AssertEntry>
    val multiLine: Boolean?
}
