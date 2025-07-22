// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A language model response part indicating a tool call, returned from a {@link LanguageModelChatResponse}, and also can be
 * included as a content part on a {@link LanguageModelChatMessage}, to represent a previous tool call in a chat request.
 */
open external class LanguageModelToolCallPart {
    /**
     * The ID of the tool call. This is a unique identifier for the tool call within the chat request.
     */
    var callId: String

    /**
     * The name of the tool to call.
     */
    var name: String

    /**
     * The input with which to call the tool.
     */
    var input: Any

    /**
     * Create a new LanguageModelToolCallPart.
     *
     * @param callId The ID of the tool call.
     * @param name The name of the tool to call.
     * @param input The input with which to call the tool.
     */
    constructor(
        callId: String,
        name: String,
        input: Any,
    )
}
