// Automatically generated - do not modify!

package tanstack.table.core

import js.array.JsTuple2
import js.collections.JsMap

external interface GlobalFilterInstance<TData : RowData> {
    /**
     * Currently, this function returns the built-in `includesString` filter function. In future releases, it may return more dynamic filter functions based on the nature of the data provided.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getglobalautofilterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getGlobalAutoFilterFn: () -> FilterFn<TData>

    /**
     * Returns the faceted min and max values for the global filter.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getglobalfacetedminmaxvalues)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getGlobalFacetedMinMaxValues: () -> JsTuple2<Int, Int>?

    /**
     * Returns the row model for the table after **global** filtering has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getglobalfacetedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getGlobalFacetedRowModel: () -> RowModel<TData>

    /**
     * Returns the faceted unique values for the global filter.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getglobalfaceteduniquevalues)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getGlobalFacetedUniqueValues: () -> JsMap<Any, Int>

    /**
     * Returns the filter function (either user-defined or automatic, depending on configuration) for the global filter.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#getglobalfilterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var getGlobalFilterFn: () -> FilterFn<TData>

    /**
     * Resets the **globalFilter** state to `initialState.globalFilter`, or `true` can be passed to force a default blank state reset to `undefined`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#resetglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var resetGlobalFilter: (defaultState: Boolean?) -> Unit

    /**
     * Sets or updates the `state.globalFilter` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/filters#setglobalfilter)
     * [Guide](https://tanstack.com/table/v8/docs/guide/filters)
     */
    var setGlobalFilter: (updater: Updater<*>) -> Unit
}
