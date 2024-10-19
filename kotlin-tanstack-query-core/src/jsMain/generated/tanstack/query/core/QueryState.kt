// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject
import web.time.EpochTimeStamp

@JsPlainObject
external interface QueryState<TData, TError> {
    val data: TData?
    val dataUpdateCount: Int
    val dataUpdatedAt: EpochTimeStamp
    val error: TError?
    val errorUpdateCount: Int
    val errorUpdatedAt: EpochTimeStamp
    val fetchFailureCount: Int
    val fetchFailureReason: TError?
    val fetchMeta: FetchMeta?
    val isInvalidated: Boolean
    val status: QueryStatus
    val fetchStatus: FetchStatus
}
