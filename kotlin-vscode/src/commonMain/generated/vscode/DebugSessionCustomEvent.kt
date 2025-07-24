// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * A custom Debug Adapter Protocol event received from a [debug session][DebugSession].
 */
external interface DebugSessionCustomEvent {
    /**
     * The [debug session][DebugSession] for which the custom event was received.
     */
    val session: DebugSession

    /**
     * Type of event.
     */
    val event: String

    /**
     * Event specific information.
     */
    val body: JsAny?
}
