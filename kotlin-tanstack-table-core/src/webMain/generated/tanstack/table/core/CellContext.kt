// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface CellContext<TData : RowData, TValue> {
    val cell: Cell<TData, TValue>
    val column: Column<TData, TValue>
    val getValue: Getter<TValue>
    val renderValue: Getter<TValue?>
    val row: Row<TData>
    val table: Table<TData>
}
