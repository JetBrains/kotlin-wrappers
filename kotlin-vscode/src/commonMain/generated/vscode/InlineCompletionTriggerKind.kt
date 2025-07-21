// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Describes how an {@link InlineCompletionItemProvider inline completion provider} was triggered.
 */
sealed /* enum */
external interface InlineCompletionTriggerKind {
    companion object {
        /**
         * Completion was triggered explicitly by a user gesture.
         * Return multiple completion items to enable cycling through them.
         */
        val Invoke: InlineCompletionTriggerKind // 0

        /**
         * Completion was triggered automatically while editing.
         * It is sufficient to return a single completion item in this case.
         */
        val Automatic: InlineCompletionTriggerKind // 1
    }
}
