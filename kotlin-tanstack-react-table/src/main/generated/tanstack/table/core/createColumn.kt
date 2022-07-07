// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")
@file:JsNonModule

package tanstack.table.core

external fun <TData : RowData> createColumn(
    table: Table<TData>,
    columnDef: ColumnDef<TData>,
    depth: Int,
    parent: Column<TData> = definedExternally,
): Column<TData>
