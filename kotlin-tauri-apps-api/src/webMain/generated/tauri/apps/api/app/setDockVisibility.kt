// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/app")

package tauri.apps.api.app

/**
 * Sets the dock visibility for the application on macOS.
 *
 * @param visible - Whether the dock should be visible or not.
 *
 * @example
 * ```typescript
 * import { setDockVisibility } from '@tauri-apps/api/app';
 * await setDockVisibility(false);
 * ```
 *
 * @remarks Requires the `core:app:allow-set-dock-visibility` permission (not
 * included in `core:app:default`).
 *
 * @since 2.5.0
 */
external fun setDockVisibility(visible: Boolean): js.promise.Promise<js.void.Void>
