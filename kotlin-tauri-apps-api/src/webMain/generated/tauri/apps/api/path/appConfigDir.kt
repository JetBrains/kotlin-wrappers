// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Returns the path to the suggested directory for your app's config files.
 * Resolves to `${configDir}/${bundleIdentifier}`, where `bundleIdentifier` is the [`identifier`](https://v2.tauri.app/reference/config/#identifier) value configured in `tauri.conf.json`.
 * @example
 * ```typescript
 * import { appConfigDir } from '@tauri-apps/api/path';
 * const appConfigDirPath = await appConfigDir();
 * ```
 *
 * @since 1.2.0
 */
external fun appConfigDir(): js.promise.Promise<String>
