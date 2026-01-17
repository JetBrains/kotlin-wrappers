// Automatically generated - do not modify!

package tauri.apps.api.window

import tauri.apps.api.dpi.PhysicalSize

/**
 * The payload for the `scaleChange` event.
 *
 * @since 1.0.2
 */
external interface ScaleFactorChanged {
    /** The new window scale factor. */
    var scaleFactor: Double

    /** The new window size */
    var size: PhysicalSize
}
