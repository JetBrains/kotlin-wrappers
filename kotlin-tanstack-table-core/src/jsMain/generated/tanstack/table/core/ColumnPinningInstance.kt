// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface ColumnPinningInstance<TData : RowData> {
    var getCenterLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var getIsSomeColumnsPinned: (position: ColumnPinningPosition?) -> Boolean
    var getLeftLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var getRightLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var resetColumnPinning: (defaultState: Boolean?) -> Unit
    var setColumnPinning: (updater: Updater<ColumnPinningState>) -> Unit
}
