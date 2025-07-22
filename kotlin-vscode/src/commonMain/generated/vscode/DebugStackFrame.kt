// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a stack frame in a debug session.
 */
open external class DebugStackFrame {
    /**
    // ORIGINAL SOURCE

    /**
     * Debug session for thread.
    */
    readonly session: DebugSession;

    /**
     * ID of the associated thread in the debug protocol.
    */
    readonly threadId: number;
    /**
     * ID of the stack frame in the debug protocol.
    */
    readonly frameId: number;

    /**
     * @hidden
    */
    private constructor(session: DebugSession, threadId: number, frameId: number);

    // ORIGINAL SOURCE
     **/
}
