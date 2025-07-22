// Automatically generated - do not modify!

package vscode

/**
 * Extra context passed to a participant.
 */
external interface ChatContext {
    /**
     * All of the chat messages so far in the current chat session. Currently, only chat messages for the current participant are included.
     */
    val history: Any /* ReadonlyArray<ChatRequestTurn | ChatResponseTurn> */
}
