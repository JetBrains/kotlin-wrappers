// Automatically generated - do not modify!

package typescript

sealed external interface JsxOpeningElement : Expression {
    override val kind: SyntaxKind.JsxOpeningElement
    override val parent: JsxElement
    val tagName: JsxTagNameExpression
    val typeArguments: NodeArray<TypeNode>?
    val attributes: JsxAttributes
}
