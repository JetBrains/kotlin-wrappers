// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

/**
 * A handle to a listener registered with {@linkcode addPluginListener}.
 *
 * Keep the returned instance around and call {@linkcode PluginListener.unregister}
 * when the listener goes out of scope, otherwise the plugin keeps sending events
 * to a handler nothing uses anymore.
 *
 * @since 2.0.0
 */
external class PluginListener {
    constructor (plugin: String, event: String, channelId: Double)

    /** The plugin name the listener is registered to. */
    var plugin: String

    /** The plugin event name the listener is registered to. */
    var event: String

    /** The id of the {@linkcode Channel} backing this listener. */
    var channelId: Double

    /** Removes this listener from the plugin, so its handler stops being called. */
    fun unregister(): js.promise.Promise<js.void.Void>
}
