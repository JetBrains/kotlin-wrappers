// Automatically generated - do not modify!

package typescript

sealed external interface JsxElement : PrimaryExpression, JsxAttributeValue, JsxExpressionParent, JsxTextParent,
    JsxChild {
    override val kind: SyntaxKind.JsxElement
    val openingElement: JsxOpeningElement
    val children: NodeArray<JsxChild>
    val closingElement: JsxClosingElement
}
