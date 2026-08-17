// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * How a [completion provider][CompletionItemProvider] was triggered
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionTriggerKind)
 */
/* enum */
external class CompletionTriggerKind
private constructor() {
    /**
     * Completion was triggered normally.
     */
    val Invoke: CompletionTriggerKind // 0

    /**
     * Completion was triggered by a trigger character.
     */
    val TriggerCharacter: CompletionTriggerKind // 1

    /**
     * Completion was re-triggered as current completion list is incomplete
     */
    val TriggerForIncompleteCompletions: CompletionTriggerKind // 2
}
