// Automatically generated - do not modify!

package typescript

sealed external interface TemplateLiteralTypeSpan : TypeNode {
    override val kind: SyntaxKind.TemplateLiteralTypeSpan
    override val parent: TemplateLiteralTypeNode
    val type: TypeNode
    val literal: dynamic /* TemplateMiddle | TemplateTail */
}
