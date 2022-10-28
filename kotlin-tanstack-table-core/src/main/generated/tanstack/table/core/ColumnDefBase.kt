// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external interface ColumnDefBase<TData : RowData, TValue> {
    var getUniqueValues: AccessorFn<TData, ReadonlyArray<Any?>>?
    var footer: ColumnDefTemplate<HeaderContext<TData, TValue>>?
    var cell: ColumnDefTemplate<CellContext<TData, TValue>>?
    var meta: ColumnMeta<TData, TValue>?
}
