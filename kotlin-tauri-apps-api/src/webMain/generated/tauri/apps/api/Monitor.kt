// Automatically generated - do not modify!

package tauri.apps.api

// unhandled import: LogicalPosition from "./dpi"
// unhandled import: LogicalSize from "./dpi"
// unhandled import: PhysicalPosition from "./dpi"
// unhandled import: PhysicalSize from "./dpi"
// unhandled import: Position from "./dpi"
// unhandled import: Size from "./dpi"
// unhandled import: Event from "./event"
// unhandled import: EventName from "./event"
// unhandled import: EventCallback from "./event"
// unhandled import: UnlistenFn from "./event"
// unhandled import: EventTarget from "./event"
// unhandled import: WebviewWindow from "./webviewWindow"
// unhandled import: DragDropEvent from "./webview"
// unhandled import: Image from "./image"

/**
 * Allows you to retrieve information about a given monitor.
 *
 * @since 1.0.0
 */
external interface Monitor {
    /** Human-readable name of the monitor */
    var name: String?

    /** The monitor's resolution. */
    var size: PhysicalSize

    /** the Top-left corner position of the monitor relative to the larger full screen area. */
    var position: PhysicalPosition

    /** The monitor's work area. */
    var workArea: MonitorWorkArea

    /** The scale factor that can be used to map physical pixels to logical pixels. */
    var scaleFactor: Double
}
