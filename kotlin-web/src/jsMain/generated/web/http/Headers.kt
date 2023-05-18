// Automatically generated - do not modify!

package web.http

import js.collections.MapLike
import js.core.JsIterable
import js.core.JsTuple2

external class Headers(
    init: HeadersInit = definedExternally,
) : MapLike<String, String> {
    fun append(
        name: String,
        value: String,
    )

    fun delete(name: String)
    operator fun get(name: String): String?
    fun has(name: String): Boolean
    operator fun set(
        name: String,
        value: String,
    )

    override fun entries(): JsIterable.Iterator<JsTuple2<String, String>>
    override fun keys(): JsIterable.Iterator<String>
    override fun values(): JsIterable.Iterator<String>
    override fun forEach(action: (value: String, key: String) -> Unit)
}
