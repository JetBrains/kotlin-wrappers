// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

/**
 * Returns the primary monitor of the system.
 * Returns `null` if it can't identify any monitor as a primary one.
 * @example
 * ```typescript
 * import { primaryMonitor } from '@tauri-apps/api/window';
 * const monitor = await primaryMonitor();
 * ```
 *
 * @since 1.0.0
 */
external fun primaryMonitor(): js.promise.Promise<Monitor?>
