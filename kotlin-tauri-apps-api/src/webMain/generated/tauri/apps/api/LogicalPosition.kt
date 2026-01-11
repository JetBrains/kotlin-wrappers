// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

// unhandled import: SERIALIZE_TO_IPC_FN from "./core"

/**
 * A position represented in logical pixels.
 * For an explanation of what logical pixels are, see description of {@linkcode LogicalSize}.
 *
 * @since 2.0.0
 */
external class LogicalPosition {
    constructor (x: Double, y: Double)
    constructor(`object`: LogicalPositionObjectTemp)
    constructor (`object`: LogicalPositionObject)

    val type: Any? // type isn't declared
    var x: Double
    var y: Double

    /**
     * Converts the logical position to a physical one.
     * @example
     * ```typescript
     * import { LogicalPosition } from '@tauri-apps/api/dpi';
     * import { getCurrentWindow } from '@tauri-apps/api/window';
     *
     * const appWindow = getCurrentWindow();
     * const factor = await appWindow.scaleFactor();
     * const position = new LogicalPosition(400, 500);
     * const physical = position.toPhysical(factor);
     * ```
     *
     * @since 2.0.0
     */
    fun toPhysical(scaleFactor: Double): tauri.apps.api.PhysicalPosition

    fun toJSON(): LogicalPositionToJSONResult
}
