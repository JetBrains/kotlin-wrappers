// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface TableFeature<TData : RowData> {
    val createCell: ((cell: Cell<TData, *>, column: Column<TData, *>, row: Row<TData>, table: Table<TData>) -> Unit)?
    val createColumn: ((column: Column<TData, *>, table: Table<TData>) -> Unit)?
    val createHeader: ((header: Header<TData, *>, table: Table<TData>) -> Unit)?
    val createRow: ((row: Row<TData>, table: Table<TData>) -> Unit)?
    val createTable: ((table: Table<TData>) -> Unit)?
    val getDefaultColumnDef: (() -> ColumnDef<TData, *>)?
    val getDefaultOptions: ((table: Table<TData>) -> TableOptionsResolved<TData>)?
    val getInitialState: ((initialState: InitialTableState?) -> TableState)?
}
