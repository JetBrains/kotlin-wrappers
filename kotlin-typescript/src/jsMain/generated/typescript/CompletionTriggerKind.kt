// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface CompletionTriggerKind {
    companion object {
        /** Completion was triggered by typing an identifier, manual invocation (e.g Ctrl+Space) or via API. */
        @JsIntValue(1)
        val Invoked: CompletionTriggerKind

        /** Completion was triggered by a trigger character. */
        @JsIntValue(2)
        val TriggerCharacter: CompletionTriggerKind

        /** Completion was re-triggered as the current completion list is incomplete. */
        @JsIntValue(3)
        val TriggerForIncompleteCompletions: CompletionTriggerKind
    }
}
