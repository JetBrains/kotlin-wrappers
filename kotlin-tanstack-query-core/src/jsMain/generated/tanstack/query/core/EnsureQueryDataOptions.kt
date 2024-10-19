// Automatically generated - do not modify!

package tanstack.query.core

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface EnsureQueryDataOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam>
    : FetchQueryOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam> {
    var revalidateIfStale: Boolean
}
