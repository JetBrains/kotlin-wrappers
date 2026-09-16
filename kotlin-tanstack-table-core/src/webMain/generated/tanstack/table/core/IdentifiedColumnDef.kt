// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface IdentifiedColumnDef<TData : RowData, TValue> :
    ColumnDefBase<TData, TValue> {
    val id: String?
    val header: StringOrTemplateHeader<TData, TValue>?
}
