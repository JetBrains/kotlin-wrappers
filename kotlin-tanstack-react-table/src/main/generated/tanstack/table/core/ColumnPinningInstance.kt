// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external interface ColumnPinningInstance<TData : RowData> {
    var setColumnPinning: (updater: Updater<ColumnPinningState>) -> Unit
    var resetColumnPinning: (defaultState: Boolean?) -> Unit
    var getIsSomeColumnsPinned: (position: ColumnPinningPosition?) -> Boolean
    var getLeftLeafColumns: () -> ReadonlyArray<Column<TData>>
    var getRightLeafColumns: () -> ReadonlyArray<Column<TData>>
    var getCenterLeafColumns: () -> ReadonlyArray<Column<TData>>
}
