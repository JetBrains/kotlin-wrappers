// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/app")

package tauri.apps.api.app

import tauri.apps.api.core.PluginListener

/**
 * Listens to the Android hardware/gesture back button.
 *
 * Registering a handler takes over the default behavior, so the app no longer
 * navigates back or closes on its own: decide what to do inside the handler,
 * using `payload.canGoBack` to know whether the webview has history to go back to.
 *
 * #### Platform-specific
 *
 * - **Android:** Supported.
 * - **Windows / Linux / macOS / iOS:** Unsupported, the handler is never called.
 *
 * @example
 * ```typescript
 * import { onBackButtonPress } from '@tauri-apps/api/app';
 * import { exit } from '@tauri-apps/api/app';
 *
 * const listener = await onBackButtonPress(({ canGoBack }) => {
 *   if (canGoBack) {
 *     window.history.back();
 *   } else {
 *     void exit(0);
 *   }
 * });
 *
 * // stop handling the back button
 * await listener.unregister();
 * ```
 *
 * @param handler Called on every back button press.
 * @returns A listener handle, call `unregister()` on it to restore the default behavior.
 *
 * @since 2.9.0
 */
external fun onBackButtonPress(handler: (payload: OnBackButtonPressPayload) -> Unit): js.promise.Promise<PluginListener>
