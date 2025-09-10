// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsModule

/**
 * The result of a tool call. This is the counterpart of a [tool call][LanguageModelToolCallPart] and
 * it can only be included in the content of a User message
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolResultPart)
 */
open external class LanguageModelToolResultPart {
    /**
     * The ID of the tool call.
     *
     * *Note* that this should match the [callId][LanguageModelToolCallPart.callId] of a tool call part.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolResultPart.callId)
     */
    var callId: String

    /**
     * The value of the tool result.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolResultPart.content)
     */
    var content: ReadonlyArray<JsAny /* LanguageModelTextPart | LanguageModelPromptTsxPart | unknown */>

    /**
     * @param callId The ID of the tool call.
     * @param content The content of the tool result.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolResultPart.constructor)
     */
    constructor(
        callId: String,
        content: ReadonlyArray<JsAny /* LanguageModelTextPart | LanguageModelPromptTsxPart | unknown */>,
    )
}
