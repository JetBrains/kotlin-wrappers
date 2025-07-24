// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * The reason why code actions were requested.
 */
sealed /* enum */
external interface CodeActionTriggerKind {
    companion object {
        /**
         * Code actions were explicitly requested by the user or by an extension.
         */
        val Invoke: CodeActionTriggerKind // 1

        /**
         * Code actions were requested automatically.
         *
         * This typically happens when current selection in a file changes, but can
         * also be triggered when file content changes.
         */
        val Automatic: CodeActionTriggerKind // 2
    }
}
