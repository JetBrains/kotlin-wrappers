// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreRow<TData : RowData> {
    var id: String
    var index: Int
    var original: TData
    var depth: Int
    var getValue: (columnId: String) -> Any? /* TValue */
    var getUniqueValues: (columnId: String) -> ReadonlyArray<Any? /* TValue */>
    var renderValue: (columnId: String) -> Any? /* TValue */
    var subRows: ReadonlyArray<Row<TData>>
    var getLeafRows: () -> ReadonlyArray<Row<TData>>
    var originalSubRows: ReadonlyArray<TData>?
    var getAllCells: () -> ReadonlyArray<Cell<TData, *>>
    var parentRow: Row<TData>?
}
