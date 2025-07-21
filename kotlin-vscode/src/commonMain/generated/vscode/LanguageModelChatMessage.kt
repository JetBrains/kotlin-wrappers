// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Represents a message in a chat. Can assume different roles, like user or assistant.
*/
export class LanguageModelChatMessage {

/**
 * Utility to create a new user message.
 *
 * @param content The content of the message.
 * @param name The optional name of a user for the message.
*/
static User(content: string | Array<LanguageModelTextPart | LanguageModelToolResultPart>, name?: string): LanguageModelChatMessage;

/**
 * Utility to create a new assistant message.
 *
 * @param content The content of the message.
 * @param name The optional name of a user for the message.
*/
static Assistant(content: string | Array<LanguageModelTextPart | LanguageModelToolCallPart>, name?: string): LanguageModelChatMessage;

/**
 * The role of this message.
*/
role: LanguageModelChatMessageRole;

/**
 * A string or heterogeneous array of things that a message can contain as content. Some parts may be message-type
 * specific for some models.
*/
content: Array<LanguageModelTextPart | LanguageModelToolResultPart | LanguageModelToolCallPart>;

/**
 * The optional name of a user for this message.
*/
name: string | undefined;

/**
 * Create a new user message.
 *
 * @param role The role of the message.
 * @param content The content of the message.
 * @param name The optional name of a user for the message.
*/
constructor(role: LanguageModelChatMessageRole, content: string | Array<LanguageModelTextPart | LanguageModelToolResultPart | LanguageModelToolCallPart>, name?: string);
}

// ORIGINAL SOURCE
 **/
