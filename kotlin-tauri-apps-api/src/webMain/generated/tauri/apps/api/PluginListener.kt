// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

external class PluginListener {
    constructor (plugin: String, event: String, channelId: Double)

    var plugin: String
    var event: String
    var channelId: Double

    fun unregister(): js.promise.Promise<js.core.Void>
}
