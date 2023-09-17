// Automatically generated - do not modify!

package tanstack.table.core

external interface RowPinningOptions<TData : RowData> {
    var onRowPinningChange: OnChangeFn<RowPinningState>?
    var enableRowPinning: (((row: Row<TData>) -> Boolean))?
    var keepPinnedRows: Boolean?
}
