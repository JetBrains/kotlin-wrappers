// Automatically generated - do not modify!

package tanstack.table.core

import js.collections.JsMap
import js.core.JsTuple2

external interface FiltersOptionsBase<TData : RowData> {
    var enableFilters: Boolean?
    var filterFromLeafRows: Boolean?
    var getFilteredRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?
    var manualFiltering: Boolean?
    var maxLeafRowFilterDepth: Int?
    var enableColumnFilters: Boolean?
    var onColumnFiltersChange: OnChangeFn<ColumnFiltersState>?
    var enableGlobalFilter: Boolean?
    var getColumnCanGlobalFilter: ((column: Column<TData, *>) -> Boolean)?
    var globalFilterFn: FilterFnOption<TData>?
    var onGlobalFilterChange: OnChangeFn<*>?
    var getFacetedRowModel: ((table: Table<TData>, columnId: String) -> () -> RowModel<TData>)?
    var getFacetedUniqueValues: ((table: Table<TData>, columnId: String) -> () -> JsMap<Any, Int>)?
    var getFacetedMinMaxValues: ((table: Table<TData>, columnId: String) -> () -> JsTuple2<Int, Int>?)?
}
