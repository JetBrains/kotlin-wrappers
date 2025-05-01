// Automatically generated - do not modify!

package web.http

import js.array.ReadonlyArray
import js.array.Tuple2
import js.collections.MapLike
import js.core.JsString
import js.iterable.JsIterator
import js.objects.ReadonlyRecord
import kotlin.js.definedExternally

/**
 * The **`Headers`** interface of the Fetch API allows you to perform various actions on HTTP request and response headers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers)
 */
open external class Headers(
    init: ReadonlyArray<Tuple2<JsString, JsString>> = definedExternally,
) : MapLike<JsString, JsString> {
    constructor(init: ReadonlyRecord<JsString, JsString>)
    constructor(init: Headers)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/append)
     */
    fun append(
        name: String,
        value: String,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/delete)
     */
    fun delete(name: String)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/get)
     */
    fun get(name: String): String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/getSetCookie)
     */
    fun getSetCookie(): ReadonlyArray<JsString>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/has)
     */
    fun has(name: String): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/set)
     */
    fun set(
        name: String,
        value: String,
    )

    override fun entries(): JsIterator<Tuple2<JsString, JsString>>
    override fun keys(): JsIterator<JsString>
    override fun values(): JsIterator<JsString>
    override fun forEach(action: (value: JsString, key: JsString) -> Unit)
}
