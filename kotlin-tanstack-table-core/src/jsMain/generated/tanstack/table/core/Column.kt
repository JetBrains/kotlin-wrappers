// Automatically generated - do not modify!

package tanstack.table.core

import tanstack.table.core.VisibilityColumn as ColumnVisibilityColumn

external interface Column<TData : RowData, TValue> : CoreColumn<TData, TValue>, ColumnVisibilityColumn,
    ColumnPinningColumn, FacetedColumn<TData>, ColumnFiltersColumn<TData>, GlobalFilterColumn, SortingColumn<TData>,
    GroupingColumn<TData>, ColumnSizingColumn, ColumnOrderColumn
