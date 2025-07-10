// Automatically generated - do not modify!

package web.cache

import js.array.ReadonlyArray
import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.core.JsString
import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
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
    @JsName("add")
    fun addAsync(url: String): Promise<Void>

    @JsName("add")
    fun addAsync(url: URL): Promise<Void>

    @JsName("add")
    fun addAsync(request: Request): Promise<Void>

    /**
     * The **`addAll()`** method of the Cache interface takes an array of URLs, retrieves them, and adds the resulting response objects to the given cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/addAll)
     */
    @JsName("addAll")
    fun addAllAsync(requests: ReadonlyArray<Request>): Promise<Void>

    @JsName("addAll")
    fun addAllAsync(urls: ReadonlyArray<JsString>): Promise<Void>

    /**
     * The **`delete()`** method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to `true`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete)
     */
    @JsName("delete")
    fun deleteAsync(
        url: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<JsBoolean>

    @JsName("delete")
    fun deleteAsync(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<JsBoolean>

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
    @JsName("keys")
    fun keysAsync(
        url: String = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

    @JsName("keys")
    fun keysAsync(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

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
    @JsName("match")
    fun matchAsync(
        url: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

    @JsName("match")
    fun matchAsync(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

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
    @JsName("matchAll")
    fun matchAllAsync(
        url: String = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

    @JsName("matchAll")
    fun matchAllAsync(
        url: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

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
    @JsName("put")
    fun putAsync(
        url: String,
        response: Response,
    ): Promise<Void>

    @JsName("put")
    fun putAsync(
        url: URL,
        response: Response,
    ): Promise<Void>

    @JsName("put")
    fun putAsync(
        request: Request,
        response: Response,
    ): Promise<Void>
}

/**
 * The **`add()`** method of the Cache interface takes a URL, retrieves it, and adds the resulting response object to the given cache.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/add)
 */
suspend inline fun Cache.add(url: String) {
    awaitPromiseLike(addAsync(url = url))
}

suspend inline fun Cache.add(url: URL) {
    awaitPromiseLike(addAsync(url = url))
}

suspend inline fun Cache.add(request: Request) {
    awaitPromiseLike(addAsync(request = request))
}

/**
 * The **`addAll()`** method of the Cache interface takes an array of URLs, retrieves them, and adds the resulting response objects to the given cache.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/addAll)
 */
suspend inline fun Cache.addAll(requests: ReadonlyArray<Request>) {
    awaitPromiseLike(addAllAsync(requests = requests))
}

suspend inline fun Cache.addAll(urls: ReadonlyArray<JsString>) {
    awaitPromiseLike(addAllAsync(urls = urls))
}

/**
 * The **`delete()`** method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to `true`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete)
 */
suspend inline fun Cache.delete(
    url: String,
    options: CacheQueryOptions,
): Boolean {
    return awaitPromiseLike(
        deleteAsync(
            url = url,
            options = options
        )
    ).toBoolean()
}

/**
 * The **`delete()`** method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to `true`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete)
 */
suspend inline fun Cache.delete(
    url: String,
): Boolean {
    return awaitPromiseLike(deleteAsync(url = url)).toBoolean()
}

suspend inline fun Cache.delete(
    url: URL,
    options: CacheQueryOptions,
): Boolean {
    return awaitPromiseLike(
        deleteAsync(
            url = url,
            options = options
        )
    ).toBoolean()
}

suspend inline fun Cache.delete(
    url: URL,
): Boolean {
    return awaitPromiseLike(deleteAsync(url = url)).toBoolean()
}

suspend inline fun Cache.delete(
    request: Request,
    options: CacheQueryOptions,
): Boolean {
    return awaitPromiseLike(
        deleteAsync(
            request = request,
            options = options
        )
    ).toBoolean()
}

suspend inline fun Cache.delete(
    request: Request,
): Boolean {
    return awaitPromiseLike(deleteAsync(request = request)).toBoolean()
}

/**
 * The **`keys()`** method of the Cache interface returns a representing the keys of the Cache.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
 */
suspend inline fun Cache.keys(
    url: String,
    options: CacheQueryOptions,
): ReadonlyArray<Request> {
    return awaitPromiseLike(
        keysAsync(
            url = url,
            options = options
        )
    )
}

/**
 * The **`keys()`** method of the Cache interface returns a representing the keys of the Cache.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
 */
suspend inline fun Cache.keys(
    url: String,
): ReadonlyArray<Request> {
    return awaitPromiseLike(keysAsync(url = url))
}

/**
 * The **`keys()`** method of the Cache interface returns a representing the keys of the Cache.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
 */
suspend inline fun Cache.keys(): ReadonlyArray<Request> {
    return awaitPromiseLike(keysAsync())
}

suspend inline fun Cache.keys(
    url: URL,
    options: CacheQueryOptions,
): ReadonlyArray<Request> {
    return awaitPromiseLike(
        keysAsync(
            url = url,
            options = options
        )
    )
}

suspend inline fun Cache.keys(
    url: URL,
): ReadonlyArray<Request> {
    return awaitPromiseLike(keysAsync(url = url))
}

suspend inline fun Cache.keys(
    request: Request,
    options: CacheQueryOptions,
): ReadonlyArray<Request> {
    return awaitPromiseLike(
        keysAsync(
            request = request,
            options = options
        )
    )
}

suspend inline fun Cache.keys(
    request: Request,
): ReadonlyArray<Request> {
    return awaitPromiseLike(keysAsync(request = request))
}

/**
 * The **`match()`** method of the Cache interface returns a Promise that resolves to the Response associated with the first matching request in the Cache object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/match)
 */
suspend inline fun Cache.match(
    url: String,
    options: CacheQueryOptions,
): Response? {
    return awaitPromiseLike(
        matchAsync(
            url = url,
            options = options
        )
    )
}

/**
 * The **`match()`** method of the Cache interface returns a Promise that resolves to the Response associated with the first matching request in the Cache object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/match)
 */
suspend inline fun Cache.match(
    url: String,
): Response? {
    return awaitPromiseLike(matchAsync(url = url))
}

suspend inline fun Cache.match(
    url: URL,
    options: CacheQueryOptions,
): Response? {
    return awaitPromiseLike(
        matchAsync(
            url = url,
            options = options
        )
    )
}

suspend inline fun Cache.match(
    url: URL,
): Response? {
    return awaitPromiseLike(matchAsync(url = url))
}

suspend inline fun Cache.match(
    request: Request,
    options: CacheQueryOptions,
): Response? {
    return awaitPromiseLike(
        matchAsync(
            request = request,
            options = options
        )
    )
}

suspend inline fun Cache.match(
    request: Request,
): Response? {
    return awaitPromiseLike(matchAsync(request = request))
}

/**
 * The **`matchAll()`** method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
 */
suspend inline fun Cache.matchAll(
    url: String,
    options: CacheQueryOptions,
): ReadonlyArray<Response> {
    return awaitPromiseLike(
        matchAllAsync(
            url = url,
            options = options
        )
    )
}

/**
 * The **`matchAll()`** method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
 */
suspend inline fun Cache.matchAll(
    url: String,
): ReadonlyArray<Response> {
    return awaitPromiseLike(matchAllAsync(url = url))
}

/**
 * The **`matchAll()`** method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
 */
suspend inline fun Cache.matchAll(): ReadonlyArray<Response> {
    return awaitPromiseLike(matchAllAsync())
}

suspend inline fun Cache.matchAll(
    url: URL,
    options: CacheQueryOptions,
): ReadonlyArray<Response> {
    return awaitPromiseLike(
        matchAllAsync(
            url = url,
            options = options
        )
    )
}

suspend inline fun Cache.matchAll(
    url: URL,
): ReadonlyArray<Response> {
    return awaitPromiseLike(matchAllAsync(url = url))
}

suspend inline fun Cache.matchAll(
    request: Request,
    options: CacheQueryOptions,
): ReadonlyArray<Response> {
    return awaitPromiseLike(
        matchAllAsync(
            request = request,
            options = options
        )
    )
}

suspend inline fun Cache.matchAll(
    request: Request,
): ReadonlyArray<Response> {
    return awaitPromiseLike(matchAllAsync(request = request))
}

/**
 * The **`put()`** method of the Often, you will just want to Window/fetch one or more requests, then add the result straight to your cache.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/put)
 */
suspend inline fun Cache.put(
    url: String,
    response: Response,
) {
    awaitPromiseLike(
        putAsync(
            url = url,
            response = response
        )
    )
}

suspend inline fun Cache.put(
    url: URL,
    response: Response,
) {
    awaitPromiseLike(
        putAsync(
            url = url,
            response = response
        )
    )
}

suspend inline fun Cache.put(
    request: Request,
    response: Response,
) {
    awaitPromiseLike(
        putAsync(
            request = request,
            response = response
        )
    )
}
