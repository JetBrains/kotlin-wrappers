// Automatically generated - do not modify!

package tanstack.table.core

external interface RowSelectionInstance<TData : RowData> {
    var getToggleAllRowsSelectedHandler: () -> (event: Any) -> Unit
    var getToggleAllPageRowsSelectedHandler: () -> (event: Any) -> Unit
    var setRowSelection: (updater: Updater<RowSelectionState>) -> Unit
    var resetRowSelection: (defaultState: Boolean?) -> Unit
    var getIsAllRowsSelected: () -> Boolean
    var getIsAllPageRowsSelected: () -> Boolean
    var getIsSomeRowsSelected: () -> Boolean
    var getIsSomePageRowsSelected: () -> Boolean
    var toggleAllRowsSelected: (value: Boolean?) -> Unit
    var toggleAllPageRowsSelected: (value: Boolean?) -> Unit
    var getPreSelectedRowModel: () -> RowModel<TData>
    var getSelectedRowModel: () -> RowModel<TData>
    var getFilteredSelectedRowModel: () -> RowModel<TData>
    var getGroupedSelectedRowModel: () -> RowModel<TData>
}
