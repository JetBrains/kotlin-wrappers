// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * A semantic tokens builder can help with creating a `SemanticTokens` instance
 * which contains delta encoded semantic tokens.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensBuilder)
 */
open external class SemanticTokensBuilder {
    /**
     * Creates a semantic tokens builder.
     *
     * @param legend A semantic tokens legend.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensBuilder.constructor)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensBuilder.push)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensBuilder.push)
     */
    fun push(
        range: Range,
        tokenType: String,
        tokenModifiers: ReadonlyArray<JsString> = definedExternally,
    )

    /**
     * Finish and create a `SemanticTokens` instance.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensBuilder.build)
     */
    fun build(resultId: String = definedExternally): SemanticTokens
}
