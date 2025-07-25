// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * A language model response part containing a piece of text, returned from a [LanguageModelChatResponse].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelTextPart)
 */
open external class LanguageModelTextPart {
    /**
     * The text content of the part.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelTextPart.value)
     */
    var value: String

    /**
     * Construct a text part with the given content.
     * @param value The text content of the part.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelTextPart.constructor)
     */
    constructor(value: String)
}
