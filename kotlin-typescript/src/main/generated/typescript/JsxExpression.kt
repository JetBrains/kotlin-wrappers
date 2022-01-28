// Automatically generated - do not modify!

package typescript

sealed external interface JsxExpression : Expression {
    override val kind: SyntaxKind.JsxExpression
    override val parent: dynamic /* JsxElement | JsxFragment | JsxAttributeLike */
    val dotDotDotToken: Token<SyntaxKind.DotDotDotToken>?
    val expression: Expression?
}
