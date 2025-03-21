// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface QueryFilters<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    val type: QueryTypeFilter?
    val exact: Boolean?
    val predicate: ((query: Query<TQueryFnData, TError, TData, TQueryKey>) -> Boolean)?
    val queryKey: TQueryKey?
    val stale: Boolean?
    val fetchStatus: FetchStatus?
}
