// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api


/**
 * A size represented either in physical or in logical pixels.
 *
 * This type is basically a union type of {@linkcode LogicalSize} and {@linkcode PhysicalSize}
 * but comes in handy when using `tauri::Size` in Rust as an argument to a command, as this class
 * automatically serializes into a valid format so it can be deserialized correctly into `tauri::Size`
 *
 * So instead of
 * ```typescript
 * import { invoke } from '@tauri-apps/api/core';
 * import { LogicalSize, PhysicalSize } from '@tauri-apps/api/dpi';
 *
 * const size: LogicalSize | PhysicalSize = someFunction(); // where someFunction returns either LogicalSize or PhysicalSize
 * const validSize = size instanceof LogicalSize
 *   ? { Logical: { width: size.width, height: size.height } }
 *   : { Physical: { width: size.width, height: size.height } }
 * await invoke("do_something_with_size", { size: validSize });
 * ```
 *
 * You can just use {@linkcode Size}
 * ```typescript
 * import { invoke } from '@tauri-apps/api/core';
 * import { LogicalSize, PhysicalSize, Size } from '@tauri-apps/api/dpi';
 *
 * const size: LogicalSize | PhysicalSize = someFunction(); // where someFunction returns either LogicalSize or PhysicalSize
 * const validSize = new Size(size);
 * await invoke("do_something_with_size", { size: validSize });
 * ```
 *
 * @since 2.1.0
 */
external class Size {
    constructor (size: LogicalSize)

    constructor (size: PhysicalSize)

    var size: Any // LogicalSize | PhysicalSize

    fun toLogical(scaleFactor: Double): LogicalSize

    fun toPhysical(scaleFactor: Double): PhysicalSize

    fun toJSON(): SizeToJSONResult
}
