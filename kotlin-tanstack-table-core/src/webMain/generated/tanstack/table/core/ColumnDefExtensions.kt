// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ColumnDefExtensions<TData : RowData, TValue> :
    VisibilityColumnDef,
    ColumnPinningColumnDef,
    ColumnFiltersColumnDef<TData>,
    GlobalFilterColumnDef,
    SortingColumnDef<TData>,
    GroupingColumnDef<TData, TValue>,
    ColumnSizingColumnDef
