// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnSizingInstance {
    var getCenterTotalSize: () -> Int
    var getLeftTotalSize: () -> Int
    var getRightTotalSize: () -> Int
    var getTotalSize: () -> Int
    var resetColumnSizing: (defaultState: Boolean?) -> Unit
    var resetHeaderSizeInfo: (defaultState: Boolean?) -> Unit
    var setColumnSizing: (updater: Updater<ColumnSizingState>) -> Unit
    var setColumnSizingInfo: (updater: Updater<ColumnSizingInfoState>) -> Unit
}
