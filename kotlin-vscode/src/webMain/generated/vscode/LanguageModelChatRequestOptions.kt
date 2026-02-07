// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import kotlin.js.JsString

/**
 * Options for making a chat request using a language model.
 *
 * @see [LanguageModelChat.sendRequest]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatRequestOptions)
 */
@JsPlainObject
external interface LanguageModelChatRequestOptions {
    /**
     * A human-readable message that explains why access to a language model is needed and what feature is enabled by it.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatRequestOptions.justification)
     */
    var justification: String?

    /**
     * A set of options that control the behavior of the language model. These options are specific to the language model
     * and need to be looked up in the respective documentation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatRequestOptions.modelOptions)
     */
    var modelOptions: ReadonlyRecord<JsString, *>?

    /**
     * An optional list of tools that are available to the language model. These could be registered tools available via
     * [lm.tools], or private tools that are just implemented within the calling extension.
     *
     * If the LLM requests to call one of these tools, it will return a [LanguageModelToolCallPart] in
     * [LanguageModelChatResponse.stream]. It's the caller's responsibility to invoke the tool. If it's a tool
     * registered in [lm.tools], that means calling [lm.invokeTool].
     *
     * Then, the tool result can be provided to the LLM by creating an Assistant-type [LanguageModelChatMessage] with a
     * [LanguageModelToolCallPart], followed by a User-type message with a [LanguageModelToolResultPart].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatRequestOptions.tools)
     */
    var tools: ReadonlyArray<LanguageModelChatTool>?

    /**
     * 	The tool-selecting mode to use. [LanguageModelChatToolMode.Auto] by default.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatRequestOptions.toolMode)
     */
    var toolMode: LanguageModelChatToolMode?
}
