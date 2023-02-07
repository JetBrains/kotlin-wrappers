// Automatically generated - do not modify!

package typescript

sealed external interface TemplateLiteralTypeNode : TypeNode, Union.TemplateLiteralTypeNode_ {
    override var kind: SyntaxKind.TemplateLiteralType
    val head: TemplateHead
    val templateSpans: NodeArray<TemplateLiteralTypeSpan>
}
