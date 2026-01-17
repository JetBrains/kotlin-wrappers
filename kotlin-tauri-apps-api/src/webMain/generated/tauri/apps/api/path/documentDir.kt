// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Returns the path to the user's document directory.
 * @example
 * ```typescript
 * import { documentDir } from '@tauri-apps/api/path';
 * const documentDirPath = await documentDir();
 * ```
 *
 * #### Platform-specific
 *
 * - **Linux:** Resolves to [`xdg-user-dirs`](https://www.freedesktop.org/wiki/Software/xdg-user-dirs/)' `XDG_DOCUMENTS_DIR`.
 * - **macOS:** Resolves to `$HOME/Documents`.
 * - **Windows:** Resolves to `{FOLDERID_Documents}`.
 *
 * @since 1.0.0
 */
external fun documentDir(): js.promise.Promise<String>
