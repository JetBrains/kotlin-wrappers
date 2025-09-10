// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * A semantic tokens legend contains the needed information to decipher
 * the integer encoded representation of semantic tokens.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensLegend)
 */
open external class SemanticTokensLegend {
    /**
     * The possible token types.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensLegend.tokenTypes)
     */
    val tokenTypes: ReadonlyArray<JsString>

    /**
     * The possible token modifiers.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensLegend.tokenModifiers)
     */
    val tokenModifiers: ReadonlyArray<JsString>

    /**
     * Creates a semantic tokens legend.
     *
     * @param tokenTypes An array of token types.
     * @param tokenModifiers An array of token modifiers.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SemanticTokensLegend.constructor)
     */
    constructor(
        tokenTypes: ReadonlyArray<JsString>,
        tokenModifiers: ReadonlyArray<JsString> = definedExternally,
    )
}
