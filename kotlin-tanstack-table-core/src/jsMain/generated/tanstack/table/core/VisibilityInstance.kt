// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface VisibilityInstance<TData : RowData> {
    var getVisibleFlatColumns: () -> ReadonlyArray<Column<TData, *>>
    var getVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var getLeftVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var getRightVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var getCenterVisibleLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var setColumnVisibility: (updater: Updater<VisibilityState>) -> Unit
    var resetColumnVisibility: (defaultState: Boolean?) -> Unit
    var toggleAllColumnsVisible: (value: Boolean?) -> Unit
    var getIsAllColumnsVisible: () -> Boolean
    var getIsSomeColumnsVisible: () -> Boolean
    var getToggleAllColumnsVisibilityHandler: () -> (event: Any) -> Unit
}
