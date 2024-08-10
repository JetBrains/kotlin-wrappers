// Automatically generated - do not modify!

package typescript

sealed external interface JSDoc : Node, JSDocTagParent, GetJSDocCommentsAndTagsResultItem {
    override val kind: SyntaxKind.JSDoc
    override val parent: HasJSDoc
    val tags: NodeArray<JSDocTag>?
    val comment: (Any /* string | NodeArray<JSDocComment> */)?
}
