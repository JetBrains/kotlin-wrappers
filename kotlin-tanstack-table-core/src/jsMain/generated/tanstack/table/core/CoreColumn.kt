// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreColumn<TData : RowData, TValue> {
    var accessorFn: AccessorFn<TData, TValue>?
    var columnDef: ColumnDef<TData, TValue>
    var columns: ReadonlyArray<Column<TData, TValue>>
    var depth: Int
    var getFlatColumns: () -> ReadonlyArray<Column<TData, TValue>>
    var getLeafColumns: () -> ReadonlyArray<Column<TData, TValue>>
    var id: String
    var parent: Column<TData, TValue>?
}
