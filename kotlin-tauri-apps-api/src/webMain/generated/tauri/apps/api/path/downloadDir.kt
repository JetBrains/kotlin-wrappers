// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Returns the path to the user's download directory.
 *
 * #### Platform-specific
 *
 * - **Linux**: Resolves to [`xdg-user-dirs`](https://www.freedesktop.org/wiki/Software/xdg-user-dirs/)' `XDG_DOWNLOAD_DIR`.
 * - **macOS**: Resolves to `$HOME/Downloads`.
 * - **Windows**: Resolves to `{FOLDERID_Downloads}`.
 * @example
 * ```typescript
 * import { downloadDir } from '@tauri-apps/api/path';
 * const downloadDirPath = await downloadDir();
 * ```
 *
 * @since 1.0.0
 */
external fun downloadDir(): js.promise.Promise<String>
