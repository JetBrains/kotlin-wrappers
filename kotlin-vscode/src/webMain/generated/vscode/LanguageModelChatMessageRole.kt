// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents the role of a chat message. This is either the user or the assistant.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatMessageRole)
 */
/* enum */
external class LanguageModelChatMessageRole
private constructor() {
    /**
     * The user role, e.g the human interacting with a language model.
     */
    val User: LanguageModelChatMessageRole // 1

    /**
     * The assistant role, e.g. the language model generating responses.
     */
    val Assistant: LanguageModelChatMessageRole // 2
}
