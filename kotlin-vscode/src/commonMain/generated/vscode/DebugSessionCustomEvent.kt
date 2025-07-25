// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * A custom Debug Adapter Protocol event received from a [debug session][DebugSession].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSessionCustomEvent)
 */
external interface DebugSessionCustomEvent {
    /**
     * The [debug session][DebugSession] for which the custom event was received.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSessionCustomEvent.session)
     */
    val session: DebugSession

    /**
     * Type of event.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSessionCustomEvent.event)
     */
    val event: String

    /**
     * Event specific information.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugSessionCustomEvent.body)
     */
    val body: JsAny?
}
