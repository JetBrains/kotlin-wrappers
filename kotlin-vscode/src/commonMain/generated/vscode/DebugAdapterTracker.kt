// Automatically generated - do not modify!

package vscode

import js.core.Void

/**
 * A Debug Adapter Tracker is a means to track the communication between the editor and a Debug Adapter.
 */
external interface DebugAdapterTracker {
    /**
     * A session with the debug adapter is about to be started.
     */
    var onWillStartSession: (() -> Void)?

    /**
     * The debug adapter is about to receive a Debug Adapter Protocol message from the editor.
     */
    var onWillReceiveMessage: ((message: Any?) -> Void)?

    /**
     * The debug adapter has sent a Debug Adapter Protocol message to the editor.
     */
    var onDidSendMessage: ((message: Any?) -> Void)?

    /**
     * The debug adapter session is about to be stopped.
     */
    var onWillStopSession: (() -> Void)?

    /**
     * An error with the debug adapter has occurred.
     */
    var onError: ((error: Error) -> Void)?

    /**
     * The debug adapter has exited with the given exit code or signal.
     */
    var onExit: ((
        code: Int?,
        signal: String?,
    ) -> Void)?
}
