// Automatically generated - do not modify!

package tanstack.table.core

external interface SortingInstance<TData : RowData> {
    var getPreSortedRowModel: () -> RowModel<TData>
    var getSortedRowModel: () -> RowModel<TData>
    var resetSorting: (defaultState: Boolean?) -> Unit
    var setSorting: (updater: Updater<SortingState>) -> Unit
}
