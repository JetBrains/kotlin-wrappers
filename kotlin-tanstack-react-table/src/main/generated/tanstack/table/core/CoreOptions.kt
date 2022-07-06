// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external interface CoreOptions<TData : RowData> {
    var data: ReadonlyArray<TData>
    var state: TableState /* Partial */
    var onStateChange: (updater: Updater<TableState>) -> Unit
    var debugAll: Boolean?
    var debugTable: Boolean?
    var debugHeaders: Boolean?
    var debugColumns: Boolean?
    var debugRows: Boolean?
    var initialState: InitialTableState?
    var autoResetAll: Boolean?
    var mergeOptions: ((defaultOptions: TableOptions<TData>, options: TableOptions<TData> /* Partial */) -> TableOptions<TData>)?
    var meta: Any?
    var getCoreRowModel: (table: Table<*>) -> () -> RowModel<*>
    var getSubRows: ((originalRow: TData, index: Number) -> ReadonlyArray<TData>)?
    var getRowId: ((originalRow: TData, index: Number, parent: Row<TData>?) -> String)?
    var columns: ReadonlyArray<ColumnDef<TData>>
    var defaultColumn: ColumnDef<TData> /* Partial */?
    var renderFallbackValue: Any
}
