// Automatically generated - do not modify!

package tanstack.table.core

external interface TableFeature<TData : RowData> {
    var createCell: ((cell: Cell<TData, *>, column: Column<TData, *>, row: Row<TData>, table: Table<TData>) -> Unit)?
    var createColumn: ((column: Column<TData, *>, table: Table<TData>) -> Unit)?
    var createHeader: ((header: Header<TData, *>, table: Table<TData>) -> Unit)?
    var createRow: ((row: Row<TData>, table: Table<TData>) -> Unit)?
    var createTable: ((table: Table<TData>) -> Unit)?
    var getDefaultColumnDef: (() -> ColumnDef<TData, *>)?
    var getDefaultOptions: ((table: Table<TData>) -> TableOptionsResolved<TData>)?
    var getInitialState: ((initialState: InitialTableState?) -> TableState)?
}
