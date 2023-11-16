// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreInstance<TData : RowData> {
    var getAllColumns: () -> ReadonlyArray<Column<TData, *>>
    var getAllFlatColumns: () -> ReadonlyArray<Column<TData, *>>
    var getAllLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var getColumn: (columnId: String) -> Column<TData, *>
    var getCoreRowModel: () -> RowModel<TData>
    var getRow: (id: String, searchAll: Boolean?) -> Row<TData>
    var getRowModel: () -> RowModel<TData>
    var getState: () -> TableState
    var initialState: TableState
    var options: Any /* RequiredKeys<TableOptionsResolved<TData>, 'state'> */
    var reset: () -> Unit
    var setOptions: (newOptions: Updater<TableOptionsResolved<TData>>) -> Unit
    var setState: (updater: Updater<TableState>) -> Unit
}
