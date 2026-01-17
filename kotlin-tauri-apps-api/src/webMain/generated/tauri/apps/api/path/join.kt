// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 *  Joins all given `path` segments together using the platform-specific separator as a delimiter, then normalizes the resulting path.
 * @example
 * ```typescript
 * import { join, appDataDir } from '@tauri-apps/api/path';
 * const appDataDirPath = await appDataDir();
 * const path = await join(appDataDirPath, 'users', 'tauri', 'avatar.png');
 * ```
 *
 * @since 1.0.0
 */
external fun join(vararg paths: String): js.promise.Promise<String>
