// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.JsModule

/**
 * The result of a tool call. This is the counterpart of a {@link LanguageModelToolCallPart tool call} and
 * it can only be included in the content of a User message
 */
open external class LanguageModelToolResultPart {
    /**
     * The ID of the tool call.
     *
     * *Note* that this should match the {@link LanguageModelToolCallPart.callId callId} of a tool call part.
     */
    var callId: String

    /**
     * The value of the tool result.
     */
    var content: ReadonlyArray<JsAny /* LanguageModelTextPart | LanguageModelPromptTsxPart | unknown */>

    /**
     * @param callId The ID of the tool call.
     * @param content The content of the tool result.
     */
    constructor(
        callId: String,
        content: ReadonlyArray<JsAny /* LanguageModelTextPart | LanguageModelPromptTsxPart | unknown */>,
    )
}
