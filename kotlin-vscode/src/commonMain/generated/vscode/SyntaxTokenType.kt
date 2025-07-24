// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Enumeration of commonly encountered syntax token types.
 */
sealed /* enum */
external interface SyntaxTokenType {
    companion object {
        /**
         * Everything except tokens that are part of comments, string literals and regular expressions.
         */
        val Other: SyntaxTokenType // 0

        /**
         * A comment.
         */
        val Comment: SyntaxTokenType // 1

        /**
         * A string literal.
         */
        val String: SyntaxTokenType // 2

        /**
         * A regular expression.
         */
        val RegEx: SyntaxTokenType // 3
    }
}
