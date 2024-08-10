// Automatically generated - do not modify!

package typescript

sealed external interface TemplateSpan : Node, TemplateMiddleParent, TemplateTailParent {
    override val kind: SyntaxKind.TemplateSpan
    override val parent: TemplateExpression
    val expression: Expression
    val literal: TemplateSpanLiteral
}
