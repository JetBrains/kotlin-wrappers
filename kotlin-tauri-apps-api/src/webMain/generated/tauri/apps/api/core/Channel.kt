// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

external class Channel<T /* default is Any? */> {
    constructor (onmessage: (response: T) -> Unit = definedExternally)

    /** The callback id returned from {@linkcode transformCallback} */
    var id: Double
    var onmessage: (response: T) -> Unit

    fun toJSON(): String
}
