// Automatically generated - do not modify!

package web.cache

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.http.Request
import web.http.Response
import web.url.URL
import kotlin.js.JsBoolean
import kotlin.js.JsName
import kotlin.js.JsString
import kotlin.js.definedExternally
import kotlin.js.toBoolean

/**
 * The **`Cache`** interface provides a persistent storage mechanism for Request / Response object pairs that are cached in long lived memory.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache)
 */
open external class Cache
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
     * The **`keys()`** method of the Cache interface returns a Promise that resolves to an array of Request objects representing the keys of the Cache.
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
     * The **`put()`** method of the Cache interface allows key/value pairs to be added to the current Cache object.
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
    addAsync(
        url = url,
    ).await()
}

suspend inline fun Cache.add(url: URL) {
    addAsync(
        url = url,
    ).await()
}

suspend inline fun Cache.add(request: Request) {
    addAsync(
        request = request,
    ).await()
}

/**
 * The **`addAll()`** method of the Cache interface takes an array of URLs, retrieves them, and adds the resulting response objects to the given cache.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/addAll)
 */
suspend inline fun Cache.addAll(requests: ReadonlyArray<Request>) {
    addAllAsync(
        requests = requests,
    ).await()
}

suspend inline fun Cache.addAll(urls: ReadonlyArray<JsString>) {
    addAllAsync(
        urls = urls,
    ).await()
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
    return deleteAsync(
        url = url,
        options = options,
    ).await().toBoolean()
}

/**
 * The **`delete()`** method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to `true`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete)
 */
suspend inline fun Cache.delete(
    url: String,
): Boolean {
    return deleteAsync(
        url = url,
    ).await().toBoolean()
}

suspend inline fun Cache.delete(
    url: URL,
    options: CacheQueryOptions,
): Boolean {
    return deleteAsync(
        url = url,
        options = options,
    ).await().toBoolean()
}

suspend inline fun Cache.delete(
    url: URL,
): Boolean {
    return deleteAsync(
        url = url,
    ).await().toBoolean()
}

suspend inline fun Cache.delete(
    request: Request,
    options: CacheQueryOptions,
): Boolean {
    return deleteAsync(
        request = request,
        options = options,
    ).await().toBoolean()
}

suspend inline fun Cache.delete(
    request: Request,
): Boolean {
    return deleteAsync(
        request = request,
    ).await().toBoolean()
}

/**
 * The **`keys()`** method of the Cache interface returns a Promise that resolves to an array of Request objects representing the keys of the Cache.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
 */
suspend inline fun Cache.keys(
    url: String,
    options: CacheQueryOptions,
): ReadonlyArray<Request> {
    return keysAsync(
        url = url,
        options = options,
    ).await()
}

/**
 * The **`keys()`** method of the Cache interface returns a Promise that resolves to an array of Request objects representing the keys of the Cache.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
 */
suspend inline fun Cache.keys(
    url: String,
): ReadonlyArray<Request> {
    return keysAsync(
        url = url,
    ).await()
}

/**
 * The **`keys()`** method of the Cache interface returns a Promise that resolves to an array of Request objects representing the keys of the Cache.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
 */
suspend inline fun Cache.keys(): ReadonlyArray<Request> {
    return keysAsync().await()
}

suspend inline fun Cache.keys(
    url: URL,
    options: CacheQueryOptions,
): ReadonlyArray<Request> {
    return keysAsync(
        url = url,
        options = options,
    ).await()
}

suspend inline fun Cache.keys(
    url: URL,
): ReadonlyArray<Request> {
    return keysAsync(
        url = url,
    ).await()
}

suspend inline fun Cache.keys(
    request: Request,
    options: CacheQueryOptions,
): ReadonlyArray<Request> {
    return keysAsync(
        request = request,
        options = options,
    ).await()
}

suspend inline fun Cache.keys(
    request: Request,
): ReadonlyArray<Request> {
    return keysAsync(
        request = request,
    ).await()
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
    return matchAsync(
        url = url,
        options = options,
    ).await()
}

/**
 * The **`match()`** method of the Cache interface returns a Promise that resolves to the Response associated with the first matching request in the Cache object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/match)
 */
suspend inline fun Cache.match(
    url: String,
): Response? {
    return matchAsync(
        url = url,
    ).await()
}

suspend inline fun Cache.match(
    url: URL,
    options: CacheQueryOptions,
): Response? {
    return matchAsync(
        url = url,
        options = options,
    ).await()
}

suspend inline fun Cache.match(
    url: URL,
): Response? {
    return matchAsync(
        url = url,
    ).await()
}

suspend inline fun Cache.match(
    request: Request,
    options: CacheQueryOptions,
): Response? {
    return matchAsync(
        request = request,
        options = options,
    ).await()
}

suspend inline fun Cache.match(
    request: Request,
): Response? {
    return matchAsync(
        request = request,
    ).await()
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
    return matchAllAsync(
        url = url,
        options = options,
    ).await()
}

/**
 * The **`matchAll()`** method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
 */
suspend inline fun Cache.matchAll(
    url: String,
): ReadonlyArray<Response> {
    return matchAllAsync(
        url = url,
    ).await()
}

/**
 * The **`matchAll()`** method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
 */
suspend inline fun Cache.matchAll(): ReadonlyArray<Response> {
    return matchAllAsync().await()
}

suspend inline fun Cache.matchAll(
    url: URL,
    options: CacheQueryOptions,
): ReadonlyArray<Response> {
    return matchAllAsync(
        url = url,
        options = options,
    ).await()
}

suspend inline fun Cache.matchAll(
    url: URL,
): ReadonlyArray<Response> {
    return matchAllAsync(
        url = url,
    ).await()
}

suspend inline fun Cache.matchAll(
    request: Request,
    options: CacheQueryOptions,
): ReadonlyArray<Response> {
    return matchAllAsync(
        request = request,
        options = options,
    ).await()
}

suspend inline fun Cache.matchAll(
    request: Request,
): ReadonlyArray<Response> {
    return matchAllAsync(
        request = request,
    ).await()
}

/**
 * The **`put()`** method of the Cache interface allows key/value pairs to be added to the current Cache object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/put)
 */
suspend inline fun Cache.put(
    url: String,
    response: Response,
) {
    putAsync(
        url = url,
        response = response,
    ).await()
}

suspend inline fun Cache.put(
    url: URL,
    response: Response,
) {
    putAsync(
        url = url,
        response = response,
    ).await()
}

suspend inline fun Cache.put(
    request: Request,
    response: Response,
) {
    putAsync(
        request = request,
        response = response,
    ).await()
}
