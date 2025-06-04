// Automatically generated - do not modify!

package web.url

import js.array.ReadonlyArray
import js.array.Tuple2
import js.collections.ReadonlyMap
import js.core.JsString
import js.iterable.JsIterator
import js.objects.ReadonlyRecord
import kotlin.js.definedExternally

/**
 * The **`URLSearchParams`** interface defines utility methods to work with the query string of a URL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams)
 */
open external class URLSearchParams(
    init: ReadonlyArray<Tuple2<JsString, JsString>> = definedExternally,
) : ReadonlyMap<JsString, JsString> {
    constructor(init: ReadonlyRecord<JsString, JsString>)
    constructor(init: String)
    constructor(init: URLSearchParams)

    /**
     * The **`size`** read-only property of the URLSearchParams interface indicates the total number of search parameter entries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/size)
     */
    override val size: Int

    /**
     * The **`append()`** method of the URLSearchParams interface appends a specified key/value pair as a new search parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/append)
     */
    fun append(
        key: String,
        value: String,
    )

    /**
     * The **`delete()`** method of the URLSearchParams interface deletes specified parameters and their associated value(s) from the list of all search parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/delete)
     */
    fun delete(
        key: String,
        value: String = definedExternally,
    )

    /**
     * The **`get()`** method of the URLSearchParams interface returns the first value associated to the given search parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/get)
     */
    override fun get(key: JsString): JsString?

    /**
     * The **`getAll()`** method of the URLSearchParams interface returns all the values associated with a given search parameter as an array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/getAll)
     */
    fun getAll(key: String): ReadonlyArray<JsString>

    /**
     * The **`has()`** method of the URLSearchParams interface returns a boolean value that indicates whether the specified parameter is in the search parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/has)
     */
    override fun has(key: JsString): Boolean
    fun has(
        key: String,
        value: String,
    ): Boolean

    /**
     * The **`set()`** method of the URLSearchParams interface sets the value associated with a given search parameter to the given value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/set)
     */
    fun set(
        key: String,
        value: String,
    )

    /**
     * The **`URLSearchParams.sort()`** method sorts all key/value pairs contained in this object in place and returns `undefined`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/sort)
     */
    fun sort()

    override fun entries(): JsIterator<Tuple2<JsString, JsString>>
    override fun keys(): JsIterator<JsString>
    override fun values(): JsIterator<JsString>
    override fun forEach(action: (value: JsString, key: JsString) -> Unit)
}
