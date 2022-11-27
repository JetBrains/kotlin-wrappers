// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface ColumnPinningRow<TData : RowData> {
    var getLeftVisibleCells: () -> ReadonlyArray<Cell<TData, *>>
    var getCenterVisibleCells: () -> ReadonlyArray<Cell<TData, *>>
    var getRightVisibleCells: () -> ReadonlyArray<Cell<TData, *>>
}
