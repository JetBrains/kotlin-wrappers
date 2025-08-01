// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Describes what to do with the indentation when pressing Enter.
 */
sealed /* enum */
external interface IndentAction {
    companion object {
        /**
         * Insert new line and copy the previous line's indentation.
         */
        val None: IndentAction // 0

        /**
         * Insert new line and indent once (relative to the previous line's indentation).
         */
        val Indent: IndentAction // 1

        /**
         * Insert two new lines:
         *  - the first one indented which will hold the cursor
         *  - the second one at the same indentation level
         */
        val IndentOutdent: IndentAction // 2

        /**
         * Insert new line and outdent once (relative to the previous line's indentation).
         */
        val Outdent: IndentAction // 3
    }
}
