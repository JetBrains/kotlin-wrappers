// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

// language=JavaScript
@JsName("""(/*union*/{Invoked: 1, TriggerCharacter: 2, TriggerForIncompleteCompletions: 3}/*union*/)""")
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
