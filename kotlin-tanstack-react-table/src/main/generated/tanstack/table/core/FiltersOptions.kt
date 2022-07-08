// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPair
import kotlinx.js.Record

external interface FiltersOptions<TData : RowData> {
    var enableFilters: Boolean?
    var manualFiltering: Boolean?
    var filterFromLeafRows: Boolean?
    var getFilteredRowModel: ((table: Table<*>) -> () -> RowModel<*>)?
    var onColumnFiltersChange: OnChangeFn<ColumnFiltersState>?
    var enableColumnFilters: Boolean?
    var globalFilterFn: FilterFnOption<TData>?
    var onGlobalFilterChange: OnChangeFn<*>?
    var enableGlobalFilter: Boolean?
    var getColumnCanGlobalFilter: ((column: Column<TData, *>) -> Boolean)?
    var getFacetedRowModel: ((table: Table<TData>, columnId: String) -> () -> RowModel<TData>)?
    var getFacetedUniqueValues: ((table: Table<TData>, columnId: String) -> () -> Record<Any, Int> /* JS Map */)?
    var getFacetedMinMaxValues: ((table: Table<TData>, columnId: String) -> () -> JsPair<Int, Int>?)?
}
