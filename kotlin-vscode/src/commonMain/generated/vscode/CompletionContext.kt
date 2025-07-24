// Automatically generated - do not modify!

package vscode

/**
 * Contains additional information about the context in which
 * [completion provider][CompletionItemProvider.provideCompletionItems] is triggered.
 */
external interface CompletionContext {
    /**
     * How the completion was triggered.
     */
    val triggerKind: CompletionTriggerKind

    /**
     * Character that triggered the completion item provider.
     *
     * `undefined` if the provider was not triggered by a character.
     *
     * The trigger character is already in the document when the completion provider is triggered.
     */
    val triggerCharacter: String?
}
