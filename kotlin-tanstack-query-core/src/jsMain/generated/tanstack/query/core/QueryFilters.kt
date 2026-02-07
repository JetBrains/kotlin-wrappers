// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface QueryFilters<TQueryKey : QueryKey> {
    val type: QueryTypeFilter?
    val exact: Boolean?
    val predicate: ((query: Query<*, *, *, *>) -> Boolean)?
    val queryKey: TQueryKey?
    val stale: Boolean?
    val fetchStatus: FetchStatus?
}
