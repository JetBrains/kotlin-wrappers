// Automatically generated - do not modify!

package web.cache

import js.core.ReadonlyArray
import js.core.Void
import web.http.Request
import web.http.Response
import web.url.URL
import kotlin.js.Promise

sealed external class Cache {
    fun add(request: Request): Promise<Void>
    fun add(request: String): Promise<Void>
    fun add(request: URL): Promise<Void>
    fun addAll(requests: ReadonlyArray<Request>): Promise<Void>
    fun addAll(requests: ReadonlyArray<String>): Promise<Void>
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
