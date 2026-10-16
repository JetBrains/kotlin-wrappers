// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/app")

package tauri.apps.api.app

/**
 * Whether the current platform can show more than one window at a time.
 *
 * Use it to hide or disable multi-window features on platforms where creating a
 * second window is not possible.
 *
 * #### Platform-specific
 *
 * - **Windows / Linux / macOS:** Always `true`.
 * - **Android:** `true` on API level 32 (Android 12L) and above.
 * - **iOS:** Reflects [`UIApplication.supportsMultipleScenes`](https://developer.apple.com/documentation/uikit/uiapplication/supportsmultiplescenes),
 *   so it is `true` on iPadOS and `false` on iPhone.
 *
 * See the [mobile multiwindow guide](https://tauri.app/learn/mobile-multiwindow/)
 * for how windows behave on mobile.
 *
 * @example
 * ```typescript
 * import { supportsMultipleWindows } from '@tauri-apps/api/app';
 * import { WebviewWindow } from '@tauri-apps/api/webviewWindow';
 *
 * if (await supportsMultipleWindows()) {
 *   new WebviewWindow('settings', { url: '/settings' });
 * }
 * ```
 *
 * @since 2.11.0
 */
external fun supportsMultipleWindows(): js.promise.Promise<Boolean>
