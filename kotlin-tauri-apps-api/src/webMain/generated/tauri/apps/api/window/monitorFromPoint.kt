// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

/**
 * Returns the monitor that contains the given point. Returns `null` if can't find any.
 * @example
 * ```typescript
 * import { monitorFromPoint } from '@tauri-apps/api/window';
 * const monitor = await monitorFromPoint(100.0, 200.0);
 * ```
 *
 * @since 1.0.0
 */
external fun monitorFromPoint(
    x: Double,
    y: Double,
): js.promise.Promise<Monitor?>
