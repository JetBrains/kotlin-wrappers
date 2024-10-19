// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam>
    : QueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam> {
    var initialPageParam: Void
    var staleTime: StaleTime<TQueryFnData, TError, TData, TQueryKey>?
}
