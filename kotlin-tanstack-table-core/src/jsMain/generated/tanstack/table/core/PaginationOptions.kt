// Automatically generated - do not modify!

package tanstack.table.core

external interface PaginationOptions<TData : RowData> {
    var autoResetPageIndex: Boolean?
    var getPaginationRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?
    var manualPagination: Boolean?
    var onPaginationChange: OnChangeFn<PaginationState>?
    var pageCount: Int?
}
