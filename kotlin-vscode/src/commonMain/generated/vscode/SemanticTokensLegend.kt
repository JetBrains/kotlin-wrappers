// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * A semantic tokens legend contains the needed information to decipher
 * the integer encoded representation of semantic tokens.
 */
open external class SemanticTokensLegend {
    /**
     * The possible token types.
     */
    val tokenTypes: ReadonlyArray<String>

    /**
     * The possible token modifiers.
     */
    val tokenModifiers: ReadonlyArray<String>

    /**
     * Creates a semantic tokens legend.
     *
     * @param tokenTypes An array of token types.
     * @param tokenModifiers An array of token modifiers.
     */
    constructor(
        tokenTypes: ReadonlyArray<String>,
        tokenModifiers: ReadonlyArray<String> = definedExternally,
    )
}
