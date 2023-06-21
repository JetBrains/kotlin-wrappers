// Automatically generated - do not modify!

package web.http

import js.collections.MapLike
import js.core.JsIterable
import js.core.JsTuple2
import js.core.ReadonlyArray

external class Headers(
    init: HeadersInit = definedExternally,
) : MapLike<String, String> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/append) */
    fun append(
        name: String,
        value: String,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/delete) */
    fun delete(name: String)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/get) */
    operator fun get(name: String): String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/getSetCookie) */
    fun getSetCookie(): ReadonlyArray<String>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/has) */
    fun has(name: String): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/set) */
    operator fun set(
        name: String,
        value: String,
    )

    override fun entries(): JsIterable.Iterator<JsTuple2<String, String>>
    override fun keys(): JsIterable.Iterator<String>
    override fun values(): JsIterable.Iterator<String>
    override fun forEach(action: (value: String, key: String) -> Unit)
}
