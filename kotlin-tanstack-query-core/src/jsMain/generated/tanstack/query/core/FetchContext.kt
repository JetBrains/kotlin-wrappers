// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject
import js.promise.Promise
import web.abort.AbortSignal

@JsPlainObject
external interface FetchContext<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    val fetchFn: () -> Promise<*>?
    val fetchOptions: FetchOptions<*>?
    val signal: AbortSignal
    val options: QueryOptions<TQueryFnData, TError, TData, *, *>
    val queryKey: TQueryKey
    val state: QueryState<TData, TError>
}
