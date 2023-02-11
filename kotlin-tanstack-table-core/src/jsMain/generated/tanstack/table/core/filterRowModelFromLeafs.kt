// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")

package tanstack.table.core

import js.core.ReadonlyArray

external fun <TData : RowData> filterRowModelFromLeafs(
    rowsToFilter: ReadonlyArray<Row<TData>>,
    filterRow: (row: Row<TData>) -> ReadonlyArray<Row<TData>>,
    table: Table<TData>,
): RowModel<TData>
