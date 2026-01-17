// Automatically generated - do not modify!

package tauri.apps.api


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
