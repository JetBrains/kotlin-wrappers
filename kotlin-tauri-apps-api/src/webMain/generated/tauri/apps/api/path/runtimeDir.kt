// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Returns the path to the user's runtime directory.
 *
 * #### Platform-specific
 *
 * - **Android:** Unsupported. The {@link BaseDirectory.Runtime} variant does not
 *   exist there and the call rejects.
 *
 * - **Linux:** Resolves to `$XDG_RUNTIME_DIR`.
 * - **macOS:** Not supported.
 * - **Windows:** Not supported.
 * @example
 * ```typescript
 * import { runtimeDir } from '@tauri-apps/api/path';
 * const runtimeDirPath = await runtimeDir();
 * ```
 *
 * @since 1.0.0
 */
external fun runtimeDir(): js.promise.Promise<String>
