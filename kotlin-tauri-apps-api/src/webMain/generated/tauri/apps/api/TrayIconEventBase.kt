// Automatically generated - do not modify!

package tauri.apps.api


external interface TrayIconEventBase<T : TrayIconEventType> {
    /** The tray icon event type */
    var type: T

    /** Id of the tray icon which triggered this event. */
    var id: String

    /** Physical position of the click the triggered this event. */
    var position: PhysicalPosition

    /** Position and size of the tray icon. */
    var rect: TrayIconEventBaseRect
}
