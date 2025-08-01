// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents a user request in chat history.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatRequestTurn)
 */
open external class ChatRequestTurn {
    /**
     * The prompt as entered by the user.
     *
     * Information about references used in this request is stored in [ChatRequestTurn.references].
     *
     * *Note* that the [name} of the participant and the {@link ChatCommand.name command][ChatParticipant.name]
     * are not part of the prompt.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatRequestTurn.prompt)
     */
    val prompt: String

    /**
     * The id of the chat participant to which this request was directed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatRequestTurn.participant)
     */
    val participant: String

    /**
     * The name of the [command][ChatCommand] that was selected for this request.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatRequestTurn.command)
     */
    val command: String?

    /**
     * The references that were used in this message.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatRequestTurn.references)
     */
    val references: ReadonlyArray<ChatPromptReference>

    /**
     * The list of tools were attached to this request.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatRequestTurn.toolReferences)
     */
    val toolReferences: ReadonlyArray<ChatLanguageModelToolReference>

    /**
     * @hidden
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatRequestTurn.constructor)
     */
    private constructor(
        prompt: String,
        command: String?,
        references: ReadonlyArray<ChatPromptReference>,
        participant: String,
        toolReferences: ReadonlyArray<ChatLanguageModelToolReference>,
    )
}
