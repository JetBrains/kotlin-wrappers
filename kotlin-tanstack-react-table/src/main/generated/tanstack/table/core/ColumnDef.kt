// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnDef<TData : RowData> :
    CoreColumnDef<TData>,
    VisibilityColumnDef,
    ColumnPinningColumnDef,
    FiltersColumnDef<TData>,
    SortingColumnDef<TData>,
    GroupingColumnDef<TData>,
    ColumnSizingColumnDef
