// Automatically generated - do not modify!

package web.cookie

import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import seskar.js.JsAsync
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`CookieStore`** interface of the Cookie Store API provides methods for getting and setting cookies asynchronously from either a page or a service worker.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore)
 */
external class CookieStore
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/change_event)
     */
    var onchange: EventHandler<CookieChangeEvent, CookieStore, CookieStore>?

    /**
     * The **`delete()`** method of the CookieStore interface deletes a cookie that matches the given `name` or `options` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/delete)
     */
    @JsName("delete")
    fun deleteAsync(name: String): Promise<Void>

    @JsName("delete")
    fun deleteAsync(options: CookieStoreDeleteOptions): Promise<Void>

    /**
     * The **`get()`** method of the CookieStore interface returns a Promise that resolves to a single cookie matching the given `name` or `options` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/get)
     */
    @JsName("get")
    fun getAsync(name: String): Promise<CookieListItem?>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun get(options: CookieStoreGetOptions = definedExternally): CookieListItem?

    @JsName("get")
    fun getAsync(options: CookieStoreGetOptions = definedExternally): Promise<CookieListItem?>

    /**
     * The **`getAll()`** method of the CookieStore interface returns a Promise that resolves as an array of cookies that match the `name` or `options` passed to it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/getAll)
     */
    @JsName("getAll")
    fun getAllAsync(name: String): Promise<CookieList>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getAll(options: CookieStoreGetOptions = definedExternally): CookieList

    @JsName("getAll")
    fun getAllAsync(options: CookieStoreGetOptions = definedExternally): Promise<CookieList>

    /**
     * The **`set()`** method of the CookieStore interface sets a cookie with the given `name` and `value` or `options` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/set)
     */
    @JsName("set")
    fun setAsync(
        name: String,
        value: String,
    ): Promise<Void>

    @JsName("set")
    fun setAsync(options: CookieInit): Promise<Void>
}

/**
 * The **`delete()`** method of the CookieStore interface deletes a cookie that matches the given `name` or `options` object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/delete)
 */
suspend inline fun CookieStore.delete(name: String) {
    awaitPromiseLike(deleteAsync(name))
}

suspend inline fun CookieStore.delete(options: CookieStoreDeleteOptions) {
    awaitPromiseLike(deleteAsync(options))
}

/**
 * The **`get()`** method of the CookieStore interface returns a Promise that resolves to a single cookie matching the given `name` or `options` object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/get)
 */
suspend inline fun CookieStore.get(name: String): CookieListItem? {
    return awaitPromiseLike(getAsync(name))
}

/**
 * The **`getAll()`** method of the CookieStore interface returns a Promise that resolves as an array of cookies that match the `name` or `options` passed to it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/getAll)
 */
suspend inline fun CookieStore.getAll(name: String): CookieList {
    return awaitPromiseLike(getAllAsync(name))
}

/**
 * The **`set()`** method of the CookieStore interface sets a cookie with the given `name` and `value` or `options` object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/set)
 */
suspend inline fun CookieStore.set(
    name: String,
    value: String,
) {
    awaitPromiseLike(
        setAsync(
            name,
            value
        )
    )
}

suspend inline fun CookieStore.set(options: CookieInit) {
    awaitPromiseLike(setAsync(options))
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/change_event)
 */
inline val CookieStore.changeEvent: EventInstance<CookieChangeEvent, CookieStore, CookieStore>
    get() = EventInstance(this, "change")
