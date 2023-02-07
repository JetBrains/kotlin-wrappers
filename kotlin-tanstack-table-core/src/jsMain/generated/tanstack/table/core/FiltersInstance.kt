// Automatically generated - do not modify!

package tanstack.table.core

import js.collections.JsMap
import js.core.JsTuple2

external interface FiltersInstance<TData : RowData> {
    var setColumnFilters: (updater: Updater<ColumnFiltersState>) -> Unit
    var resetColumnFilters: (defaultState: Boolean?) -> Unit
    var getPreFilteredRowModel: () -> RowModel<TData>
    var getFilteredRowModel: () -> RowModel<TData>
    var setGlobalFilter: (updater: Updater<*>) -> Unit
    var resetGlobalFilter: (defaultState: Boolean?) -> Unit
    var getGlobalAutoFilterFn: () -> FilterFn<TData>
    var getGlobalFilterFn: () -> FilterFn<TData>
    var getGlobalFacetedRowModel: () -> RowModel<TData>
    var getGlobalFacetedUniqueValues: () -> JsMap<Any, Int>
    var getGlobalFacetedMinMaxValues: () -> JsTuple2<Int, Int>?
}
