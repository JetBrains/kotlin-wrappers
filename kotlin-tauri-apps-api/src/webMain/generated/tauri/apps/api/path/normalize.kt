// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Normalizes the given `path`, resolving `'..'` and `'.'` segments and resolve symbolic links.
 * @example
 * ```typescript
 * import { normalize, appDataDir } from '@tauri-apps/api/path';
 * const appDataDirPath = await appDataDir();
 * const path = await normalize(`${appDataDirPath}/../users/tauri/avatar.png`);
 * ```
 *
 * @since 1.0.0
 */
external fun normalize(path: String): js.promise.Promise<String>
