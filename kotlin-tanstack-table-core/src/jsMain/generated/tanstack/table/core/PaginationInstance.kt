// Automatically generated - do not modify!

package tanstack.table.core

import js.core.ReadonlyArray

external interface PaginationInstance<TData : RowData> {
    var setPagination: (updater: Updater<PaginationState>) -> Unit
    var resetPagination: (defaultState: Boolean?) -> Unit
    var setPageIndex: (updater: Updater<Int>) -> Unit
    var resetPageIndex: (defaultState: Boolean?) -> Unit
    var setPageSize: (updater: Updater<Int>) -> Unit
    var resetPageSize: (defaultState: Boolean?) -> Unit
    var setPageCount: (updater: Updater<Int>) -> Unit
    var getPageOptions: () -> ReadonlyArray<Int>
    var getCanPreviousPage: () -> Boolean
    var getCanNextPage: () -> Boolean
    var previousPage: () -> Unit
    var nextPage: () -> Unit
    var getPrePaginationRowModel: () -> RowModel<TData>
    var getPaginationRowModel: () -> RowModel<TData>
    var getPageCount: () -> Int
}
