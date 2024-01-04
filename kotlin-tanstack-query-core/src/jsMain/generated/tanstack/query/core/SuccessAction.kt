// Automatically generated - do not modify!

package tanstack.query.core

import web.time.EpochTimeStamp

external interface SuccessAction<TData> {
    var data: TData?
    var type: Type /* 'success' */
    var dataUpdatedAt: EpochTimeStamp
    var manual: Boolean
}
