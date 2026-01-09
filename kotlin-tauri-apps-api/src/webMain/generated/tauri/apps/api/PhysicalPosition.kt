// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

// unhandled import: SERIALIZE_TO_IPC_FN from "./core"

/**
 * A position represented in physical pixels.
 *
 * For an explanation of what physical pixels are, see description of {@linkcode PhysicalSize}.
 *
 * @since 2.0.0
 */
external class PhysicalPosition {
    constructor (x: Double, y: Double)
    constructor(`object`: PhysicalPositionObjectTemp)
    constructor (`object`: PhysicalPositionObject)

    val type: Any? // type isn't declared
    var x: Double
    var y: Double

    /**
     * Converts the physical position to a logical one.
     * @example
     * ```typescript
     * import { PhysicalPosition } from '@tauri-apps/api/dpi';
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     *
     * const appWindow = getCurrentWindow();
     * const factor = await appWindow.scaleFactor();
     * const position = new PhysicalPosition(400, 500);
     * const physical = position.toLogical(factor);
     * ```
     *
     * @since 2.0.0
     */
    fun toLogical(scaleFactor: Double): tauri.apps.api.LogicalPosition

    fun toJSON(): PhysicalPositionToJSONResult
}
