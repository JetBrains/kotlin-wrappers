// Automatically generated - do not modify!

package tauri.apps.api.event

external interface Event<T> {
    /** Event name */
    var event: EventName

    /** Event identifier used to unlisten */
    var id: Double

    /** Event payload */
    var payload: T
}
