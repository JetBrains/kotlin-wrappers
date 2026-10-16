// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/app")

package tauri.apps.api.app

/**
 * Exits the app with the given exit code.
 *
 * This is the same as the `exit` function of the `@tauri-apps/plugin-process` plugin,
 * but does not require a plugin to be installed.
 *
 * #### Platform-specific
 *
 * - **Android**: The activity is finished instead of the process being killed,
 *   so the app closes with the system transition; `code` is ignored.
 *
 * @example
 * ```typescript
 * import { exit } from '@tauri-apps/api/app';
 * await exit(1);
 * ```
 *
 * @param code The exit code to use. Defaults to `0`.
 * @returns A promise indicating the success or failure of the operation.
 *
 * @remarks Requires the `core:app:allow-exit` permission (not included in
 * `core:app:default`).
 *
 * @since 2.12.0
 */
external fun exit(code: Double = definedExternally): js.promise.Promise<js.void.Void>
