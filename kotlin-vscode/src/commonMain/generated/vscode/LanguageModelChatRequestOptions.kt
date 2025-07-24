// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.Record

/**
 * Options for making a chat request using a language model.
 *
 * @see {@link LanguageModelChat.sendRequest}
 */
external interface LanguageModelChatRequestOptions {
    /**
     * A human-readable message that explains why access to a language model is needed and what feature is enabled by it.
     */
    var justification: String?

    /**
     * A set of options that control the behavior of the language model. These options are specific to the language model
     * and need to be looked up in the respective documentation.
     */
    var modelOptions: Record<JsString, *>?

    /**
     * An optional list of tools that are available to the language model. These could be registered tools available via
     * {@link lm.tools}, or private tools that are just implemented within the calling extension.
     *
     * If the LLM requests to call one of these tools, it will return a [LanguageModelToolCallPart] in
     * {@link LanguageModelChatResponse.stream}. It's the caller's responsibility to invoke the tool. If it's a tool
     * registered in {@link lm.tools}, that means calling {@link lm.invokeTool}.
     *
     * Then, the tool result can be provided to the LLM by creating an Assistant-type [LanguageModelChatMessage] with a
     * [LanguageModelToolCallPart], followed by a User-type message with a [LanguageModelToolResultPart].
     */
    var tools: ReadonlyArray<LanguageModelChatTool>?

    /**
     * 	The tool-selecting mode to use. {@link LanguageModelChatToolMode.Auto} by default.
     */
    var toolMode: LanguageModelChatToolMode?
}
