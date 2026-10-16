// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/app")

package tauri.apps.api.app

/**
 * Shows the application on macOS. This function does not automatically
 * focus any specific app window.
 *
 * @example
 * ```typescript
 * import { show } from '@tauri-apps/api/app';
 * await show();
 * ```
 *
 * @remarks Requires the `core:app:allow-app-show` permission (not included in `core:app:default`).
 *
 * @since 1.2.0
 */
external fun show(): js.promise.Promise<js.void.Void>
