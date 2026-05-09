// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Rendering style of the cursor.
 */
sealed /* enum */
external interface TextEditorCursorStyle {
    companion object {
        /**
         * Render the cursor as a vertical thick line.
         */
        val Line: TextEditorCursorStyle // 1

        /**
         * Render the cursor as a block filled.
         */
        val Block: TextEditorCursorStyle // 2

        /**
         * Render the cursor as a thick horizontal line.
         */
        val Underline: TextEditorCursorStyle // 3

        /**
         * Render the cursor as a vertical thin line.
         */
        val LineThin: TextEditorCursorStyle // 4

        /**
         * Render the cursor as a block outlined.
         */
        val BlockOutline: TextEditorCursorStyle // 5

        /**
         * Render the cursor as a thin horizontal line.
         */
        val UnderlineThin: TextEditorCursorStyle // 6
    }
}
