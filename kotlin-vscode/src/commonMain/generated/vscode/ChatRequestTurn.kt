// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Represents a user request in chat history.
*/
export class ChatRequestTurn {
/**
 * The prompt as entered by the user.
 *
 * Information about references used in this request is stored in {@link ChatRequestTurn.references}.
 *
 * *Note* that the {@link ChatParticipant.name name} of the participant and the {@link ChatCommand.name command}
 * are not part of the prompt.
*/
readonly prompt: string;

/**
 * The id of the chat participant to which this request was directed.
*/
readonly participant: string;

/**
 * The name of the {@link ChatCommand command} that was selected for this request.
*/
readonly command?: string;

/**
 * The references that were used in this message.
*/
readonly references: ChatPromptReference[];

/**
 * The list of tools were attached to this request.
*/
readonly toolReferences: readonly ChatLanguageModelToolReference[];

/**
 * @hidden
*/
private constructor(prompt: string, command: string | undefined, references: ChatPromptReference[], participant: string, toolReferences: ChatLanguageModelToolReference[]);
}

// ORIGINAL SOURCE
 **/
