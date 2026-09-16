// Automatically generated - do not modify!

package tanstack.table.core

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ColumnDefBase<TData : RowData, TValue> :
    ColumnDefExtensions<TData, TValue> {
    val getUniqueValues: AccessorFn<TData, ReadonlyArray<Any?>>?
    val footer: ColumnDefTemplate<HeaderContext<TData, TValue>>?
    val cell: ColumnDefTemplate<CellContext<TData, TValue>>?
    val meta: ColumnMeta<TData, TValue>?
}
