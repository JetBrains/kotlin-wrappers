// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RowSelectionInstance<TData : RowData> {
    /**
     * Returns the row model of all rows that are selected after filtering has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getfilteredselectedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getFilteredSelectedRowModel: () -> RowModel<TData>

    /**
     * Returns the row model of all rows that are selected after grouping has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getgroupedselectedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getGroupedSelectedRowModel: () -> RowModel<TData>

    /**
     * Returns whether or not all rows on the current page are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getisallpagerowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getIsAllPageRowsSelected: () -> Boolean

    /**
     * Returns whether or not all rows in the table are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getisallrowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getIsAllRowsSelected: () -> Boolean

    /**
     * Returns whether or not any rows on the current page are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getissomepagerowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getIsSomePageRowsSelected: () -> Boolean

    /**
     * Returns whether or not any rows in the table are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getissomerowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getIsSomeRowsSelected: () -> Boolean

    /**
     * Returns the core row model of all rows before row selection has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getpreselectedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getPreSelectedRowModel: () -> RowModel<TData>

    /**
     * Returns the row model of all rows that are selected.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#getselectedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getSelectedRowModel: () -> RowModel<TData>

    /**
     * Returns a handler that can be used to toggle all rows on the current page.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#gettoggleallpagerowsselectedhandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getToggleAllPageRowsSelectedHandler: () -> (event: Any) -> Unit

    /**
     * Returns a handler that can be used to toggle all rows in the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#gettoggleallrowsselectedhandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val getToggleAllRowsSelectedHandler: () -> (event: Any) -> Unit

    /**
     * Resets the **rowSelection** state to the `initialState.rowSelection`, or `true` can be passed to force a default blank state reset to `{}`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#resetrowselection)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val resetRowSelection: (defaultState: Boolean?) -> Unit

    /**
     * Sets or updates the `state.rowSelection` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#setrowselection)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val setRowSelection: (updater: Updater<RowSelectionState>) -> Unit

    /**
     * Selects/deselects all rows on the current page.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#toggleallpagerowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val toggleAllPageRowsSelected: (value: Boolean?) -> Unit

    /**
     * Selects/deselects all rows in the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/row-selection#toggleallrowsselected)
     * [Guide](https://tanstack.com/table/v8/docs/guide/row-selection)
     */
    val toggleAllRowsSelected: (value: Boolean?) -> Unit
}
