// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import kotlin.js.JsString

/**
 * The provider version of [LanguageModelChatRequestOptions]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProvideLanguageModelChatResponseOptions)
 */
@JsPlainObject
external interface ProvideLanguageModelChatResponseOptions {
    /**
     * A set of options that control the behavior of the language model. These options are specific to the language model.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProvideLanguageModelChatResponseOptions.modelOptions)
     */
    val modelOptions: ReadonlyRecord<JsString, *>?

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
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProvideLanguageModelChatResponseOptions.tools)
     */
    val tools: ReadonlyArray<LanguageModelChatTool>?

    /**
     * 	The tool-selecting mode to use. The provider must implement respecting this.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProvideLanguageModelChatResponseOptions.toolMode)
     */
    val toolMode: LanguageModelChatToolMode
}
