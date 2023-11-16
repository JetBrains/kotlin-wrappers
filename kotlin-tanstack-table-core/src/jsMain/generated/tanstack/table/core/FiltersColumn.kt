// Automatically generated - do not modify!

package tanstack.table.core

import js.collections.JsMap
import js.core.JsTuple2

external interface FiltersColumn<TData : RowData> {
    var getAutoFilterFn: () -> FilterFn<TData>
    var getCanFilter: () -> Boolean
    var getCanGlobalFilter: () -> Boolean
    var getFacetedMinMaxValues: () -> JsTuple2<Int, Int>?
    var getFacetedRowModel: () -> RowModel<TData>
    var getFacetedUniqueValues: () -> JsMap<Any, Int>
    var getFilterFn: () -> FilterFn<TData>
    var getFilterIndex: () -> Int
    var getFilterValue: () -> Any
    var getIsFiltered: () -> Boolean
    var setFilterValue: (updater: Updater<*>) -> Unit
}
