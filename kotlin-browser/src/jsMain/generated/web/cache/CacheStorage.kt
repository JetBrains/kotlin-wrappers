// Automatically generated - do not modify!

package web.cache

import js.core.ReadonlyArray
import web.http.Request
import web.http.Response
import web.url.URL
import kotlin.js.Promise

sealed external class CacheStorage {
    fun delete(cacheName: String): Promise<Boolean>
    fun has(cacheName: String): Promise<Boolean>
    fun keys(): Promise<ReadonlyArray<String>>
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

    fun open(cacheName: String): Promise<Cache>
}
