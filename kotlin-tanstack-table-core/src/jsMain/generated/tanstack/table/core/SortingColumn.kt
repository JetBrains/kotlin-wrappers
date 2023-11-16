// Automatically generated - do not modify!

package tanstack.table.core

external interface SortingColumn<TData : RowData> {
    var clearSorting: () -> Unit
    var getAutoSortDir: () -> SortDirection
    var getAutoSortingFn: () -> SortingFn<TData>
    var getCanMultiSort: () -> Boolean
    var getCanSort: () -> Boolean
    var getFirstSortDir: () -> SortDirection
    var getIsSorted: () -> SortDirection?
    var getNextSortingOrder: () -> SortDirection?
    var getSortIndex: () -> Int
    var getSortingFn: () -> SortingFn<TData>
    var getToggleSortingHandler: () -> ((event: Any) -> Unit)?
    var toggleSorting: (desc: Boolean?, isMulti: Boolean?) -> Unit
}
