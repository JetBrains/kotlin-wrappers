// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external interface CoreColumnDefBase<TData : RowData> {
    var columns: ReadonlyArray<ColumnDef<TData>>?
    var header: ColumnDefTemplate<() -> CoreHeader.Context<TData>>?
    var footer: ColumnDefTemplate<() -> CoreHeader.Context<TData>>?
    var cell: ColumnDefTemplate<() -> CoreCell.Context<TData>>?
    var meta: Any?
}
