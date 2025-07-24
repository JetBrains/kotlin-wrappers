// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A semantic tokens legend contains the needed information to decipher
 * the integer encoded representation of semantic tokens.
 */
open external class SemanticTokensLegend {
    /**
     * The possible token types.
     */
    val tokenTypes: ReadonlyArray<JsString>

    /**
     * The possible token modifiers.
     */
    val tokenModifiers: ReadonlyArray<JsString>

    /**
     * Creates a semantic tokens legend.
     *
     * @param tokenTypes An array of token types.
     * @param tokenModifiers An array of token modifiers.
     */
    constructor(
        tokenTypes: ReadonlyArray<JsString>,
        tokenModifiers: ReadonlyArray<JsString> = definedExternally,
    )
}
