// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface QueryFilters {
    val type: QueryTypeFilter?
    val exact: Boolean?
    val predicate: ((query: Query<*, *, *, *>) -> Boolean)?
    val queryKey: QueryKey?
    val stale: Boolean?
    val fetchStatus: FetchStatus?
}
