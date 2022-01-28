// Automatically generated - do not modify!

package typescript

sealed external interface TemplateSpan : Node {
    override val kind: SyntaxKind.TemplateSpan
    override val parent: TemplateExpression
    val expression: Expression
    val literal: dynamic /* TemplateMiddle | TemplateTail */
}
