// Automatically generated - do not modify!

package web.cache

import js.array.ReadonlyArray
import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.core.JsString
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import seskar.js.JsAsync
import web.http.Request
import web.http.Response
import web.url.URL
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`CacheStorage`** interface represents the storage for Cache objects.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage)
 */
external class CacheStorage
private constructor() {
    /**
     * The **`delete()`** method of the CacheStorage interface finds the Cache object matching the `cacheName`, and if found, deletes the Cache object and returns a Promise that resolves to `true`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/delete)
     */
    @JsName("delete")
    fun deleteAsync(cacheName: String): Promise<JsBoolean>

    /**
     * The **`has()`** method of the CacheStorage interface returns a Promise that resolves to `true` if a You can access `CacheStorage` through the Window.caches property in windows or through the WorkerGlobalScope.caches property in workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/has)
     */
    @JsName("has")
    fun hasAsync(cacheName: String): Promise<JsBoolean>

    /**
     * The **`keys()`** method of the CacheStorage interface returns a Promise that will resolve with an array containing strings corresponding to all of the named Cache objects tracked by the CacheStorage object in the order they were created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/keys)
     */
    @JsName("keys")
    fun keysAsync(): Promise<ReadonlyArray<JsString>>

    /**
     * The **`match()`** method of the CacheStorage interface checks if a given Request or URL string is a key for a stored Response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/match)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun match(
        url: String,
        options: MultiCacheQueryOptions = definedExternally,
    ): Response?

    @JsName("match")
    fun matchAsync(
        url: String,
        options: MultiCacheQueryOptions = definedExternally,
    ): Promise<Response?>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun match(
        url: URL,
        options: MultiCacheQueryOptions = definedExternally,
    ): Response?

    @JsName("match")
    fun matchAsync(
        url: URL,
        options: MultiCacheQueryOptions = definedExternally,
    ): Promise<Response?>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun match(
        request: Request,
        options: MultiCacheQueryOptions = definedExternally,
    ): Response?

    @JsName("match")
    fun matchAsync(
        request: Request,
        options: MultiCacheQueryOptions = definedExternally,
    ): Promise<Response?>

    /**
     * The **`open()`** method of the the Cache object matching the `cacheName`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/open)
     */
    @JsName("open")
    fun openAsync(cacheName: String): Promise<Cache>
}

/**
 * The **`delete()`** method of the CacheStorage interface finds the Cache object matching the `cacheName`, and if found, deletes the Cache object and returns a Promise that resolves to `true`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/delete)
 */
suspend inline fun CacheStorage.delete(cacheName: String): Boolean {
    return awaitPromiseLike(deleteAsync(cacheName)).toBoolean()
}

/**
 * The **`has()`** method of the CacheStorage interface returns a Promise that resolves to `true` if a You can access `CacheStorage` through the Window.caches property in windows or through the WorkerGlobalScope.caches property in workers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/has)
 */
suspend inline fun CacheStorage.has(cacheName: String): Boolean {
    return awaitPromiseLike(hasAsync(cacheName)).toBoolean()
}

/**
 * The **`keys()`** method of the CacheStorage interface returns a Promise that will resolve with an array containing strings corresponding to all of the named Cache objects tracked by the CacheStorage object in the order they were created.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/keys)
 */
suspend inline fun CacheStorage.keys(): ReadonlyArray<JsString> {
    return awaitPromiseLike(keysAsync())
}

/**
 * The **`open()`** method of the the Cache object matching the `cacheName`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/open)
 */
suspend inline fun CacheStorage.open(cacheName: String): Cache {
    return awaitPromiseLike(openAsync(cacheName))
}
