// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/path")

package tauri.apps.api.path

/**
 * Returns the path to the suggested directory for your app's log files.
 *
 * #### Platform-specific
 *
 * - **Linux:** Resolves to `${localDataDir}/${bundleIdentifier}/logs`.
 * - **macOS:** Resolves to `${homeDir}/Library/Logs/{bundleIdentifier}`
 * - **Windows:** Resolves to `${localDataDir}/${bundleIdentifier}/logs`.
 *
 * All of them can be overridden with the [`app > appDirectoriesOverride`](https://v2.tauri.app/reference/config/#appdirectoriesoverride) config (a single root override resolves to `${root}/logs`).
 * @example
 * ```typescript
 * import { appLogDir } from '@tauri-apps/api/path';
 * const appLogDirPath = await appLogDir();
 * ```
 *
 * @since 1.2.0
 */
external fun appLogDir(): js.promise.Promise<String>
