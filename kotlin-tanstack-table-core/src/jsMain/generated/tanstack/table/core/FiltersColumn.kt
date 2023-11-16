// Automatically generated - do not modify!

package tanstack.table.core

import js.collections.JsMap
import js.core.JsTuple2

external interface FiltersColumn<TData : RowData> {
    /**
     * Returns an automatically calculated filter function for the column based off of the columns first known value.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getautofilterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getAutoFilterFn: () -> FilterFn<TData>

    /**
     * Returns whether or not the column can be **column** filtered.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getcanfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getCanFilter: () -> Boolean

    /**
     * Returns whether or not the column can be **globally** filtered. Set to `false` to disable a column from being scanned during global filtering.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getcanglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getCanGlobalFilter: () -> Boolean

    /**
     * A function that **computes and returns** a min/max tuple derived from `column.getFacetedRowModel`. Useful for displaying faceted result values.
     * > ⚠️ Requires that you pass a valid `getFacetedMinMaxValues` function to `options.getFacetedMinMaxValues`. A default implementation is provided via the exported `getFacetedMinMaxValues` function.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getfacetedminmaxvalues)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getFacetedMinMaxValues: () -> JsTuple2<Int, Int>?

    /**
     * Returns the row model with all other column filters applied, excluding its own filter. Useful for displaying faceted result counts.
     * > ⚠️ Requires that you pass a valid `getFacetedRowModel` function to `options.facetedRowModel`. A default implementation is provided via the exported `getFacetedRowModel` function.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getfacetedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getFacetedRowModel: () -> RowModel<TData>

    /**
     * A function that **computes and returns** a `Map` of unique values and their occurrences derived from `column.getFacetedRowModel`. Useful for displaying faceted result values.
     * > ⚠️ Requires that you pass a valid `getFacetedUniqueValues` function to `options.getFacetedUniqueValues`. A default implementation is provided via the exported `getFacetedUniqueValues` function.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getfaceteduniquevalues)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getFacetedUniqueValues: () -> JsMap<Any, Int>

    /**
     * Returns the filter function (either user-defined or automatic, depending on configuration) for the columnId specified.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getfilterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getFilterFn: () -> FilterFn<TData>

    /**
     * Returns the index (including `-1`) of the column filter in the table's `state.columnFilters` array.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getfilterindex)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getFilterIndex: () -> Int

    /**
     * Returns the current filter value for the column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getfiltervalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getFilterValue: () -> Any

    /**
     * Returns whether or not the column is currently filtered.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getisfiltered)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getIsFiltered: () -> Boolean

    /**
     * A function that sets the current filter value for the column. You can pass it a value or an updater function for immutability-safe operations on existing values.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#setfiltervalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var setFilterValue: (updater: Updater<*>) -> Unit
}
