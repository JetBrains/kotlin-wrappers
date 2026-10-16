// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

import tauri.apps.api.event.Event
import tauri.apps.api.event.EventName

/**
 * The event passed to a {@link Window.onCloseRequested} handler.
 *
 * Call {@link CloseRequestedEvent.preventDefault} to keep the window open, for
 * example to ask the user to save their work first.
 */
external class CloseRequestedEvent {
    constructor (event: Event<Any?>)

    /** Event name */
    var event: EventName

    /** Event identifier used to unlisten */
    var id: Double

    /**
     * Prevents the window from being closed.
     *
     * Must be called before the handler returns (await anything you need first),
     * otherwise the window is destroyed as usual.
     */
    fun preventDefault()

    /** Whether {@link CloseRequestedEvent.preventDefault} was called on this event. */
    fun isPreventDefault(): Boolean
}
