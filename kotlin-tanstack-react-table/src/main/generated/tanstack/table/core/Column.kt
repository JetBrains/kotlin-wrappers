// Automatically generated - do not modify!

package tanstack.table.core

external interface Column<TData : RowData> :
    CoreColumn<TData>,
    VisibilityColumn,
    ColumnPinningColumn,
    FiltersColumn<TData>,
    SortingColumn<TData>,
    GroupingColumn<TData>,
    ColumnSizingColumn
