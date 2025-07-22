// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package vscode

/**
 * A debug adapter that implements the Debug Adapter Protocol can be registered with the editor if it implements the DebugAdapter interface.
 */
external interface DebugAdapter :
    Disposable {
    /**
     * An event which fires after the debug adapter has sent a Debug Adapter Protocol message to the editor.
     * Messages can be requests, responses, or events.
     */
    val onDidSendMessage: Event<DebugProtocolMessage>

    /**
     * Handle a Debug Adapter Protocol message.
     * Messages can be requests, responses, or events.
     * Results or errors are returned via onSendMessage events.
     * @param message A Debug Adapter Protocol message
     */
//  handleMessage(message: DebugProtocolMessage): void;
}
