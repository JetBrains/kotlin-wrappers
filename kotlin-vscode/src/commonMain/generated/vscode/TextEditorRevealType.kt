// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents different {@link TextEditor.revealRange reveal} strategies in a text editor.
 */
sealed /* enum */
external interface TextEditorRevealType {
    companion object {
        /**
         * The range will be revealed with as little scrolling as possible.
         */
        val Default: TextEditorRevealType // 0

        /**
         * The range will always be revealed in the center of the viewport.
         */
        val InCenter: TextEditorRevealType // 1

        /**
         * If the range is outside the viewport, it will be revealed in the center of the viewport.
         * Otherwise, it will be revealed with as little scrolling as possible.
         */
        val InCenterIfOutsideViewport: TextEditorRevealType // 2

        /**
         * The range will always be revealed at the top of the viewport.
         */
        val AtTop: TextEditorRevealType // 3
    }
}
