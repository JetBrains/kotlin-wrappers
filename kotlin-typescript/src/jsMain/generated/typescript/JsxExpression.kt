// Automatically generated - do not modify!

package typescript

sealed external interface JsxExpression : Expression, Union.JsxExpression_ {
    override val kind: SyntaxKind.JsxExpression
    override val parent: Union.JsxExpression_parent
    val dotDotDotToken: Token<SyntaxKind.DotDotDotToken>?
    val expression: Expression?
}
