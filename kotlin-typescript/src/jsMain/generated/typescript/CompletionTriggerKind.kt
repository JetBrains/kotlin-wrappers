// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

sealed external interface CompletionTriggerKind {
    companion object {
        /** Completion was triggered by typing an identifier, manual invocation (e.g Ctrl+Space) or via API. */
        val Invoked: CompletionTriggerKind

        /** Completion was triggered by a trigger character. */
        val TriggerCharacter: CompletionTriggerKind

        /** Completion was re-triggered as the current completion list is incomplete. */
        val TriggerForIncompleteCompletions: CompletionTriggerKind
    }
}
