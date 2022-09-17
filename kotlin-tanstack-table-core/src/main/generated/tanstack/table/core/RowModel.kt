// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray
import kotlinx.js.ReadonlyRecord

external interface RowModel<TData : RowData> {
    var rows: ReadonlyArray<Row<TData>>
    var flatRows: ReadonlyArray<Row<TData>>
    var rowsById: ReadonlyRecord<String, Row<TData>>
}
