// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * The state of a comment thread.
 */
sealed /* enum */
external interface CommentThreadState {
    companion object {
        /**
         * Unresolved thread state
         */
        val Unresolved: CommentThreadState // 0

        /**
         * Resolved thread state
         */
        val Resolved: CommentThreadState // 1
    }
}
