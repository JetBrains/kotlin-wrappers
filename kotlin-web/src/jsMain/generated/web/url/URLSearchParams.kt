// Automatically generated - do not modify!

package web.url

import js.collections.MapLike
import js.core.JsIterable
import js.core.JsTuple2
import js.core.ReadonlyArray
import js.core.ReadonlyRecord

external class URLSearchParams(
    init: ReadonlyArray<JsTuple2<String, String>> = definedExternally,
) : MapLike<String, String> {
    constructor(init: ReadonlyRecord<String, String> = definedExternally)
    constructor(init: String)
    constructor(init: URLSearchParams)

    val size: Int

    /**
     * Appends a specified key/value pair as a new search parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/append)
     */
    fun append(
        name: String,
        value: String,
    )

    /**
     * Deletes the given search parameter, and its associated value, from the list of all search parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/delete)
     */
    fun delete(
        name: String,
        value: String = definedExternally,
    )

    /**
     * Returns the first value associated to the given search parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/get)
     */
    operator fun get(name: String): String?

    /**
     * Returns all the values association with a given search parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/getAll)
     */
    fun getAll(name: String): ReadonlyArray<String>

    /**
     * Returns a Boolean indicating if such a search parameter exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/has)
     */
    fun has(
        name: String,
        value: String = definedExternally,
    ): Boolean

    /**
     * Sets the value associated to a given search parameter to the given value. If there were several values, delete the others.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/set)
     */
    operator fun set(
        name: String,
        value: String,
    )

    fun sort()

    override fun entries(): JsIterable.Iterator<JsTuple2<String, String>>
    override fun keys(): JsIterable.Iterator<String>
    override fun values(): JsIterable.Iterator<String>
    override fun forEach(action: (value: String, key: String) -> Unit)
}
