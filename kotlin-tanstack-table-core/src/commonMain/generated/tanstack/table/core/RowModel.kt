// Automatically generated - do not modify!

package tanstack.table.core

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
external interface RowModel<TData : RowData> {
    var rows: ReadonlyArray<Row<TData>>
    var flatRows: ReadonlyArray<Row<TData>>
    var rowsById: ReadonlyRecord<String, Row<TData>>
}
