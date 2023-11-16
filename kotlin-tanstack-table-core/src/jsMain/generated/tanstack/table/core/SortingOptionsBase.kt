// Automatically generated - do not modify!

package tanstack.table.core

external interface SortingOptionsBase<TData : RowData> {
    var enableMultiRemove: Boolean?
    var enableMultiSort: Boolean?
    var enableSorting: Boolean?
    var enableSortingRemoval: Boolean?
    var getSortedRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?
    var isMultiSortEvent: ((e: Any) -> Boolean)?
    var manualSorting: Boolean?
    var maxMultiSortColCount: Int?
    var onSortingChange: OnChangeFn<SortingState>?
    var sortDescFirst: Boolean?
}
