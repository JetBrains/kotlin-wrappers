// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnSizingInstance {
    var setColumnSizing: (updater: Updater<ColumnSizingState>) -> Unit
    var setColumnSizingInfo: (updater: Updater<ColumnSizingInfoState>) -> Unit
    var resetColumnSizing: (defaultState: Boolean?) -> Unit
    var resetHeaderSizeInfo: (defaultState: Boolean?) -> Unit
    var getTotalSize: () -> Number
    var getLeftTotalSize: () -> Number
    var getCenterTotalSize: () -> Number
    var getRightTotalSize: () -> Number
}
