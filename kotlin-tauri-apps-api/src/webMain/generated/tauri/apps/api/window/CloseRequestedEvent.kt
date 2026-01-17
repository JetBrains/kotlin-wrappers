// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

import tauri.apps.api.event.Event
import tauri.apps.api.event.EventName

external class CloseRequestedEvent {
    constructor (event: Event<Any?>)

    /** Event name */
    var event: EventName

    /** Event identifier used to unlisten */
    var id: Double

    fun preventDefault()

    fun isPreventDefault(): Boolean
}
