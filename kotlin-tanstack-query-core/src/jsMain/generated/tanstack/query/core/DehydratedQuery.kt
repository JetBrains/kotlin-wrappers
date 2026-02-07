// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise
import kotlinx.js.JsPlainObject
import web.time.EpochTimeStamp

@JsPlainObject
external interface DehydratedQuery {
    val queryHash: String
    val queryKey: QueryKey
    val state: QueryState<*, *>
    val promise: Promise<*>?
    val meta: QueryMeta?
    val dehydratedAt: EpochTimeStamp?
}
