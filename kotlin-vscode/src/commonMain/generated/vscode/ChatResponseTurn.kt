// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a chat participant's response in chat history.
 */
open external class ChatResponseTurn {
    /**
     * The content that was received from the chat participant. Only the stream parts that represent actual content (not metadata) are represented.
     */
    val response: Any /* ReadonlyArray<ChatResponseMarkdownPart | ChatResponseFileTreePart | ChatResponseAnchorPart | ChatResponseCommandButtonPart> */

    /**
     * The result that was received from the chat participant.
     */
    val result: ChatResult

    /**
     * The id of the chat participant that this response came from.
     */
    val participant: String

    /**
     * The name of the command that this response came from.
     */
    val command: String?

    /**
     * @hidden
     */
//  private constructor(response: ReadonlyArray<ChatResponseMarkdownPart | ChatResponseFileTreePart | ChatResponseAnchorPart | ChatResponseCommandButtonPart>, result: ChatResult, participant: string)
}
