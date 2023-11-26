// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise
import web.abort.AbortSignal

external interface FetchContext<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var fetchFn: () -> Promise<*>?
    var fetchOptions: FetchOptions
    var signal: AbortSignal
    var options: QueryOptions<TQueryFnData, TError, TData, *, *>
    var queryKey: TQueryKey
    var state: QueryState<TData, TError>
}
