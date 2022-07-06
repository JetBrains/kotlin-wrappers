// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external interface PaginationInstance<TData : RowData> {
    var setPagination: (updater: Updater<PaginationState>) -> Unit
    var resetPagination: (defaultState: Boolean?) -> Unit
    var setPageIndex: (updater: Updater<Number>) -> Unit
    var resetPageIndex: (defaultState: Boolean?) -> Unit
    var setPageSize: (updater: Updater<Number>) -> Unit
    var resetPageSize: (defaultState: Boolean?) -> Unit
    var setPageCount: (updater: Updater<Number>) -> Unit
    var getPageOptions: () -> ReadonlyArray<Number>
    var getCanPreviousPage: () -> Boolean
    var getCanNextPage: () -> Boolean
    var previousPage: () -> Unit
    var nextPage: () -> Unit
    var getPrePaginationRowModel: () -> RowModel<TData>
    var getPaginationRowModel: () -> RowModel<TData>
    var getPageCount: () -> Number
}
