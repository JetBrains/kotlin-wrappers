// Automatically generated - do not modify!

package web.cache

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync
import web.http.Request
import web.http.Response
import web.url.URL

/**
 * The storage for Cache objects.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage)
 */
external class CacheStorage
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/delete)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun delete(cacheName: String): Boolean

    @JsName("delete")
    fun deleteAsync(cacheName: String): Promise<Boolean>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/has)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun has(cacheName: String): Boolean

    @JsName("has")
    fun hasAsync(cacheName: String): Promise<Boolean>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/keys)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun keys(): ReadonlyArray<String>

    @JsName("keys")
    fun keysAsync(): Promise<ReadonlyArray<String>>

    /**
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/open)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun open(cacheName: String): Cache

    @JsName("open")
    fun openAsync(cacheName: String): Promise<Cache>
}
