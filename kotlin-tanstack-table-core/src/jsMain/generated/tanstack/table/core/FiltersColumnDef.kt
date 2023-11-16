// Automatically generated - do not modify!

package tanstack.table.core

external interface FiltersColumnDef<TData : RowData> {
    /**
     * The filter function to use with this column. Can be the name of a built-in filter function or a custom filter function.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#filterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var filterFn: FilterFnOption<TData>?

    /**
     * Enables/disables the **column** filter for this column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#enablecolumnfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var enableColumnFilter: Boolean?

    /**
     * Enables/disables the **global** filter for this column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#enableglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var enableGlobalFilter: Boolean?
}
