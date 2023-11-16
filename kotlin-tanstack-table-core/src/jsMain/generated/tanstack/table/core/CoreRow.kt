// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreRow<TData : RowData> {
    var depth: Int
    var getAllCells: () -> ReadonlyArray<Cell<TData, *>>
    var getLeafRows: () -> ReadonlyArray<Row<TData>>
    var getParentRow: () -> Row<TData>
    var getParentRows: () -> ReadonlyArray<Row<TData>>
    var getUniqueValues: (columnId: String) -> ReadonlyArray<Any? /* TValue */>
    var getValue: (columnId: String) -> Any? /* TValue */
    var id: String
    var index: Int
    var original: TData
    var originalSubRows: ReadonlyArray<TData>?
    var parentId: String?
    var renderValue: (columnId: String) -> Any? /* TValue */
    var subRows: ReadonlyArray<Row<TData>>
}
