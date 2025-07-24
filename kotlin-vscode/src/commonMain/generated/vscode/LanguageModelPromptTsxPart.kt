// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny

/**
 * A language model response part containing a PromptElementJSON from `@vscode/prompt-tsx`.
 * @see {@link LanguageModelToolResult}
 */
open external class LanguageModelPromptTsxPart {
    /**
     * The value of the part.
     */
    var value: JsAny?

    /**
     * Construct a prompt-tsx part with the given content.
     * @param value The value of the part, the result of `renderPromptElementJSON` from `@vscode/prompt-tsx`.
     */
    constructor(value: JsAny?)
}
