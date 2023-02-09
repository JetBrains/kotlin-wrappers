// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")

package tanstack.table.core

import js.core.ReadonlyRecord

external fun <TData : RowData> isSubRowSelected(
    row: Row<TData>,
    selection: ReadonlyRecord<String, Boolean>,
    table: Table<TData>,
): Any /* Boolean | 'some' | 'all' */
