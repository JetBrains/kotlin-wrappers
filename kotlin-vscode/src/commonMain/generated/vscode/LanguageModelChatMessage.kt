// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents a message in a chat. Can assume different roles, like user or assistant.
 */
open external class LanguageModelChatMessage {
    /**
     * The role of this message.
     */
    var role: LanguageModelChatMessageRole

    /**
     * A string or heterogeneous array of things that a message can contain as content. Some parts may be message-type
     * specific for some models.
     */
    var content: ReadonlyArray<JsAny /* LanguageModelTextPart | LanguageModelToolResultPart | LanguageModelToolCallPart */>

    /**
     * The optional name of a user for this message.
     */
    var name: String?

    /**
     * Create a new user message.
     *
     * @param role The role of the message.
     * @param content The content of the message.
     * @param name The optional name of a user for the message.
     */
    constructor(
        role: LanguageModelChatMessageRole,
        content: JsAny, /* string | Array<LanguageModelTextPart | LanguageModelToolResultPart | LanguageModelToolCallPart> */
        name: String = definedExternally,
    )

    companion object {
        /**
         * Utility to create a new user message.
         *
         * @param content The content of the message.
         * @param name The optional name of a user for the message.
         */
        fun User(
            content: JsAny, /* string | Array<LanguageModelTextPart | LanguageModelToolResultPart> */
            name: String = definedExternally,
        ): LanguageModelChatMessage

        /**
         * Utility to create a new assistant message.
         *
         * @param content The content of the message.
         * @param name The optional name of a user for the message.
         */
        fun Assistant(
            content: JsAny, /* string | Array<LanguageModelTextPart | LanguageModelToolCallPart> */
            name: String = definedExternally,
        ): LanguageModelChatMessage
    }
}
