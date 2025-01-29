// Automatically generated - do not modify!

package web.cache

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.http.Request
import web.http.Response
import web.url.URL

/**
 * Provides a storage mechanism for Request / Response object pairs that are cached, for example as part of the ServiceWorker life cycle. Note that the Cache interface is exposed to windowed scopes as well as workers. You don't have to use it in conjunction with service workers, even though it is defined in the service worker spec.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache)
 */
external class Cache
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/add)
     */
    @JsAsync
    suspend fun add(url: String)

    @JsName("add")
    fun addAsync(url: String): Promise<Void>

    @JsAsync
    suspend fun add(url: URL)

    @JsName("add")
    fun addAsync(url: URL): Promise<Void>

    @JsAsync
    suspend fun add(request: Request)

    @JsName("add")
    fun addAsync(request: Request): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/addAll)
     */
    @JsAsync
    suspend fun addAll(requests: ReadonlyArray<Request>)

    @JsName("addAll")
    fun addAllAsync(requests: ReadonlyArray<Request>): Promise<Void>

    @JsAsync
    suspend fun addAll(urls: ReadonlyArray<String>)

    @JsName("addAll")
    fun addAllAsync(urls: ReadonlyArray<String>): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete)
     */
    @JsAsync
    suspend fun delete(
        url: String,
        options: CacheQueryOptions = definedExternally,
    ): Boolean

    @JsName("delete")
    fun deleteAsync(
        url: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun delete(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Boolean

    @JsName("delete")
    fun deleteAsync(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Boolean>

    @JsAsync
    suspend fun delete(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Boolean

    @JsName("delete")
    fun deleteAsync(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Boolean>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
     */
    @JsAsync
    suspend fun keys(
        url: String = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Request>

    @JsName("keys")
    fun keysAsync(
        url: String = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

    @JsAsync
    suspend fun keys(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Request>

    @JsName("keys")
    fun keysAsync(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

    @JsAsync
    suspend fun keys(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Request>

    @JsName("keys")
    fun keysAsync(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/match)
     */
    @JsAsync
    suspend fun match(
        url: String,
        options: CacheQueryOptions = definedExternally,
    ): Response?

    @JsName("match")
    fun matchAsync(
        url: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

    @JsAsync
    suspend fun match(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Response?

    @JsName("match")
    fun matchAsync(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

    @JsAsync
    suspend fun match(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Response?

    @JsName("match")
    fun matchAsync(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
     */
    @JsAsync
    suspend fun matchAll(
        url: String = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Response>

    @JsName("matchAll")
    fun matchAllAsync(
        url: String = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

    @JsAsync
    suspend fun matchAll(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Response>

    @JsName("matchAll")
    fun matchAllAsync(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

    @JsAsync
    suspend fun matchAll(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Response>

    @JsName("matchAll")
    fun matchAllAsync(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/put)
     */
    @JsAsync
    suspend fun put(
        url: String,
        response: Response,
    )

    @JsName("put")
    fun putAsync(
        url: String,
        response: Response,
    ): Promise<Void>

    @JsAsync
    suspend fun put(
        url: URL,
        response: Response,
    )

    @JsName("put")
    fun putAsync(
        url: URL,
        response: Response,
    ): Promise<Void>

    @JsAsync
    suspend fun put(
        request: Request,
        response: Response,
    )

    @JsName("put")
    fun putAsync(
        request: Request,
        response: Response,
    ): Promise<Void>
}
