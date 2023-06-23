// Automatically generated - do not modify!

package web.cache

import js.core.ReadonlyArray
import js.core.Void
import web.http.Request
import web.http.Response
import web.url.URL
import kotlin.js.Promise

/**
 * Provides a storage mechanism for Request / Response object pairs that are cached, for example as part of the ServiceWorker life cycle. Note that the Cache interface is exposed to windowed scopes as well as workers. You don't have to use it in conjunction with service workers, even though it is defined in the service worker spec.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache)
 */
sealed external class Cache {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/add) */
    fun add(request: Request): Promise<Void>
    fun add(request: String): Promise<Void>
    fun add(request: URL): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/addAll) */
    fun addAll(requests: ReadonlyArray<Request>): Promise<Void>
    fun addAll(requests: ReadonlyArray<String>): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete) */
    fun delete(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Boolean>

    fun delete(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Boolean>

    fun delete(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Boolean>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys) */
    fun keys(
        request: Request = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

    fun keys(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

    fun keys(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Request>>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/match) */
    fun match(
        request: Request,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

    fun match(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

    fun match(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<Response?>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll) */
    fun matchAll(
        request: Request = definedExternally,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

    fun matchAll(
        request: String,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

    fun matchAll(
        request: URL,
        options: CacheQueryOptions = definedExternally,
    ): Promise<ReadonlyArray<Response>>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/put) */
    fun put(
        request: Request,
        response: Response,
    ): Promise<Void>

    fun put(
        request: String,
        response: Response,
    ): Promise<Void>

    fun put(
        request: URL,
        response: Response,
    ): Promise<Void>
}
