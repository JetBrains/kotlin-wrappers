// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

external class PluginListener {
    constructor (plugin: String, event: String, channelId: Double)

    var plugin: String
    var event: String
    var channelId: Double

    fun unregister(): js.promise.Promise<js.core.Void>
}
