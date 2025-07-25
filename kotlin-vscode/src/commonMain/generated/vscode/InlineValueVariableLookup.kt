// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Provide inline value through a variable lookup.
 * If only a range is specified, the variable name will be extracted from the underlying document.
 * An optional variable name can be used to override the extracted name.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueVariableLookup)
 */
open external class InlineValueVariableLookup {
    /**
     * The document range for which the inline value applies.
     * The range is used to extract the variable name from the underlying document.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueVariableLookup.range)
     */
    val range: Range

    /**
     * If specified the name of the variable to look up.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueVariableLookup.variableName)
     */
    val variableName: String?

    /**
     * How to perform the lookup.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueVariableLookup.caseSensitiveLookup)
     */
    val caseSensitiveLookup: Boolean

    /**
     * Creates a new InlineValueVariableLookup object.
     *
     * @param range The document line where to show the inline value.
     * @param variableName The name of the variable to look up.
     * @param caseSensitiveLookup How to perform the lookup. If missing lookup is case sensitive.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineValueVariableLookup.constructor)
     */
    constructor(
        range: Range,
        variableName: String = definedExternally,
        caseSensitiveLookup: Boolean = definedExternally,
    )
}
