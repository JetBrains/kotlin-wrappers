// Automatically generated - do not modify!

package typescript

sealed external interface TemplateLiteralTypeNode : TypeNode, TemplateHeadParent {
    override var kind: SyntaxKind.TemplateLiteralType
    val head: TemplateHead
    val templateSpans: NodeArray<TemplateLiteralTypeSpan>
}
