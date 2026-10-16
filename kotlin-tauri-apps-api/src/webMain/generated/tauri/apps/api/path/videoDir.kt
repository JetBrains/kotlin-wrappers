// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Returns the path to the user's video directory.
 *
 * #### Platform-specific
 *
 * - **Linux:** Resolves to [`xdg-user-dirs`](https://www.freedesktop.org/wiki/Software/xdg-user-dirs/)' `XDG_VIDEOS_DIR`.
 * - **macOS:** Resolves to `$HOME/Movies`.
 * - **Windows:** Resolves to `{FOLDERID_Videos}`.
 * - **Android:** Resolves to the app-specific Movies directory
 *   (`getExternalFilesDir(DIRECTORY_MOVIES)`), typically `.../files/Movies`. It is
 *   private to your app and removed when the app is uninstalled.
 * - **iOS:** Resolves inside the app sandbox.
 * @example
 * ```typescript
 * import { videoDir } from '@tauri-apps/api/path';
 * const videoDirPath = await videoDir();
 * ```
 *
 * @remarks **Breaking change on Android in `tauri` 2.12.0:** `videoDir()` and the
 * `$VIDEO` path variable used to resolve to external *cache* storage
 * (`.../cache`) and now resolve to the app-specific Movies directory
 * (`.../files/Movies`). Files written to the old location are not found at the new
 * one, so migrate them or update your path assumptions.
 *
 * @since 1.0.0
 */
external fun videoDir(): js.promise.Promise<String>
