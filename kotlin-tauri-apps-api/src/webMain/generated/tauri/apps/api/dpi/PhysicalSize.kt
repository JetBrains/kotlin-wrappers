// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/dpi")

package tauri.apps.api.dpi

/**
 * A size represented in physical pixels.
 *
 * Physical pixels represent actual screen pixels, and are DPI-independent.
 * For high-DPI windows, this means that any point in the window on the screen
 * will have a different position in logical pixels {@linkcode LogicalSize}.
 *
 * For physical-pixel-based position, see {@linkcode PhysicalPosition}.
 *
 * @since 2.0.0
 */
external class PhysicalSize {
    constructor (width: Double, height: Double)
    constructor(`object`: PhysicalSizeObjectTemp)
    constructor (`object`: PhysicalSizeObject)

    val type: Any? // type isn't declared
    var width: Double
    var height: Double

    /**
     * Converts the physical size to a logical one.
     * @example
     * ```typescript
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     * const appWindow = getCurrentWindow();
     * const factor = await appWindow.scaleFactor();
     * const size = await appWindow.innerSize(); // PhysicalSize
     * const logical = size.toLogical(factor);
     * ```
     */
    fun toLogical(scaleFactor: Double): LogicalSize

    fun toJSON(): PhysicalSizeToJSONResult
}
