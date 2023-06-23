// Automatically generated - do not modify!

package web.cache

import js.core.ReadonlyArray
import web.http.Request
import web.http.Response
import web.url.URL
import kotlin.js.Promise

/**
 * The storage for Cache objects.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage)
 */
sealed external class CacheStorage {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/delete) */
    fun delete(cacheName: String): Promise<Boolean>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/has) */
    fun has(cacheName: String): Promise<Boolean>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/keys) */
    fun keys(): Promise<ReadonlyArray<String>>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/match) */
    fun match(
        request: Request,
        options: MultiCacheQueryOptions = definedExternally,
    ): Promise<Response?>

    fun match(
        request: String,
        options: MultiCacheQueryOptions = definedExternally,
    ): Promise<Response?>

    fun match(
        request: URL,
        options: MultiCacheQueryOptions = definedExternally,
    ): Promise<Response?>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/open) */
    fun open(cacheName: String): Promise<Cache>
}
