// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * A semantic tokens builder can help with creating a `SemanticTokens` instance
 * which contains delta encoded semantic tokens.
 */
open external class SemanticTokensBuilder {
    /**
     * Creates a semantic tokens builder.
     *
     * @param legend A semantic tokens legend.
     */
    constructor(legend: SemanticTokensLegend = definedExternally)

    /**
     * Add another token.
     *
     * @param line The token start line number (absolute value).
     * @param char The token start character (absolute value).
     * @param length The token length in characters.
     * @param tokenType The encoded token type.
     * @param tokenModifiers The encoded token modifiers.
     */
    fun push(
        line: Int,
        char: Int,
        length: Int,
        tokenType: Int,
        tokenModifiers: Int = definedExternally,
    )

    /**
     * Add another token. Use only when providing a legend.
     *
     * @param range The range of the token. Must be single-line.
     * @param tokenType The token type.
     * @param tokenModifiers The token modifiers.
     */
    fun push(
        range: Range,
        tokenType: String,
        tokenModifiers: ReadonlyArray<String> = definedExternally,
    )

    /**
     * Finish and create a `SemanticTokens` instance.
     */
    fun build(resultId: String = definedExternally): SemanticTokens
}
