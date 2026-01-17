// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/app")

package tauri.apps.api.app

import tauri.apps.api.window.Theme

/**
 * Sets the application's theme. Pass in `null` or `undefined` to follow
 * the system theme.
 *
 * @example
 * ```typescript
 * import { setTheme } from '@tauri-apps/api/app';
 * await setTheme('dark');
 * ```
 *
 * #### Platform-specific
 *
 * - **iOS / Android:** Unsupported.
 *
 * @since 2.0.0
 */
external fun setTheme(theme: Theme? = definedExternally): js.promise.Promise<js.core.Void>
