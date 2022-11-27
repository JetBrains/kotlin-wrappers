// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreInstance<TData : RowData> {
    var initialState: TableState
    var reset: () -> Unit
    var options: Any /* RequiredKeys<TableOptionsResolved<TData>, 'state'> */
    var setOptions: (newOptions: Updater<TableOptionsResolved<TData>>) -> Unit
    var getState: () -> TableState
    var setState: (updater: Updater<TableState>) -> Unit
    var getCoreRowModel: () -> RowModel<TData>
    var getRowModel: () -> RowModel<TData>
    var getRow: (id: String) -> Row<TData>
    var getAllColumns: () -> ReadonlyArray<Column<TData, *>>
    var getAllFlatColumns: () -> ReadonlyArray<Column<TData, *>>
    var getAllLeafColumns: () -> ReadonlyArray<Column<TData, *>>
    var getColumn: (columnId: String) -> Column<TData, *>
}
