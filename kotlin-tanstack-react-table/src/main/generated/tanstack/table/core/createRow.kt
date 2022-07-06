// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")
@file:JsNonModule

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external fun <TData : RowData> createRow(
    table: Table<TData>,
    id: String,
    original: TData?,
    rowIndex: Number,
    depth: Number,
    subRows: ReadonlyArray<Row<TData>>? = definedExternally,
): Row<TData>
