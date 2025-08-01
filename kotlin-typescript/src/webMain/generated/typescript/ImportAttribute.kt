// Automatically generated - do not modify!

package typescript

sealed external interface ImportAttribute : Node {
    override val kind: SyntaxKind.ImportAttribute
    override val parent: ImportAttributes
    val name: ImportAttributeName
    val value: Expression
}
