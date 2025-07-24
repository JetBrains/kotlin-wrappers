// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Namespace for chat functionality. Users interact with chat participants by sending messages
 * to them in the chat view. Chat participants can respond with markdown or other types of content
 * via the [ChatResponseStream].
 */
external object chat {
    /**
     * Create a new {@link ChatParticipant chat participant} instance.
     *
     * @param id A unique identifier for the participant.
     * @param handler A request handler for the participant.
     * @returns A new chat participant
     */
    fun createChatParticipant(
        id: String,
        handler: ChatRequestHandler,
    ): ChatParticipant
}
