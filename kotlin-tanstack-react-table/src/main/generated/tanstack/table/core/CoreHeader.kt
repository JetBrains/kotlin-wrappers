// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external interface CoreHeader<TData : RowData> {
    var id: String
    var index: Number
    var depth: Number
    var column: Column<TData>
    var headerGroup: HeaderGroup<TData>
    var subHeaders: ReadonlyArray<Header<TData>>
    var colSpan: Number
    var rowSpan: Number
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
