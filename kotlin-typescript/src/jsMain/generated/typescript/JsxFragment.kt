// Automatically generated - do not modify!

package typescript

sealed external interface JsxFragment : PrimaryExpression, JsxAttributeValue, JsxExpressionParent, JsxTextParent,
    JsxChild {
    override val kind: SyntaxKind.JsxFragment
    val openingFragment: JsxOpeningFragment
    val children: NodeArray<JsxChild>
    val closingFragment: JsxClosingFragment
}
