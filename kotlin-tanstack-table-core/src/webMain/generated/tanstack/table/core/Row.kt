// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface Row<TData : RowData> :
    CoreRow<TData>,
    VisibilityRow<TData>,
    ColumnPinningRow<TData>,
    RowPinningRow,
    ColumnFiltersRow<TData>,
    GroupingRow,
    RowSelectionRow,
    ExpandedRow
