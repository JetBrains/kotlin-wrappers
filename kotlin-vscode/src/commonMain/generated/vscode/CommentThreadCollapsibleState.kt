// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Collapsible state of a {@link CommentThread comment thread}
 */
sealed /* enum */
external interface CommentThreadCollapsibleState {
    companion object {
        /**
         * Determines an item is collapsed
         */
        val Collapsed: CommentThreadCollapsibleState // 0

        /**
         * Determines an item is expanded
         */
        val Expanded: CommentThreadCollapsibleState // 1
    }
}
