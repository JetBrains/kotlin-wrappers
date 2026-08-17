// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Enumeration of commonly encountered syntax token types.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SyntaxTokenType)
 */
/* enum */
external class SyntaxTokenType
private constructor() {
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
