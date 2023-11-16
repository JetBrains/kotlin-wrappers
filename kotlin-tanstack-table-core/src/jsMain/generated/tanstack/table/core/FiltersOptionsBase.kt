// Automatically generated - do not modify!

package tanstack.table.core

import js.collections.JsMap
import js.core.JsTuple2

external interface FiltersOptionsBase<TData : RowData> {
    /**
     * Enables/disables all filtering for the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#enablefilters)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var enableFilters: Boolean?

    /**
     * By default, filtering is done from parent rows down (so if a parent row is filtered out, all of its children will be filtered out as well). Setting this option to `true` will cause filtering to be done from leaf rows up (which means parent rows will be included so long as one of their child or grand-child rows is also included).
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#filterfromleafrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var filterFromLeafRows: Boolean?

    /**
     * If provided, this function is called **once** per table and should return a **new function** which will calculate and return the row model for the table when it's filtered.
     * - For server-side filtering, this function is unnecessary and can be ignored since the server should already return the filtered row model.
     * - For client-side filtering, this function is required. A default implementation is provided via any table adapter's `{ getFilteredRowModel }` export.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getfilteredrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getFilteredRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?

    /**
     * Disables the `getFilteredRowModel` from being used to filter data. This may be useful if your table needs to dynamically support both client-side and server-side filtering.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#manualfiltering)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var manualFiltering: Boolean?

    /**
     * By default, filtering is done for all rows (max depth of 100), no matter if they are root level parent rows or the child leaf rows of a parent row. Setting this option to `0` will cause filtering to only be applied to the root level parent rows, with all sub-rows remaining unfiltered. Similarly, setting this option to `1` will cause filtering to only be applied to child leaf rows 1 level deep, and so on.
    var :
     * This is useful for situations where you want a row's entire child hierarchy to be visible regardless of the applied filter.
    var   * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#maxleafrowfilterdepth):   * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#maxleafrowfilterdepth)
    var   * [Guide](https://tanstack.com/table/v8/docs/guide/filters):   * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var maxLeafRowFilterDepth: Int?

    /**
     * Enables/disables **column** filtering for all columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#enablecolumnfilters)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var enableColumnFilters: Boolean?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.columnFilters` changes. This overrides the default internal state management, so you will need to persist the state change either fully or partially outside of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#oncolumnfilterschange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var onColumnFiltersChange: OnChangeFn<ColumnFiltersState>?

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
    var getFacetedRowModel: ((table: Table<TData>, columnId: String) -> () -> RowModel<TData>)?
    var getFacetedUniqueValues: ((table: Table<TData>, columnId: String) -> () -> JsMap<Any, Int>)?
    var getFacetedMinMaxValues: ((table: Table<TData>, columnId: String) -> () -> JsTuple2<Int, Int>?)?
}
