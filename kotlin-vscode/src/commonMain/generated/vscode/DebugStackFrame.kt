// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Represents a stack frame in a debug session.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugStackFrame)
 */
open external class DebugStackFrame {
    /**
     * Debug session for thread.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugStackFrame.session)
     */
    val session: DebugSession

    /**
     * ID of the associated thread in the debug protocol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugStackFrame.threadId)
     */
    val threadId: Int

    /**
     * ID of the stack frame in the debug protocol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugStackFrame.frameId)
     */
    val frameId: Int

    /**
     * @hidden
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugStackFrame.constructor)
     */
    private constructor(
        session: DebugSession,
        threadId: Int,
        frameId: Int,
    )
}
