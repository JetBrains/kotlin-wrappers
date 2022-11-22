package web.url

import kotlinx.js.*

external class URLSearchParams() :
    HasSymbol.iterator<JsTuple2<String, String>> {

    constructor(init: ReadonlyArray<JsTuple2<String, String>>)
    constructor(init: ReadonlyRecord<String, String>)
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
    fun get(name: String): String?

    /** Returns all the values association with a given search parameter. */
    fun getAll(name: String): ReadonlyArray<String>

    /** Returns a Boolean indicating if such a search parameter exists. */
    fun has(name: String): Boolean

    /** Sets the value associated to a given search parameter to the given value. If there were several values, delete the others. */
    fun set(
        name: String,
        value: String
    )

    fun sort()
    fun forEach(action: (item: String) -> Unit)

    fun entries(): JsIterable.Iterator<JsTuple2<String, String>>
    fun keys(): JsIterable.Iterator<String>
    fun values(): JsIterable.Iterator<String>
}
