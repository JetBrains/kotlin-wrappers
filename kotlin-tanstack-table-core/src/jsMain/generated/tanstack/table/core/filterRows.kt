// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")

package tanstack.table.core

import js.core.ReadonlyArray

external fun <TData : RowData> filterRows(
    rows: ReadonlyArray<Row<TData>>,
    filterRowImpl: (row: Row<TData>) -> Boolean, /* Any? */
    table: Table<TData>,
): RowModel<TData>
