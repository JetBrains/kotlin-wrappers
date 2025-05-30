// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void
import js.objects.JsPlainObject

@JsPlainObject
external interface FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> :
    QueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam> {
    val initialPageParam: Void
    val staleTime: StaleTimeFunction<TQueryFnData, TError, TData, TQueryKey>?
}
