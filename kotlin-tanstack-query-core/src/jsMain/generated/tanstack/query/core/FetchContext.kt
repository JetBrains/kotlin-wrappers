// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.PromiseResult
import kotlinx.js.JsPlainObject
import web.abort.AbortSignal

@JsPlainObject
external interface FetchContext<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    val fetchFn: () -> PromiseResult<*>
    val fetchOptions: FetchOptions<*>?
    val signal: AbortSignal
    val options: QueryOptions<TQueryFnData, TError, TData, *, *>
    val client: QueryClient
    val queryKey: TQueryKey
    val state: QueryState<TData, TError>
}
