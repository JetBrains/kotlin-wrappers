// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * Represents a user request in chat history.
 */
open external class ChatRequestTurn {
    /**
     * The prompt as entered by the user.
     *
     * Information about references used in this request is stored in {@link ChatRequestTurn.references}.
     *
     * *Note* that the {@link ChatParticipant.name name} of the participant and the {@link ChatCommand.name command}
     * are not part of the prompt.
     */
    val prompt: String

    /**
     * The id of the chat participant to which this request was directed.
     */
    val participant: String

    /**
     * The name of the {@link ChatCommand command} that was selected for this request.
     */
    val command: String?

    /**
     * The references that were used in this message.
     */
    val references: ReadonlyArray<ChatPromptReference>

    /**
     * The list of tools were attached to this request.
     */
    val toolReferences: ReadonlyArray<ChatLanguageModelToolReference>

    /**
     * @hidden
     */
//  private constructor(prompt: string, command: string | undefined, references: ChatPromptReference[], participant: string, toolReferences: ChatLanguageModelToolReference[])
}
