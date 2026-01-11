// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

// unhandled import: SERIALIZE_TO_IPC_FN from "./core"

/**
 * A size represented in logical pixels.
 * Logical pixels are scaled according to the window's DPI scale.
 * Most browser APIs (i.e. `MouseEvent`'s `clientX`) will return logical pixels.
 *
 * For logical-pixel-based position, see {@linkcode LogicalPosition}.
 *
 * @since 2.0.0
 */
external class LogicalSize {
    constructor (width: Double, height: Double)
    constructor(`object`: LogicalSizeObjectTemp)
    constructor (`object`: LogicalSizeObject)

    val type: Any? // type isn't declared
    var width: Double
    var height: Double

    /**
     * Converts the logical size to a physical one.
     * @example
     * ```typescript
     * import { LogicalSize } from '@tauri-apps/api/dpi';
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     *
     * const appWindow = getCurrentWindow();
     * const factor = await appWindow.scaleFactor();
     * const size = new LogicalSize(400, 500);
     * const physical = size.toPhysical(factor);
     * ```
     *
     * @since 2.0.0
     */
    fun toPhysical(scaleFactor: Double): PhysicalSize

    fun toJSON(): LogicalSizeToJSONResult
}
