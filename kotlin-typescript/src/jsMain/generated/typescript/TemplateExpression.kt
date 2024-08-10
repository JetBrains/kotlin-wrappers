// Automatically generated - do not modify!

package typescript

sealed external interface TemplateExpression : PrimaryExpression, TemplateHeadParent, TemplateLiteral {
    override val kind: SyntaxKind.TemplateExpression
    val head: TemplateHead
    val templateSpans: NodeArray<TemplateSpan>
}
