// Automatically generated - do not modify!

package tanstack.query.core

import js.iterable.IterableIterator

external interface QueryStore {
    var has: (queryKey: String) -> Boolean
    var set: (queryKey: String, query: Query<*, *, *, *>) -> Unit
    var get: (queryKey: String) -> Query<*, *, *, *>?
    var delete: (queryKey: String) -> Unit
    var values: () -> IterableIterator<Query<*, *, *, *>>
}
