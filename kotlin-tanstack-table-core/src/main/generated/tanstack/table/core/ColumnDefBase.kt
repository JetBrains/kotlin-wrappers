// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnDefBase<TData : RowData, TValue> {
    var footer: ColumnDefTemplate<HeaderContext<TData, TValue>>?
    var cell: ColumnDefTemplate<CellContext<TData, TValue>>?
    var meta: ColumnMeta<TData, TValue>?
}
