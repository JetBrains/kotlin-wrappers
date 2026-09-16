// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AccessorFnColumnDefBase<TData : RowData, TValue> :
    ColumnDefBase<TData, TValue> {
    // nullable for JSO compatibility
    val accessorFn: AccessorFn<TData, TValue>?
}
