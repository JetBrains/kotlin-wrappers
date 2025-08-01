// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface ColumnFiltersColumn<TData : RowData> {
    /**
     * Returns an automatically calculated filter function for the column based off of the columns first known value.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#getautofilterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val getAutoFilterFn: () -> FilterFn<TData>

    /**
     * Returns whether or not the column can be **column** filtered.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#getcanfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val getCanFilter: () -> Boolean

    /**
     * Returns the filter function (either user-defined or automatic, depending on configuration) for the columnId specified.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#getfilterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val getFilterFn: () -> FilterFn<TData>

    /**
     * Returns the index (including `-1`) of the column filter in the table's `state.columnFilters` array.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#getfilterindex)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val getFilterIndex: () -> Int

    /**
     * Returns the current filter value for the column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#getfiltervalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val getFilterValue: () -> Any

    /**
     * Returns whether or not the column is currently filtered.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#getisfiltered)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val getIsFiltered: () -> Boolean

    /**
     * A function that sets the current filter value for the column. You can pass it a value or an updater function for immutability-safe operations on existing values.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#setfiltervalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val setFilterValue: (updater: Updater<*>) -> Unit
}
