// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")
@file:JsNonModule

package tanstack.table.core

import kotlinx.js.Record

external fun <TData : RowData> isSubRowSelected(
    row: Row<TData>,
    selection: Record<String, Boolean>,
    table: Table<TData>,
): Any /* Boolean | 'some' | 'all' */
