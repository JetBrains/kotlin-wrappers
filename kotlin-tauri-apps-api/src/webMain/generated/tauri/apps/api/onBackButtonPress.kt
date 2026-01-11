// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

// unhandled import: PluginListener from "./core"
// unhandled import: Image from "./image"
// unhandled import: Theme from "./window"

/**
 * Listens to the backButton event on Android.
 * @param handler
 */
external fun onBackButtonPress(handler: (payload: OnBackButtonPressPayload) -> Unit): js.promise.Promise<PluginListener>
