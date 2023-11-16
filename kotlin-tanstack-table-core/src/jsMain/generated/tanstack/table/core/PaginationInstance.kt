// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface PaginationInstance<TData : RowData> {
    var getCanNextPage: () -> Boolean
    var getCanPreviousPage: () -> Boolean
    var getPageCount: () -> Int
    var getPageOptions: () -> ReadonlyArray<Int>
    var getPaginationRowModel: () -> RowModel<TData>
    var getPrePaginationRowModel: () -> RowModel<TData>
    var nextPage: () -> Unit
    var previousPage: () -> Unit
    var resetPageIndex: (defaultState: Boolean?) -> Unit
    var resetPageSize: (defaultState: Boolean?) -> Unit
    var resetPagination: (defaultState: Boolean?) -> Unit
    var setPageCount: (updater: Updater<Int>) -> Unit
    var setPageIndex: (updater: Updater<Int>) -> Unit
    var setPageSize: (updater: Updater<Int>) -> Unit
    var setPagination: (updater: Updater<PaginationState>) -> Unit
}
