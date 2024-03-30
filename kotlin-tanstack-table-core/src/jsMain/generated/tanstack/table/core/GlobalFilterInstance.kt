// Automatically generated - do not modify!

package tanstack.table.core

external interface GlobalFilterInstance<TData : RowData> {
    /**
     * Currently, this function returns the built-in `includesString` filter function. In future releases, it may return more dynamic filter functions based on the nature of the data provided.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/global-filtering#getglobalautofilterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/global-filtering)
     */
    var getGlobalAutoFilterFn: () -> FilterFn<TData>

    /**
     * Returns the filter function (either user-defined or automatic, depending on configuration) for the global filter.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/global-filtering#getglobalfilterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/global-filtering)
     */
    var getGlobalFilterFn: () -> FilterFn<TData>

    /**
     * Resets the **globalFilter** state to `initialState.globalFilter`, or `true` can be passed to force a default blank state reset to `undefined`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/global-filtering#resetglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/global-filtering)
     */
    var resetGlobalFilter: (defaultState: Boolean?) -> Unit

    /**
     * Sets or updates the `state.globalFilter` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/global-filtering#setglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/global-filtering)
     */
    var setGlobalFilter: (updater: Updater<*>) -> Unit
}
