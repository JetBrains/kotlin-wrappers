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

    /** Appends a specified key/value pair as a new search parameter. */
    fun append(
        name: String,
        value: String,
    )

    /** Deletes the given search parameter, and its associated value, from the list of all search parameters. */
    fun delete(name: String)

    /** Returns the first value associated to the given search parameter. */
    operator fun get(name: String): String?

    /** Returns all the values association with a given search parameter. */
    fun getAll(name: String): ReadonlyArray<String>

    /** Returns a Boolean indicating if such a search parameter exists. */
    fun has(name: String): Boolean

    /** Sets the value associated to a given search parameter to the given value. If there were several values, delete the others. */
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
