// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Debug console mode used by debug session, see [options][DebugSessionOptions].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConsoleMode)
 */
/* enum */
external class DebugConsoleMode
private constructor() {
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
