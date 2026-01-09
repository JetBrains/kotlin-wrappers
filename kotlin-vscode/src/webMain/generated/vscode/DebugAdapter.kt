// Automatically generated - do not modify!

package vscode

/**
 * A debug adapter that implements the Debug Adapter Protocol can be registered with the editor if it implements the DebugAdapter interface.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapter)
 */
external interface DebugAdapter :
    DisposableLike {
    /**
     * An event which fires after the debug adapter has sent a Debug Adapter Protocol message to the editor.
     * Messages can be requests, responses, or events.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapter.onDidSendMessage)
     */
    val onDidSendMessage: Event<DebugProtocolMessage>

    /**
     * Handle a Debug Adapter Protocol message.
     * Messages can be requests, responses, or events.
     * Results or errors are returned via onSendMessage events.
     * @param message A Debug Adapter Protocol message
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapter.handleMessage)
     */
    fun handleMessage(message: DebugProtocolMessage)
}
