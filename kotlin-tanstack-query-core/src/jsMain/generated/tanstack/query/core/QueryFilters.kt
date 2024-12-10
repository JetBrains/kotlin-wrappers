// Automatically generated - do not modify!

package tanstack.query.core

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface QueryFilters<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    var type: QueryTypeFilter?
    var exact: Boolean?
    var predicate: ((query: Query<TQueryFnData, TError, TData, TQueryKey>) -> Boolean)?
    var queryKey: TQueryKey?
    var stale: Boolean?
    var fetchStatus: FetchStatus?
}
