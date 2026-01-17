// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

/**
 * Returns the list of all the monitors available on the system.
 * @example
 * ```typescript
 * import { availableMonitors } from '@tauri-apps/api/window';
 * const monitors = await availableMonitors();
 * ```
 *
 * @since 1.0.0
 */
external fun availableMonitors(): js.promise.Promise<js.array.ReadonlyArray<Monitor>>
