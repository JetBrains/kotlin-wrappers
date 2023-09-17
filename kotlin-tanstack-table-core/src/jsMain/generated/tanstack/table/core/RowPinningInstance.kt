// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface RowPinningInstance<TData : RowData> {
    var setRowPinning: (updater: Updater<RowPinningState>) -> Unit
    var resetRowPinning: (defaultState: Boolean?) -> Unit
    var getIsSomeRowsPinned: (position: RowPinningPosition?) -> Boolean
    var getTopRows: () -> ReadonlyArray<Row<TData>>
    var getBottomRows: () -> ReadonlyArray<Row<TData>>
    var getCenterRows: () -> ReadonlyArray<Row<TData>>
}
