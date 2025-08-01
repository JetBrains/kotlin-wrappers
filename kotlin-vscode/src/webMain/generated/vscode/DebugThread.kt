// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Represents a thread in a debug session.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugThread)
 */
open external class DebugThread {
    /**
     * Debug session for thread.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugThread.session)
     */
    val session: DebugSession

    /**
     * ID of the associated thread in the debug protocol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugThread.threadId)
     */
    val threadId: Int

    /**
     * @hidden
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugThread.constructor)
     */
    private constructor(
        session: DebugSession,
        threadId: Int,
    )
}
