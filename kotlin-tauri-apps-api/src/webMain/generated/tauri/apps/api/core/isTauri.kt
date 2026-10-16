// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

/**
 * Checks whether the code is running inside a Tauri webview.
 *
 * Useful for frontends that are also served on the web, to guard calls to APIs
 * that only exist inside the application.
 *
 * @example
 * ```typescript
 * import { isTauri } from '@tauri-apps/api/core';
 * import { getVersion } from '@tauri-apps/api/app';
 *
 * const version = isTauri() ? await getVersion() : 'web';
 * ```
 *
 * @returns `true` when running inside a Tauri app, `false` otherwise (e.g. in a
 * browser or in unit tests).
 *
 * @since 2.0.0
 */
external fun isTauri(): Boolean
