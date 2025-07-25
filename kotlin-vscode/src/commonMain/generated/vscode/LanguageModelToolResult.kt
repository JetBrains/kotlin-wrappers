// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.JsModule

/**
 * A result returned from a tool invocation. If using `@vscode/prompt-tsx`, this result may be rendered using a `ToolResult`.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolResult)
 */
open external class LanguageModelToolResult {
    /**
     * A list of tool result content parts. Includes `unknown` because this list may be extended with new content types in
     * the future.
     * @see [lm.invokeTool].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolResult.content)
     */
    var content: ReadonlyArray<JsAny /* LanguageModelTextPart | LanguageModelPromptTsxPart | unknown */>

    /**
     * Create a LanguageModelToolResult
     * @param content A list of tool result content parts
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolResult.constructor)
     */
    constructor(content: ReadonlyArray<JsAny /* LanguageModelTextPart | LanguageModelPromptTsxPart */>)
}
