// Automatically generated - do not modify!

package tanstack.table.core

external interface RowSelectionInstance<TData : RowData> {
    var getFilteredSelectedRowModel: () -> RowModel<TData>
    var getGroupedSelectedRowModel: () -> RowModel<TData>
    var getIsAllPageRowsSelected: () -> Boolean
    var getIsAllRowsSelected: () -> Boolean
    var getIsSomePageRowsSelected: () -> Boolean
    var getIsSomeRowsSelected: () -> Boolean
    var getPreSelectedRowModel: () -> RowModel<TData>
    var getSelectedRowModel: () -> RowModel<TData>
    var getToggleAllPageRowsSelectedHandler: () -> (event: Any) -> Unit
    var getToggleAllRowsSelectedHandler: () -> (event: Any) -> Unit
    var resetRowSelection: (defaultState: Boolean?) -> Unit
    var setRowSelection: (updater: Updater<RowSelectionState>) -> Unit
    var toggleAllPageRowsSelected: (value: Boolean?) -> Unit
    var toggleAllRowsSelected: (value: Boolean?) -> Unit
}
