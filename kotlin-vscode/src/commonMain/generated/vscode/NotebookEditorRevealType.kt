// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Represents a notebook editor that is attached to a {@link NotebookDocument notebook}.
 */
sealed /* enum */
external interface NotebookEditorRevealType {
    companion object {
        /**
         * The range will be revealed with as little scrolling as possible.
         */
        val Default: NotebookEditorRevealType // 0

        /**
         * The range will always be revealed in the center of the viewport.
         */
        val InCenter: NotebookEditorRevealType // 1

        /**
         * If the range is outside the viewport, it will be revealed in the center of the viewport.
         * Otherwise, it will be revealed with as little scrolling as possible.
         */
        val InCenterIfOutsideViewport: NotebookEditorRevealType // 2

        /**
         * The range will always be revealed at the top of the viewport.
         */
        val AtTop: NotebookEditorRevealType // 3
    }
}
