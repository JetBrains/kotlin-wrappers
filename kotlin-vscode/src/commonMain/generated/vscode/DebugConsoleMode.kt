// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Debug console mode used by debug session, see {@link DebugSessionOptions options}.
 */
sealed /* enum */
external interface DebugConsoleMode {
    companion object {
        /**
         * Debug session should have a separate debug console.
         */
        val Separate: DebugConsoleMode // 0

        /**
         * Debug session should share debug console with its parent session.
         * This value has no effect for sessions which do not have a parent session.
         */
        val MergeWithParent: DebugConsoleMode // 1
    }
}
