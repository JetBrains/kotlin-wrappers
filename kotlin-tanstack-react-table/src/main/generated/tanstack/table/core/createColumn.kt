// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")
@file:JsNonModule

package tanstack.table.core

external fun <TData : RowData, TValue> createColumn(
    table: Table<TData>,
    columnDef: ColumnDef<TData, TValue>,
    depth: Int,
    parent: Column<TData, TValue> = definedExternally,
): Column<TData, TValue>
