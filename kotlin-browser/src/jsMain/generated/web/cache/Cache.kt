// Automatically generated - do not modify!

package web.cache

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import web.http.Request
import web.http.Response
import web.url.URL

/**
 * Provides a storage mechanism for Request / Response object pairs that are cached, for example as part of the ServiceWorker life cycle. Note that the Cache interface is exposed to windowed scopes as well as workers. You don't have to use it in conjunction with service workers, even though it is defined in the service worker spec.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache)
 */
sealed external class Cache {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/add)
     */
    suspend fun add(request: Request)

    @JsName("add")
    fun addAsync(request: Request): Promise<Void>
    suspend fun add(request: String)

    @JsName("add")
    fun addAsync(request: String): Promise<Void>
    suspend fun add(request: URL)

    @JsName("add")
    fun addAsync(request: URL): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/addAll)
     */
    suspend fun addAll(requests: ReadonlyArray<Request>)

    @JsName("addAll")
    fun addAllAsync(requests: ReadonlyArray<Request>): Promise<Void>
    suspend fun addAll(requests: ReadonlyArray<String>)

    @JsName("addAll")
    fun addAllAsync(requests: ReadonlyArray<String>): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete)
     */
    suspend fun delete(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Boolean

    @JsName("delete")
    fun deleteAsync(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Boolean>

    suspend fun delete(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): Boolean

    @JsName("delete")
    fun deleteAsync(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Boolean>

    suspend fun delete(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): Boolean

    @JsName("delete")
    fun deleteAsync(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Boolean>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
     */
    suspend fun keys(
        request: Request = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Request>

    @JsName("keys")
    fun keysAsync(
        request: Request = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

    suspend fun keys(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Request>

    @JsName("keys")
    fun keysAsync(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

    suspend fun keys(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Request>

    @JsName("keys")
    fun keysAsync(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/match)
     */
    suspend fun match(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Response?

    @JsName("match")
    fun matchAsync(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

    suspend fun match(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): Response?

    @JsName("match")
    fun matchAsync(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

    suspend fun match(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): Response?

    @JsName("match")
    fun matchAsync(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
     */
    suspend fun matchAll(
        request: Request = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Response>

    @JsName("matchAll")
    fun matchAllAsync(
        request: Request = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

    suspend fun matchAll(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Response>

    @JsName("matchAll")
    fun matchAllAsync(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

    suspend fun matchAll(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): ReadonlyArray<Response>

    @JsName("matchAll")
    fun matchAllAsync(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/put)
     */
    suspend fun put(
        request: Request,
        response: Response,
    )

    @JsName("put")
    fun putAsync(
        request: Request,
        response: Response,
    ): Promise<Void>

    suspend fun put(
        request: String,
        response: Response,
    )

    @JsName("put")
    fun putAsync(
        request: String,
        response: Response,
    ): Promise<Void>

    suspend fun put(
        request: URL,
        response: Response,
    )

    @JsName("put")
    fun putAsync(
        request: URL,
        response: Response,
    ): Promise<Void>
}
