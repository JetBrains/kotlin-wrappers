// Automatically generated - do not modify!

package tanstack.table.core

import js.collections.JsMap
import js.core.JsTuple2

external interface FiltersColumn<TData : RowData> {
    var getAutoFilterFn: () -> FilterFn<TData>
    var getFilterFn: () -> FilterFn<TData>
    var setFilterValue: (updater: Updater<*>) -> Unit
    var getCanFilter: () -> Boolean
    var getCanGlobalFilter: () -> Boolean
    var getFacetedRowModel: () -> RowModel<TData>
    var getIsFiltered: () -> Boolean
    var getFilterValue: () -> Any
    var getFilterIndex: () -> Int
    var getFacetedUniqueValues: () -> JsMap<Any, Int>
    var getFacetedMinMaxValues: () -> JsTuple2<Int, Int>?
}
