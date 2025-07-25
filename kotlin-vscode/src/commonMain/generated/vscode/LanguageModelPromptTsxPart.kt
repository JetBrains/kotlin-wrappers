// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny
import kotlin.js.JsModule

/**
 * A language model response part containing a PromptElementJSON from `@vscode/prompt-tsx`.
 * @see [LanguageModelToolResult]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelPromptTsxPart)
 */
open external class LanguageModelPromptTsxPart {
    /**
     * The value of the part.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelPromptTsxPart.value)
     */
    var value: JsAny?

    /**
     * Construct a prompt-tsx part with the given content.
     * @param value The value of the part, the result of `renderPromptElementJSON` from `@vscode/prompt-tsx`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelPromptTsxPart.constructor)
     */
    constructor(value: JsAny?)
}
