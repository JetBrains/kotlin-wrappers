// Automatically generated - do not modify!

package typescript

sealed external interface JsxSelfClosingElement : PrimaryExpression, HasTypeArguments, JsxOpeningLikeElement,
    JsxAttributeValue, JsxChild {
    override val kind: SyntaxKind.JsxSelfClosingElement
    val tagName: JsxTagNameExpression
    val typeArguments: NodeArray<TypeNode>?
    val attributes: JsxAttributes
}
