// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPair
import kotlinx.js.Record

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
    var getGlobalFacetedUniqueValues: () -> Record<Any, Int> /* JS Map */
    var getGlobalFacetedMinMaxValues: () -> JsPair<Number, Number>?
}
