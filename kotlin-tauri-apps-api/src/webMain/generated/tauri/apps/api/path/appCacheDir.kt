// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Returns the path to the suggested directory for your app's cache files.
 * Resolves to `${cacheDir}/${bundleIdentifier}`, where `bundleIdentifier` is the [`identifier`](https://v2.tauri.app/reference/config/#identifier) value configured in `tauri.conf.json`.
 * @example
 * ```typescript
 * import { appCacheDir } from '@tauri-apps/api/path';
 * const appCacheDirPath = await appCacheDir();
 * ```
 *
 * @since 1.2.0
 */
external fun appCacheDir(): js.promise.Promise<String>
