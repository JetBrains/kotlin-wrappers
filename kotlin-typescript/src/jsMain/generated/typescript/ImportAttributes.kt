// Automatically generated - do not modify!

package typescript

sealed external interface ImportAttributes : Node {
    val token: Union.ImportAttributes_token
    override val kind: SyntaxKind.ImportAttributes
    override val parent: Union.ImportAttributes_parent
    val elements: NodeArray<ImportAttribute>
    val multiLine: Boolean?
}
