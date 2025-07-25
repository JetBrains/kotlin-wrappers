// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Namespace for chat functionality. Users interact with chat participants by sending messages
 * to them in the chat view. Chat participants can respond with markdown or other types of content
 * via the [ChatResponseStream].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#chat)
 */
external object chat {
    /**
     * Create a new [chat participant][ChatParticipant] instance.
     *
     * @param id A unique identifier for the participant.
     * @param handler A request handler for the participant.
     * @returns A new chat participant
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#chat.createChatParticipant)
     */
    fun createChatParticipant(
        id: String,
        handler: ChatRequestHandler,
    ): ChatParticipant
}
