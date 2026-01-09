// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

// unhandled import: PluginListener from "./core"
// unhandled import: Image from "./image"
// unhandled import: Theme from "./window"

/**
 * Application metadata and related APIs.
 *
 * @module
 */

/**
 * Gets the application version.
 * @example
 * ```typescript
 * import { getVersion } from '@tauri-apps/api/app';
 * const appVersion = await getVersion();
 * ```
 *
 * @since 1.0.0
 */
external fun getVersion(): js.promise.Promise<String>
