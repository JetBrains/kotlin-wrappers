// Automatically generated - do not modify!

package typescript

sealed external interface TemplateSpan : Node, Union.TemplateSpan_ {
    override val kind: SyntaxKind.TemplateSpan
    override val parent: TemplateExpression
    val expression: Expression
    val literal: Union.TemplateSpan_literal
}
