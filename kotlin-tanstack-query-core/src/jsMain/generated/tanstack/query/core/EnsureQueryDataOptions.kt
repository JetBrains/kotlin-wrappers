// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface EnsureQueryDataOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam>
    : FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam> {
    val revalidateIfStale: Boolean?
}
