// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/dpi")

package tauri.apps.api.dpi

/**
 * A position represented either in physical or in logical pixels.
 *
 * This type is basically a union type of {@linkcode LogicalPosition} and {@linkcode PhysicalPosition}
 * but comes in handy when using `tauri::Position` in Rust as an argument to a command, as this class
 * automatically serializes into a valid format so it can be deserialized correctly into `tauri::Position`
 *
 * So instead of
 * ```typescript
 * import { invoke } from '@tauri-apps/api/core';
 * import { LogicalPosition, PhysicalPosition } from '@tauri-apps/api/dpi';
 *
 * const position: LogicalPosition | PhysicalPosition = someFunction(); // where someFunction returns either LogicalPosition or PhysicalPosition
 * const validPosition = position instanceof LogicalPosition
 *   ? { Logical: { x: position.x, y: position.y } }
 *   : { Physical: { x: position.x, y: position.y } }
 * await invoke("do_something_with_position", { position: validPosition });
 * ```
 *
 * You can just use {@linkcode Position}
 * ```typescript
 * import { invoke } from '@tauri-apps/api/core';
 * import { LogicalPosition, PhysicalPosition, Position } from '@tauri-apps/api/dpi';
 *
 * const position: LogicalPosition | PhysicalPosition = someFunction(); // where someFunction returns either LogicalPosition or PhysicalPosition
 * const validPosition = new Position(position);
 * await invoke("do_something_with_position", { position: validPosition });
 * ```
 *
 * @since 2.1.0
 */
external class Position {
    constructor (position: LogicalPosition)

    constructor (position: PhysicalPosition)

    var position: Any /* LogicalPosition | PhysicalPosition */

    /**
     * Converts the wrapped position to a logical one.
     *
     * Returns the inner value untouched when it already is a {@linkcode LogicalPosition}.
     *
     * @param scaleFactor The monitor scale factor, e.g. `await appWindow.scaleFactor()`.
     *
     * @since 2.1.0
     */
    fun toLogical(scaleFactor: Double): LogicalPosition

    /**
     * Converts the wrapped position to a physical one.
     *
     * Returns the inner value untouched when it already is a {@linkcode PhysicalPosition}.
     *
     * @param scaleFactor The monitor scale factor, e.g. `await appWindow.scaleFactor()`.
     *
     * @since 2.1.0
     */
    fun toPhysical(scaleFactor: Double): PhysicalPosition

    fun toJSON(): js.objects.ReadonlyRecord<String, Temp5>
}
