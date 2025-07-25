// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Contains additional information about the context in which
 * [completion provider][CompletionItemProvider.provideCompletionItems] is triggered.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionContext)
 */
@JsPlainObject
external interface CompletionContext {
    /**
     * How the completion was triggered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionContext.triggerKind)
     */
    val triggerKind: CompletionTriggerKind

    /**
     * Character that triggered the completion item provider.
     *
     * `undefined` if the provider was not triggered by a character.
     *
     * The trigger character is already in the document when the completion provider is triggered.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionContext.triggerCharacter)
     */
    val triggerCharacter: String?
}
