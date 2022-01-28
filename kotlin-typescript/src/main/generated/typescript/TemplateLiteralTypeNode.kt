// Automatically generated - do not modify!

package typescript

sealed external interface TemplateLiteralTypeNode : TypeNode {
    override var kind: SyntaxKind.TemplateLiteralType
    val head: TemplateHead
    val templateSpans: NodeArray<TemplateLiteralTypeSpan>
}
