// Automatically generated - do not modify!

package tanstack.table.core

import js.array.JsTuple2
import js.collections.JsMap

external interface GlobalFacetingInstance<TData : RowData> {
    /**
     * Currently, this function returns the built-in `includesString` filter function. In future releases, it may return more dynamic filter functions based on the nature of the data provided.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/global-faceting#getglobalautofilterfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/global-faceting)
     */
    var getGlobalFacetedMinMaxValues: () -> JsTuple2<Int, Int>?

    /**
     * Returns the row model for the table after **global** filtering has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/global-faceting#getglobalfacetedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/global-faceting)
     */
    var getGlobalFacetedRowModel: () -> RowModel<TData>

    /**
     * Returns the faceted unique values for the global filter.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/global-faceting#getglobalfaceteduniquevalues)
     * [Guide](https://tanstack.com/table/v8/docs/guide/global-faceting)
     */
    var getGlobalFacetedUniqueValues: () -> JsMap<Any, Int>
}
