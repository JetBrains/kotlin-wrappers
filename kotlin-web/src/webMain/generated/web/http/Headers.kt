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
     * The **`append()`** method of the Headers interface appends a new value onto an existing header inside a `Headers` object, or adds the header if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/append)
     */
    fun append(
        name: String,
        value: String,
    )

    /**
     * The **`delete()`** method of the Headers interface deletes a header from the current `Headers` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/delete)
     */
    fun delete(name: String)

    /**
     * The **`get()`** method of the Headers interface returns a byte string of all the values of a header within a `Headers` object with a given name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/get)
     */
    fun get(name: String): String?

    /**
     * The **`getSetCookie()`** method of the Headers interface returns an array containing the values of all Set-Cookie headers associated with a response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/getSetCookie)
     */
    fun getSetCookie(): ReadonlyArray<JsString>

    /**
     * The **`has()`** method of the Headers interface returns a boolean stating whether a `Headers` object contains a certain header.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/has)
     */
    fun has(name: String): Boolean

    /**
     * The **`set()`** method of the Headers interface sets a new value for an existing header inside a `Headers` object, or adds the header if it does not already exist.
     *
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
