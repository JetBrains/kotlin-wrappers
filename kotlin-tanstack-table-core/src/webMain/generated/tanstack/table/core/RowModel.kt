// Automatically generated - do not modify!

package tanstack.table.core

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RowModel<TData : RowData> {
    val rows: ReadonlyArray<Row<TData>>
    val flatRows: ReadonlyArray<Row<TData>>
    val rowsById: ReadonlyRecord<String, Row<TData>>
}
