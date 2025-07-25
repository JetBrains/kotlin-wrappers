// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import js.errors.JsError

/**
 * A Debug Adapter Tracker is a means to track the communication between the editor and a Debug Adapter.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterTracker)
 */
external interface DebugAdapterTracker {
    /**
     * A session with the debug adapter is about to be started.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterTracker.onWillStartSession)
     */
    var onWillStartSession: (() -> Unit)?

    /**
     * The debug adapter is about to receive a Debug Adapter Protocol message from the editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterTracker.onWillReceiveMessage)
     */
    var onWillReceiveMessage: ((message: JsAny?) -> Unit)?

    /**
     * The debug adapter has sent a Debug Adapter Protocol message to the editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterTracker.onDidSendMessage)
     */
    var onDidSendMessage: ((message: JsAny?) -> Unit)?

    /**
     * The debug adapter session is about to be stopped.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterTracker.onWillStopSession)
     */
    var onWillStopSession: (() -> Unit)?

    /**
     * An error with the debug adapter has occurred.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterTracker.onError)
     */
    var onError: ((error: JsError) -> Unit)?

    /**
     * The debug adapter has exited with the given exit code or signal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterTracker.onExit)
     */
    var onExit: ((
        code: Int?,
        signal: String?,
    ) -> Unit)?
}
