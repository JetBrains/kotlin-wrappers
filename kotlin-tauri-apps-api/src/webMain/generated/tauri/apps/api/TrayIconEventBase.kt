// Automatically generated - do not modify!

package tauri.apps.api

// unhandled import: Menu from "./menu"
// unhandled import: Submenu from "./menu"
// unhandled import: Resource from "./core"
// unhandled import: Image from "./image"
// unhandled import: PhysicalPosition from "./dpi"
// unhandled import: PhysicalSize from "./dpi"

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
