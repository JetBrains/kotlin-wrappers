// Automatically generated - do not modify!

package typescript

sealed external interface JsxElement : PrimaryExpression, Union.JsxElement_ {
    override val kind: SyntaxKind.JsxElement
    val openingElement: JsxOpeningElement
    val children: NodeArray<JsxChild>
    val closingElement: JsxClosingElement
}
