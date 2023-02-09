// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")

package tanstack.table.core

import js.core.ReadonlyArray

external fun <TData : RowData> buildHeaderGroups(
    allColumns: ReadonlyArray<Column<TData, *>>,
    columnsToGroup: ReadonlyArray<Column<TData, *>>,
    table: Table<TData>,
    headerFamily: String = definedExternally, /* 'center' | 'left' | 'right' */
): ReadonlyArray<HeaderGroup<TData>>
