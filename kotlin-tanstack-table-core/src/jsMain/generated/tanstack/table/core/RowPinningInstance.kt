// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface RowPinningInstance<TData : RowData> {
    var getBottomRows: () -> ReadonlyArray<Row<TData>>
    var getCenterRows: () -> ReadonlyArray<Row<TData>>
    var getIsSomeRowsPinned: (position: RowPinningPosition?) -> Boolean
    var getTopRows: () -> ReadonlyArray<Row<TData>>
    var resetRowPinning: (defaultState: Boolean?) -> Unit
    var setRowPinning: (updater: Updater<RowPinningState>) -> Unit
}
