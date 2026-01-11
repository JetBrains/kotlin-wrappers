// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

/**
 * Adds a listener to a plugin event.
 *
 * @returns The listener object to stop listening to the events.
 *
 * @since 2.0.0
 */
external fun <T> addPluginListener(
    plugin: String,
    event: String,
    cb: (payload: T) -> Unit,
): js.promise.Promise<PluginListener>
