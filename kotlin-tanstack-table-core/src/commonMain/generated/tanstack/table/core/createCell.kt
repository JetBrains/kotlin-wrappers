// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")

package tanstack.table.core

external fun <TData : RowData, TValue> createCell(
    table: Table<TData>,
    row: Row<TData>,
    column: Column<TData, TValue>,
    columnId: String,
): Cell<TData, TValue>
