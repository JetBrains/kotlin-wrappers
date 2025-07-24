// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Represents a thread in a debug session.
 */
open external class DebugThread {
    /**
     * Debug session for thread.
     */
    val session: DebugSession

    /**
     * ID of the associated thread in the debug protocol.
     */
    val threadId: Int

    /**
     * @hidden
     */
    private constructor(
        session: DebugSession,
        threadId: Int,
    )
}
