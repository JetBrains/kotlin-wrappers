// Automatically generated - do not modify!

package tanstack.table.core

external interface RowPinningOptions<TData : RowData> {
    var enableRowPinning: (((row: Row<TData>) -> Boolean))?
    var keepPinnedRows: Boolean?
    var onRowPinningChange: OnChangeFn<RowPinningState>?
}
