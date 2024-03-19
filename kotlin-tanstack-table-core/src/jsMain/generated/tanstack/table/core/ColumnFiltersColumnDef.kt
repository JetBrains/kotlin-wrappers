// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnFiltersColumnDef<TData : RowData> {
    /**
     * Enables/disables the **column** filter for this column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#enablecolumnfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var enableColumnFilter: Boolean?

    /**
     * The filter function to use with this column. Can be the name of a built-in filter function or a custom filter function.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#filterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var filterFn: FilterFnOption<TData>?
}
