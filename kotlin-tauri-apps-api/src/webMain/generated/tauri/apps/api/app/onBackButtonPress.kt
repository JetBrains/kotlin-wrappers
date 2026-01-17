// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/app")

package tauri.apps.api.app

import tauri.apps.api.core.PluginListener

/**
 * Listens to the backButton event on Android.
 * @param handler
 */
external fun onBackButtonPress(handler: (payload: OnBackButtonPressPayload) -> Unit): js.promise.Promise<PluginListener>
