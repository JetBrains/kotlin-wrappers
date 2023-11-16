// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface CoreHeader<TData : RowData, TValue> {
    var colSpan: Int
    var column: Column<TData, TValue>
    var depth: Int
    var getContext: () -> HeaderContext<TData, TValue>
    var getLeafHeaders: () -> ReadonlyArray<Header<TData, *>>
    var headerGroup: HeaderGroup<TData>
    var id: String
    var index: Int
    var isPlaceholder: Boolean
    var placeholderId: String?
    var rowSpan: Int
    var subHeaders: ReadonlyArray<Header<TData, TValue>>
}
