// Automatically generated - do not modify!

package tanstack.table.core

import js.collections.JsMap
import js.core.JsTuple2

external interface FiltersInstance<TData : RowData> {
    var setColumnFilters: (updater: Updater<ColumnFiltersState>) -> Unit
    var resetColumnFilters: (defaultState: Boolean?) -> Unit
    var getFilteredRowModel: () -> RowModel<TData>
    var getPreFilteredRowModel: () -> RowModel<TData>
    var getGlobalAutoFilterFn: () -> FilterFn<TData>
    var getGlobalFacetedMinMaxValues: () -> JsTuple2<Int, Int>?
    var getGlobalFacetedRowModel: () -> RowModel<TData>
    var getGlobalFacetedUniqueValues: () -> JsMap<Any, Int>
    var getGlobalFilterFn: () -> FilterFn<TData>
    var resetGlobalFilter: (defaultState: Boolean?) -> Unit
    var setGlobalFilter: (updater: Updater<*>) -> Unit
}
