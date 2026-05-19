// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Describes the behavior of decorations when typing/editing at their edges.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DecorationRangeBehavior)
 */
sealed /* enum */
external interface DecorationRangeBehavior {
    companion object {
        /**
         * The decoration's range will widen when edits occur at the start or end.
         */
        val OpenOpen: DecorationRangeBehavior // 0

        /**
         * The decoration's range will not widen when edits occur at the start or end.
         */
        val ClosedClosed: DecorationRangeBehavior // 1

        /**
         * The decoration's range will widen when edits occur at the start, but not at the end.
         */
        val OpenClosed: DecorationRangeBehavior // 2

        /**
         * The decoration's range will widen when edits occur at the end, but not at the start.
         */
        val ClosedOpen: DecorationRangeBehavior // 3
    }
}
