// Automatically generated - do not modify!

package tanstack.table.core

import js.objects.JsPlainObject

@JsPlainObject
external interface ColumnFiltersOptionsBase<TData : RowData> {
    /**
     * Enables/disables **column** filtering for all columns.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#enablecolumnfilters)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val enableColumnFilters: Boolean?

    /**
     * Enables/disables all filtering for the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#enablefilters)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val enableFilters: Boolean?

    /**
     * By default, filtering is done from parent rows down (so if a parent row is filtered out, all of its children will be filtered out as well). Setting this option to `true` will cause filtering to be done from leaf rows up (which means parent rows will be included so long as one of their child or grand-child rows is also included).
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#filterfromleafrows)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val filterFromLeafRows: Boolean?

    /**
     * If provided, this function is called **once** per table and should return a **new function** which will calculate and return the row model for the table when it's filtered.
     * - For server-side filtering, this function is unnecessary and can be ignored since the server should already return the filtered row model.
     * - For client-side filtering, this function is required. A default implementation is provided via any table adapter's `{ getFilteredRowModel }` export.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#getfilteredrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val getFilteredRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?

    /**
     * Disables the `getFilteredRowModel` from being used to filter data. This may be useful if your table needs to dynamically support both client-side and server-side filtering.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#manualfiltering)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val manualFiltering: Boolean?

    /**
     * By default, filtering is done for all rows (max depth of 100), no matter if they are root level parent rows or the child leaf rows of a parent row. Setting this option to `0` will cause filtering to only be applied to the root level parent rows, with all sub-rows remaining unfiltered. Similarly, setting this option to `1` will cause filtering to only be applied to child leaf rows 1 level deep, and so on.
    val :
     * This is useful for situations where you want a row's entire child hierarchy to be visible regardless of the applied filter.
    val   * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#maxleafrowfilterdepth):   * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#maxleafrowfilterdepth)
    val   * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering):   * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val maxLeafRowFilterDepth: Int?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.columnFilters` changes. This overrides the default internal state management, so you will need to persist the state change either fully or partially outside of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/column-filtering#oncolumnfilterschange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/column-filtering)
     */
    val onColumnFiltersChange: OnChangeFn<ColumnFiltersState>?
}
