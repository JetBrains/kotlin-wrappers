// Automatically generated - do not modify!

package web.url

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.collections.ReadonlyMap
import js.iterable.JsIterator
import js.objects.ReadonlyRecord

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams)
 */
external class URLSearchParams(
    init: ReadonlyArray<JsTuple2<String, String>> = definedExternally,
) : ReadonlyMap<String, String> {
    constructor(init: ReadonlyRecord<String, String>)
    constructor(init: String)
    constructor(init: URLSearchParams)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/size)
     */
    override val size: Int

    /**
     * Appends a specified key/value pair as a new search parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/append)
     */
    fun append(
        key: String,
        value: String,
    )

    /**
     * Deletes the given search parameter, and its associated value, from the list of all search parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/delete)
     */
    fun delete(
        key: String,
        value: String = definedExternally,
    )

    /**
     * Returns the first value associated to the given search parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/get)
     */
    override operator fun get(key: String): String?

    /**
     * Returns all the values association with a given search parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/getAll)
     */
    fun getAll(key: String): ReadonlyArray<String>

    /**
     * Returns a Boolean indicating if such a search parameter exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/has)
     */
    override fun has(key: String): Boolean
    fun has(
        key: String,
        value: String,
    ): Boolean

    /**
     * Sets the value associated to a given search parameter to the given value. If there were several values, delete the others.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/set)
     */
    operator fun set(
        key: String,
        value: String,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/sort)
     */
    fun sort()

    override fun entries(): JsIterator<JsTuple2<String, String>>
    override fun keys(): JsIterator<String>
    override fun values(): JsIterator<String>
    override fun forEach(action: (value: String, key: String) -> Unit)
}
