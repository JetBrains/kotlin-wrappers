// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreHeader<TData : RowData, TValue> {
    var id: String
    var index: Int
    var depth: Int
    var column: Column<TData, TValue>
    var headerGroup: HeaderGroup<TData>
    var subHeaders: ReadonlyArray<Header<TData, TValue>>
    var colSpan: Int
    var rowSpan: Int
    var getLeafHeaders: () -> ReadonlyArray<Header<TData, *>>
    var isPlaceholder: Boolean
    var placeholderId: String?
    var getContext: () -> HeaderContext<TData, TValue>
}
