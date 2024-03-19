// Automatically generated - do not modify!

package tanstack.table.core

import js.array.JsTuple2
import js.collections.JsMap

external interface FacetedColumn<TData : RowData> {
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
}
