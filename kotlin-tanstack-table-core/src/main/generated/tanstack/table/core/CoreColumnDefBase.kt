// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external interface CoreColumnDefBase<TData : RowData, TValue> {
    var columns: ReadonlyArray<ColumnDef<TData, *>>?
    var header: ColumnDefTemplate<HeaderContext<TData, TValue>>?
    var footer: ColumnDefTemplate<HeaderContext<TData, TValue>>?
    var cell: ColumnDefTemplate<CellContext<TData, TValue>>?
    var meta: ColumnMeta<TData, TValue>?
}
