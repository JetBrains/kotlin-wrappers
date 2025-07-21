// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Represents a chat participant's response in chat history.
*/
export class ChatResponseTurn {
/**
 * The content that was received from the chat participant. Only the stream parts that represent actual content (not metadata) are represented.
*/
readonly response: ReadonlyArray<ChatResponseMarkdownPart | ChatResponseFileTreePart | ChatResponseAnchorPart | ChatResponseCommandButtonPart>;

/**
 * The result that was received from the chat participant.
*/
readonly result: ChatResult;

/**
 * The id of the chat participant that this response came from.
*/
readonly participant: string;

/**
 * The name of the command that this response came from.
*/
readonly command?: string;

/**
 * @hidden
*/
private constructor(response: ReadonlyArray<ChatResponseMarkdownPart | ChatResponseFileTreePart | ChatResponseAnchorPart | ChatResponseCommandButtonPart>, result: ChatResult, participant: string);
}

// ORIGINAL SOURCE
 **/
