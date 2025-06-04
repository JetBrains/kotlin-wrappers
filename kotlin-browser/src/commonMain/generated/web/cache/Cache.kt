// Automatically generated - do not modify!

package web.cache

import js.array.ReadonlyArray
import js.core.JsBoolean
import js.core.JsString
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.http.Request
import web.http.Response
import web.url.URL
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`Cache`** interface provides a persistent storage mechanism for Request / Response object pairs that are cached in long lived memory.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache)
 */
external class Cache
private constructor() {
    /**
     * The **`add()`** method of the Cache interface takes a URL, retrieves it, and adds the resulting response object to the given cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/add)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun add(url: String)

    @JsName("add")
    fun addAsync(url: String): Promise<Void>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun add(url: URL)

    @JsName("add")
    fun addAsync(url: URL): Promise<Void>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun add(request: Request)

    @JsName("add")
    fun addAsync(request: Request): Promise<Void>

    /**
     * The **`addAll()`** method of the Cache interface takes an array of URLs, retrieves them, and adds the resulting response objects to the given cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/addAll)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun addAll(requests: ReadonlyArray<Request>)

    @JsName("addAll")
    fun addAllAsync(requests: ReadonlyArray<Request>): Promise<Void>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun addAll(urls: ReadonlyArray<JsString>)

    @JsName("addAll")
    fun addAllAsync(urls: ReadonlyArray<JsString>): Promise<Void>

    /**
     * The **`delete()`** method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to `true`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun delete(
        url: String,
        options: CacheQueryOptions = definedExternally,
    ): Boolean

    @JsName("delete")
    fun deleteAsync(
        url: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun delete(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Boolean

    @JsName("delete")
    fun deleteAsync(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<JsBoolean>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun delete(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Boolean

    @JsName("delete")
    fun deleteAsync(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Promise<JsBoolean>

    /**
     * The **`keys()`** method of the Cache interface returns a representing the keys of the Cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
     * The **`match()`** method of the Cache interface returns a Promise that resolves to the Response associated with the first matching request in the Cache object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/match)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
     * The **`matchAll()`** method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
     * The **`put()`** method of the Often, you will just want to Window/fetch one or more requests, then add the result straight to your cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/put)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
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
