// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreOptions<TData : RowData> {
    var autoResetAll: Boolean?
    var columns: ReadonlyArray<ColumnDef<TData, *>>
    var data: ReadonlyArray<TData>
    var debugAll: Boolean?
    var debugColumns: Boolean?
    var debugHeaders: Boolean?
    var debugRows: Boolean?
    var debugTable: Boolean?
    var defaultColumn: ColumnDef<TData, *> /* Partial */?
    var getCoreRowModel: (table: Table<TData>) -> () -> RowModel<TData>
    var getRowId: ((originalRow: TData, index: Int, parent: Row<TData>?) -> String)?
    var getSubRows: ((originalRow: TData, index: Int) -> ReadonlyArray<TData>)?
    var initialState: InitialTableState?
    var mergeOptions: ((defaultOptions: TableOptions<TData>, options: TableOptions<TData> /* Partial */) -> TableOptions<TData>)?
    var meta: TableMeta<TData>?
    var onStateChange: (updater: Updater<TableState>) -> Unit
    var renderFallbackValue: Any
    var state: TableState /* Partial */
}
