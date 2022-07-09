// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

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
    var getContext: () -> Context<TData, TValue>

    interface Context<TData : RowData, TValue> {
        var table: Table<TData>
        var header: Header<TData, TValue>
        var column: Column<TData, TValue>
    }

}
