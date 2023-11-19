// Automatically generated - do not modify!

package tanstack.query.core

external interface QueryFilters {
    var type: QueryTypeFilter
    var exact: Boolean
    var predicate: (query: Query<*, *, *, *>) -> Boolean
    var queryKey: QueryKey
    var stale: Boolean
    var fetchStatus: FetchStatus
}
