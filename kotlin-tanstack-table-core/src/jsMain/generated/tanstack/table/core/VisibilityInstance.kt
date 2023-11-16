// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface VisibilityInstance<TData : RowData> {
    var getCenterVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var getIsAllColumnsVisible: () -> Boolean
    var getIsSomeColumnsVisible: () -> Boolean
    var getLeftVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var getRightVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var getToggleAllColumnsVisibilityHandler: () -> (event: Any) -> Unit
    var getVisibleFlatColumns: () -> ReadonlyArray<Column<TData, *>>
    var getVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var resetColumnVisibility: (defaultState: Boolean?) -> Unit
    var setColumnVisibility: (updater: Updater<VisibilityState>) -> Unit
    var toggleAllColumnsVisible: (value: Boolean?) -> Unit
}
