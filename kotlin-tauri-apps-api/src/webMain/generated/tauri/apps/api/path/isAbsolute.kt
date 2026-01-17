// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Returns whether the path is absolute or not.
 * @example
 * ```typescript
 * import { isAbsolute } from '@tauri-apps/api/path';
 * assert(await isAbsolute('/home/tauri'));
 * ```
 *
 * @since 1.0.0
 */
external fun isAbsolute(path: String): js.promise.Promise<Boolean>
