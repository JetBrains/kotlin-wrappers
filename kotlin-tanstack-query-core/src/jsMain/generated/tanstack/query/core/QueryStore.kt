// Automatically generated - do not modify!

package tanstack.query.core

import js.iterable.IterableIterator

external interface QueryStore {
    var has: (queryHash: String) -> Boolean
    var set: (queryHash: String, query: Query<*, *, *, *>) -> Unit
    var get: (queryHash: String) -> Query<*, *, *, *>?
    var delete: (queryHash: String) -> Unit
    var values: () -> IterableIterator<Query<*, *, *, *>>
}
