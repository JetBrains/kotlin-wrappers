// Automatically generated - do not modify!

package tanstack.table.core

external interface SortingOptions<TData : RowData> {
    var manualSorting: Boolean?
    var onSortingChange: OnChangeFn<SortingState>?
    var enableSorting: Boolean?
    var enableSortingRemoval: Boolean?
    var enableMultiRemove: Boolean?
    var enableMultiSort: Boolean?
    var sortDescFirst: Boolean?
    var getSortedRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?
    var maxMultiSortColCount: Int?
    var isMultiSortEvent: ((e: Any) -> Boolean)?
}
