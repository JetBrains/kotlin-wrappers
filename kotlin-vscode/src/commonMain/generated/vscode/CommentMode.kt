// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Comment mode of a {@link Comment}
 */
sealed /* enum */
external interface CommentMode {
    companion object {
        /**
         * Displays the comment editor
         */
        val Editing: CommentMode // 0

        /**
         * Displays the preview of the comment
         */
        val Preview: CommentMode // 1
    }
}
