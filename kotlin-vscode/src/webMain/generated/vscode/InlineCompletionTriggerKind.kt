// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Describes how an [inline completion provider][InlineCompletionItemProvider] was triggered.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionTriggerKind)
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
