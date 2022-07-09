// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")
@file:JsNonModule

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external fun <TData : RowData> buildHeaderGroups(
    allColumns: ReadonlyArray<Column<TData, *>>,
    columnsToGroup: ReadonlyArray<Column<TData, *>>,
    table: Table<TData>,
    headerFamily: String = definedExternally, /* 'center' | 'left' | 'right' */
): ReadonlyArray<HeaderGroup<TData>>
