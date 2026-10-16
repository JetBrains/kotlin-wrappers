// Automatically generated - do not modify!

package tauri.apps.api.window

/**
 * Inner size constraints for a window, see {@link Window.setSizeConstraints}.
 *
 * Unlike {@link Window.setMinSize} and {@link Window.setMaxSize}, each dimension is
 * independent: you can constrain only the width and leave the height free.
 *
 * All values are in **logical pixels**. Leave a field out (or set it to
 * `undefined`) to remove that constraint.
 *
 * @example
 * ```typescript
 * import { getCurrentWindow } from '@tauri-apps/api/window';
 * // at least 300 logical pixels wide, height unconstrained
 * await getCurrentWindow().setSizeConstraints({ minWidth: 300 });
 * ```
 *
 * @since 2.0.0
 */
external interface WindowSizeConstraints {
    /** The minimum width, in logical pixels. */
    var minWidth: Double?

    /** The minimum height, in logical pixels. */
    var minHeight: Double?

    /** The maximum width, in logical pixels. */
    var maxWidth: Double?

    /** The maximum height, in logical pixels. */
    var maxHeight: Double?
}
