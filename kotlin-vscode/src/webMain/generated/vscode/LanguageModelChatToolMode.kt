// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * A tool-calling mode for the language model to use.
 */
sealed /* enum */
external interface LanguageModelChatToolMode {
    companion object {
        /**
         * The language model can choose to call a tool or generate a message. Is the default.
         */
        val Auto: LanguageModelChatToolMode // 1

        /**
         * The language model must call one of the provided tools. Note- some models only support a single tool when using this
         * mode.
         */
        val Required: LanguageModelChatToolMode // 2
    }
}
