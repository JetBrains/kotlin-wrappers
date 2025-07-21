// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Namespace for chat functionality. Users interact with chat participants by sending messages
 * to them in the chat view. Chat participants can respond with markdown or other types of content
 * via the {@link ChatResponseStream}.
*/
export namespace chat {
/**
 * Create a new {@link ChatParticipant chat participant} instance.
 *
 * @param id A unique identifier for the participant.
 * @param handler A request handler for the participant.
 * @returns A new chat participant
*/
export function createChatParticipant(id: string, handler: ChatRequestHandler): ChatParticipant;
}

// ORIGINAL SOURCE
 **/
