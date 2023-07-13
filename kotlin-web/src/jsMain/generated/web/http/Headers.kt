// Automatically generated - do not modify!

package web.http

import js.collections.MapLike
import js.core.JsTuple2
import js.core.ReadonlyArray
import js.iterable.IterableIterator

/**
 * This Fetch API interface allows you to perform various actions on HTTP request and response headers. These actions include retrieving, setting, adding to, and removing. A Headers object has an associated header list, which is initially empty and consists of zero or more name and value pairs.  You can add to this using methods like append() (see Examples.) In all methods of this interface, header names are matched by case-insensitive byte sequence.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers)
 */
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

    override fun entries(): IterableIterator<JsTuple2<String, String>>
    override fun keys(): IterableIterator<String>
    override fun values(): IterableIterator<String>
    override fun forEach(action: (value: String, key: String) -> Unit)
}
