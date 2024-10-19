// Automatically generated - do not modify!

package tanstack.query.core

import js.iterable.JsIterator
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface QueryStore {
    val has: (queryHash: String) -> Boolean
    val set: (queryHash: String, query: Query<*, *, *, *>) -> Unit
    val get: (queryHash: String) -> Query<*, *, *, *>?
    val delete: (queryHash: String) -> Unit
    val values: () -> JsIterator<Query<*, *, *, *>>
}
