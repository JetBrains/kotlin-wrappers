// Automatically generated - do not modify!

package typescript.ast

external interface ImportAttributes : Node {
    val token: ImportAttributesToken
    override val kind: SyntaxKind.ImportAttributes
    override val parent: ImportAttributesParent?
    val elements: NodeArray<ImportAttribute>
    val multiLine: Boolean?
}
