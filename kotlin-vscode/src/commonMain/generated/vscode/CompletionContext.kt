// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Contains additional information about the context in which
 * {@link CompletionItemProvider.provideCompletionItems completion provider} is triggered.
*/
export interface CompletionContext {
/**
 * How the completion was triggered.
*/
readonly triggerKind: CompletionTriggerKind;

/**
 * Character that triggered the completion item provider.
 *
 * `undefined` if the provider was not triggered by a character.
 *
 * The trigger character is already in the document when the completion provider is triggered.
*/
readonly triggerCharacter: string | undefined;
}

// ORIGINAL SOURCE
 **/
