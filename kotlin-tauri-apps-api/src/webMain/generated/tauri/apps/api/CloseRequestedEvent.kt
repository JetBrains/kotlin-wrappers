// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api


external class CloseRequestedEvent {
    constructor (event: Event<Any?>)

    /** Event name */
    var event: EventName

    /** Event identifier used to unlisten */
    var id: Double

    fun preventDefault()

    fun isPreventDefault(): Boolean
}
