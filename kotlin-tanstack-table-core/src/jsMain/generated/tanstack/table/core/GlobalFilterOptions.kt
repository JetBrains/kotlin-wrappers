// Automatically generated - do not modify!

package tanstack.table.core

external interface GlobalFilterOptions<TData : RowData> {
    /**
     * Enables/disables **global** filtering for all columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#enableglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var enableGlobalFilter: Boolean?

    /**
     * If provided, this function will be called with the column and should return `true` or `false` to indicate whether this column should be used for global filtering.
     *
     * This is useful if the column can contain data that is not `string` or `number` (i.e. `undefined`).
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getcolumncanglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getColumnCanGlobalFilter: ((column: Column<TData, *>) -> Boolean)?

    /**
     * The filter function to use for global filtering.
     * - A `string` referencing a built-in filter function
     * - A `string` that references a custom filter functions provided via the `tableOptions.filterFns` option
     * - A custom filter function
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#globalfilterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var globalFilterFn: FilterFnOption<TData>?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.globalFilter` changes. This overrides the default internal state management, so you will need to persist the state change either fully or partially outside of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#onglobalfilterchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var onGlobalFilterChange: OnChangeFn<*>?
}
