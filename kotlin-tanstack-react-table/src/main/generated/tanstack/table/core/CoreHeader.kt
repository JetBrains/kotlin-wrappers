// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external interface CoreHeader<TData : RowData> {
    var id: String
    var index: Int
    var depth: Int
    var column: Column<TData>
    var headerGroup: HeaderGroup<TData>
    var subHeaders: ReadonlyArray<Header<TData>>
    var colSpan: Int
    var rowSpan: Int
    var getLeafHeaders: () -> ReadonlyArray<Header<TData>>
    var isPlaceholder: Boolean
    var placeholderId: String?
    var getContext: () -> Context<TData>

    interface Context<TData : RowData> {
        var table: Table<TData>
        var header: Header<TData>
        var column: Column<TData>
    }

}
