// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * A custom Debug Adapter Protocol event received from a {@link DebugSession debug session}.
 */
external interface DebugSessionCustomEvent {
    /**
     * The {@link DebugSession debug session} for which the custom event was received.
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
