// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnDef<TData : RowData, TValue : Any> :
    CoreColumnDef<TData, TValue>,
    VisibilityColumnDef,
    ColumnPinningColumnDef,
    FiltersColumnDef<TData>,
    SortingColumnDef<TData>,
    GroupingColumnDef<TData, TValue>,
    ColumnSizingColumnDef
