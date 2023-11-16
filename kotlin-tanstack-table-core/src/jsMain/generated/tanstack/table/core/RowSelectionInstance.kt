// Automatically generated - do not modify!

package tanstack.table.core

external interface RowSelectionInstance<TData : RowData> {
    /**
     * Returns the row model of all rows that are selected after filtering has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getfilteredselectedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getFilteredSelectedRowModel: () -> RowModel<TData>

    /**
     * Returns the row model of all rows that are selected after grouping has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getgroupedselectedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getGroupedSelectedRowModel: () -> RowModel<TData>

    /**
     * Returns whether or not all rows on the current page are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getisallpagerowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getIsAllPageRowsSelected: () -> Boolean

    /**
     * Returns whether or not all rows in the table are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getisallrowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getIsAllRowsSelected: () -> Boolean

    /**
     * Returns whether or not all rows on the current page are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getissomepagerowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getIsSomePageRowsSelected: () -> Boolean

    /**
     * Returns whether or not all rows in the table are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getissomerowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getIsSomeRowsSelected: () -> Boolean

    /**
     * Returns the core row model of all rows before row selection has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getpreselectedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getPreSelectedRowModel: () -> RowModel<TData>

    /**
     * Returns the row model of all rows that are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getselectedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getSelectedRowModel: () -> RowModel<TData>

    /**
     * Returns a handler that can be used to toggle all rows on the current page.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#gettoggleallpagerowsselectedhandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getToggleAllPageRowsSelectedHandler: () -> (event: Any) -> Unit

    /**
     * Returns a handler that can be used to toggle all rows in the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#gettoggleallrowsselectedhandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var getToggleAllRowsSelectedHandler: () -> (event: Any) -> Unit

    /**
     * Resets the **rowSelection** state to the `initialState.rowSelection`, or `true` can be passed to force a default blank state reset to `{}`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#resetrowselection)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var resetRowSelection: (defaultState: Boolean?) -> Unit

    /**
     * Sets or updates the `state.rowSelection` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#setrowselection)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var setRowSelection: (updater: Updater<RowSelectionState>) -> Unit

    /**
     * Selects/deselects all rows on the current page.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#toggleallpagerowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var toggleAllPageRowsSelected: (value: Boolean?) -> Unit

    /**
     * Selects/deselects all rows in the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#toggleallrowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    var toggleAllRowsSelected: (value: Boolean?) -> Unit
}
