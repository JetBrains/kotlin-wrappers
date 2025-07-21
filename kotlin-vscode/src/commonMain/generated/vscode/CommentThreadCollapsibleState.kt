// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

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
