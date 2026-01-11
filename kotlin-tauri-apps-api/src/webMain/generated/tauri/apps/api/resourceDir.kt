// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

/**
 * Returns the path to the application's resource directory.
 * To resolve a resource path, see {@linkcode resolveResource}.
 *
 * ## Platform-specific
 *
 * Although we provide the exact path where this function resolves to,
 * this is not a contract and things might change in the future
 *
 * - **Windows:** Resolves to the directory that contains the main executable.
 * - **Linux:** When running in an AppImage, the `APPDIR` variable will be set to
 *   the mounted location of the app, and the resource dir will be `${APPDIR}/usr/lib/${exe_name}`.
 *   If not running in an AppImage, the path is `/usr/lib/${exe_name}`.
 *   When running the app from `src-tauri/target/(debug|release)/`, the path is `${exe_dir}/../lib/${exe_name}`.
 * - **macOS:** Resolves to `${exe_dir}/../Resources` (inside .app).
 * - **iOS:** Resolves to `${exe_dir}/assets`.
 * - **Android:** Currently the resources are stored in the APK as assets so it's not a normal file system path,
 *   we return a special URI prefix `asset://localhost/` here that can be used with the [file system plugin](https://tauri.app/plugin/file-system/),
 *
 * @example
 * ```typescript
 * import { resourceDir } from '@tauri-apps/api/path';
 * const resourceDirPath = await resourceDir();
 * ```
 *
 * @since 1.0.0
 */
external fun resourceDir(): js.promise.Promise<String>
