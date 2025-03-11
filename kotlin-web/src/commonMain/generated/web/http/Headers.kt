// Automatically generated - do not modify!

package web.http

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.collections.MapLike
import js.core.JsString
import js.iterable.JsIterator
import js.objects.ReadonlyRecord
import kotlin.js.definedExternally

/**
 * This Fetch API interface allows you to perform various actions on HTTP request and response headers. These actions include retrieving, setting, adding to, and removing. A Headers object has an associated header list, which is initially empty and consists of zero or more name and value pairs.  You can add to this using methods like append() (see Examples.) In all methods of this interface, header names are matched by case-insensitive byte sequence.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers)
 */
open external class Headers(
    init: ReadonlyArray<JsTuple2<JsString, JsString>> = definedExternally,
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
    operator fun get(name: String): String?

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
    operator fun set(
        name: String,
        value: String,
    )

    override fun entries(): JsIterator<JsTuple2<JsString, JsString>>
    override fun keys(): JsIterator<JsString>
    override fun values(): JsIterator<JsString>
    override fun forEach(action: (value: String, key: String) -> Unit)
}
