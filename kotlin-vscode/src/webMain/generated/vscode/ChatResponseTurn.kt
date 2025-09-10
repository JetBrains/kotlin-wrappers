// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsModule

/**
 * Represents a chat participant's response in chat history.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseTurn)
 */
open external class ChatResponseTurn {
    /**
     * The content that was received from the chat participant. Only the stream parts that represent actual content (not metadata) are represented.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseTurn.response)
     */
    val response: ReadonlyArray<JsAny /* ChatResponseMarkdownPart | ChatResponseFileTreePart | ChatResponseAnchorPart | ChatResponseCommandButtonPart */>

    /**
     * The result that was received from the chat participant.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseTurn.result)
     */
    val result: ChatResult

    /**
     * The id of the chat participant that this response came from.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseTurn.participant)
     */
    val participant: String

    /**
     * The name of the command that this response came from.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseTurn.command)
     */
    val command: String?

    /**
     * @hidden
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseTurn.constructor)
     */
    private constructor(
        response: ReadonlyArray<JsAny /* ChatResponseMarkdownPart | ChatResponseFileTreePart | ChatResponseAnchorPart | ChatResponseCommandButtonPart */>,
        result: ChatResult,
        participant: String,
    )
}
