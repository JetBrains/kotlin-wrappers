// Automatically generated - do not modify!

package typescript

sealed external interface JsxExpression : Expression, JsxAttributeValue, JsxChild,
    IsStringLiteralOrJsxExpressionResultPredicate {
    override val kind: SyntaxKind.JsxExpression
    override val parent: JsxExpressionParent
    val dotDotDotToken: Token<SyntaxKind.DotDotDotToken>?
    val expression: Expression?
}
