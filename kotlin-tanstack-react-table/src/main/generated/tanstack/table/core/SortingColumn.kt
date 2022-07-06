// Automatically generated - do not modify!

package tanstack.table.core

external interface SortingColumn<TData : RowData> {
    var getAutoSortingFn: () -> SortingFn<TData>
    var getAutoSortDir: () -> SortDirection
    var getSortingFn: () -> SortingFn<TData>
    var getNextSortingOrder: () -> SortDirection?
    var getCanSort: () -> Boolean
    var getCanMultiSort: () -> Boolean
    var getSortIndex: () -> Number
    var getIsSorted: () -> SortDirection?
    var clearSorting: () -> Unit
    var toggleSorting: (desc: Boolean?, isMulti: Boolean?) -> Unit
    var getToggleSortingHandler: () -> ((event: Any) -> Unit)?
}
