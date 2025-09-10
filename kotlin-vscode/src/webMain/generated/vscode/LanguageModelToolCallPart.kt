// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsAny
import kotlin.js.JsModule

/**
 * A language model response part indicating a tool call, returned from a [LanguageModelChatResponse], and also can be
 * included as a content part on a [LanguageModelChatMessage], to represent a previous tool call in a chat request.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolCallPart)
 */
open external class LanguageModelToolCallPart {
    /**
     * The ID of the tool call. This is a unique identifier for the tool call within the chat request.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolCallPart.callId)
     */
    var callId: String

    /**
     * The name of the tool to call.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolCallPart.name)
     */
    var name: String

    /**
     * The input with which to call the tool.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolCallPart.input)
     */
    var input: JsAny

    /**
     * Create a new LanguageModelToolCallPart.
     *
     * @param callId The ID of the tool call.
     * @param name The name of the tool to call.
     * @param input The input with which to call the tool.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolCallPart.constructor)
     */
    constructor(
        callId: String,
        name: String,
        input: JsAny,
    )
}
