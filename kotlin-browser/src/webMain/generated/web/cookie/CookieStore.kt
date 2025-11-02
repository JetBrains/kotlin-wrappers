// Automatically generated - do not modify!

package web.cookie

import js.core.Void
import js.promise.Promise
import js.promise.await
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
open external class CookieStore
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/change_event)
     */
    var onchange: EventHandler<CookieChangeEvent, CookieStore, CookieStore>?

    /**
     * The **`delete()`** method of the CookieStore interface deletes a cookie that matches the given name or options object. The method expires the cookie by changing its date to one in the past.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/delete)
     */
    @JsName("delete")
    fun deleteAsync(name: String): Promise<Void>

    @JsName("delete")
    fun deleteAsync(options: CookieStoreDeleteOptions): Promise<Void>

    /**
     * The **`get()`** method of the CookieStore interface returns a Promise that resolves to a single cookie matching the given name or options object. The method will return the first cookie that matches.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/get)
     */
    @JsName("get")
    fun getAsync(name: String): Promise<CookieListItem?>

    @JsName("get")
    fun getAsync(options: CookieStoreGetOptions = definedExternally): Promise<CookieListItem?>

    /**
     * The **`getAll()`** method of the CookieStore interface returns a Promise that resolves as an array of cookies that match the name or options passed to it. Passing no parameters will return all cookies for the current context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/getAll)
     */
    @JsName("getAll")
    fun getAllAsync(name: String): Promise<CookieList>

    @JsName("getAll")
    fun getAllAsync(options: CookieStoreGetOptions = definedExternally): Promise<CookieList>

    /**
     * The **`set()`** method of the CookieStore interface sets a cookie with the given name and value or options object.
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
 * The **`delete()`** method of the CookieStore interface deletes a cookie that matches the given name or options object. The method expires the cookie by changing its date to one in the past.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/delete)
 */
suspend inline fun CookieStore.delete(name: String) {
    deleteAsync(
        name = name,
    ).await()
}

suspend inline fun CookieStore.delete(options: CookieStoreDeleteOptions) {
    deleteAsync(
        options = options,
    ).await()
}

/**
 * The **`get()`** method of the CookieStore interface returns a Promise that resolves to a single cookie matching the given name or options object. The method will return the first cookie that matches.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/get)
 */
suspend inline fun CookieStore.get(name: String): CookieListItem? {
    return getAsync(
        name = name,
    ).await()
}

suspend inline fun CookieStore.get(): CookieListItem? {
    return getAsync().await()
}

suspend inline fun CookieStore.get(options: CookieStoreGetOptions): CookieListItem? {
    return getAsync(
        options = options,
    ).await()
}

/**
 * The **`getAll()`** method of the CookieStore interface returns a Promise that resolves as an array of cookies that match the name or options passed to it. Passing no parameters will return all cookies for the current context.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/getAll)
 */
suspend inline fun CookieStore.getAll(name: String): CookieList {
    return getAllAsync(
        name = name,
    ).await()
}

suspend inline fun CookieStore.getAll(): CookieList {
    return getAllAsync().await()
}

suspend inline fun CookieStore.getAll(options: CookieStoreGetOptions): CookieList {
    return getAllAsync(
        options = options,
    ).await()
}

/**
 * The **`set()`** method of the CookieStore interface sets a cookie with the given name and value or options object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/set)
 */
suspend inline fun CookieStore.set(
    name: String,
    value: String,
) {
    setAsync(
        name = name,
        value = value,
    ).await()
}

suspend inline fun CookieStore.set(options: CookieInit) {
    setAsync(
        options = options,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStore/change_event)
 */
inline val <C : CookieStore> C.changeEvent: EventInstance<CookieChangeEvent, C, C>
    get() = EventInstance(this, "change")
