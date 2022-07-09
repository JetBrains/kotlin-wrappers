// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external interface CoreColumn<TData : RowData, TValue> {
    var id: String
    var depth: Int
    var accessorFn: AccessorFn<TData, TValue>?
    var columnDef: ColumnDef<TData, *>
    var columns: ReadonlyArray<Column<TData, TValue>>
    var parent: Column<TData, TValue>?
    var getFlatColumns: () -> ReadonlyArray<Column<TData, TValue>>
    var getLeafColumns: () -> ReadonlyArray<Column<TData, TValue>>
}
