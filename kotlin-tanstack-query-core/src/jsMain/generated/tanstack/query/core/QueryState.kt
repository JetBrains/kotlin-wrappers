// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject
import web.time.EpochTimeStamp

@JsPlainObject
external interface QueryState<TData, TError> {
    var data: TData?
    var dataUpdateCount: Int
    var dataUpdatedAt: EpochTimeStamp
    var error: TError?
    var errorUpdateCount: Int
    var errorUpdatedAt: EpochTimeStamp
    var fetchFailureCount: Int
    var fetchFailureReason: TError?
    var fetchMeta: FetchMeta?
    var isInvalidated: Boolean
    var status: QueryStatus
    var fetchStatus: FetchStatus
}
