// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Represents the role of a chat message. This is either the user or the assistant.
 */
sealed /* enum */
external interface LanguageModelChatMessageRole {
    companion object {
        /**
         * The user role, e.g the human interacting with a language model.
         */
        val User: LanguageModelChatMessageRole // 1

        /**
         * The assistant role, e.g. the language model generating responses.
         */
        val Assistant: LanguageModelChatMessageRole // 2
    }
}
