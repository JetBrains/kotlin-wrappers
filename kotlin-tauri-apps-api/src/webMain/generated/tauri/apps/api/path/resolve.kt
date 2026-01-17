// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Resolves a sequence of `paths` or `path` segments into an absolute path.
 * @example
 * ```typescript
 * import { resolve, appDataDir } from '@tauri-apps/api/path';
 * const appDataDirPath = await appDataDir();
 * const path = await resolve(appDataDirPath, '..', 'users', 'tauri', 'avatar.png');
 * ```
 *
 * @since 1.0.0
 */
external fun resolve(vararg paths: String): js.promise.Promise<String>
