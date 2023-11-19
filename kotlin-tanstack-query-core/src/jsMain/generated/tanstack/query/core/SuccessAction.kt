// Automatically generated - do not modify!

package tanstack.query.core

import js.core.EpochTimeStamp

external interface SuccessAction<TData> {
    var data: TData?
    var type: Type /* 'success' */
    var dataUpdatedAt: EpochTimeStamp
    var manual: Boolean
}
