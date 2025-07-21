// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * The result of a tool call. This is the counterpart of a {@link LanguageModelToolCallPart tool call} and
 * it can only be included in the content of a User message
*/
export class LanguageModelToolResultPart {
/**
 * The ID of the tool call.
 *
 * *Note* that this should match the {@link LanguageModelToolCallPart.callId callId} of a tool call part.
*/
callId: string;

/**
 * The value of the tool result.
*/
content: Array<LanguageModelTextPart | LanguageModelPromptTsxPart | unknown>;

/**
 * @param callId The ID of the tool call.
 * @param content The content of the tool result.
*/
constructor(callId: string, content: Array<LanguageModelTextPart | LanguageModelPromptTsxPart | unknown>);
}

// ORIGINAL SOURCE
 **/
