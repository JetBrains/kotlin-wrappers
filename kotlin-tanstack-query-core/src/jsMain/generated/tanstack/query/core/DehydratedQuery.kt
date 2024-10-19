// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface DehydratedQuery {
    var queryHash: String
    var queryKey: QueryKey
    var state: QueryState<*, *>
    var promise: Promise<*>
    var meta: QueryMeta
}
