// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface ColumnFiltersInstance<TData : RowData> {
    /**
     * Returns the row model for the table after **column** filtering has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#getfilteredrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val getFilteredRowModel: () -> RowModel<TData>

    /**
     * Returns the row model for the table before any **column** filtering has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#getprefilteredrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val getPreFilteredRowModel: () -> RowModel<TData>

    /**
     * Resets the **columnFilters** state to `initialState.columnFilters`, or `true` can be passed to force a default blank state reset to `[]`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#resetcolumnfilters)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val resetColumnFilters: (defaultState: Boolean?) -> Unit

    /**
     * Resets the **globalFilter** state to `initialState.globalFilter`, or `true` can be passed to force a default blank state reset to `undefined`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#resetglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val resetGlobalFilter: (defaultState: Boolean?) -> Unit

    /**
     * Sets or updates the `state.columnFilters` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#setcolumnfilters)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val setColumnFilters: (updater: Updater<ColumnFiltersState>) -> Unit

    /**
     * Sets or updates the `state.globalFilter` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#setglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val setGlobalFilter: (updater: Updater<*>) -> Unit
}
