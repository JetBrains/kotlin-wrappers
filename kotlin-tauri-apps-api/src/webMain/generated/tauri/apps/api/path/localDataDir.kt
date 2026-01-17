// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Returns the path to the user's local data directory.
 *
 * #### Platform-specific
 *
 * - **Linux:** Resolves to `$XDG_DATA_HOME` or `$HOME/.local/share`.
 * - **macOS:** Resolves to `$HOME/Library/Application Support`.
 * - **Windows:** Resolves to `{FOLDERID_LocalAppData}`.
 * @example
 * ```typescript
 * import { localDataDir } from '@tauri-apps/api/path';
 * const localDataDirPath = await localDataDir();
 * ```
 *
 * @since 1.0.0
 */
external fun localDataDir(): js.promise.Promise<String>
