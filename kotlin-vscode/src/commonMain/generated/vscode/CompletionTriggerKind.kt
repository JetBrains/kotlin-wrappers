// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * How a {@link CompletionItemProvider completion provider} was triggered
 */
sealed /* enum */
external interface CompletionTriggerKind {
    companion object {
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
}
