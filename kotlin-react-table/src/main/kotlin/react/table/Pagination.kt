@file:JsModule("react-table")
@file:JsNonModule

@file:Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")

package react.table

external val usePagination: PluginHook<Any>

external interface UsePaginationOptions<D : Any> {
    var pageCount: Int
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var manualPagination: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var autoResetPage: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var paginateExpandedRows: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface UsePaginationState {
    var pageSize: Int
    var pageIndex: Int
}

external interface UsePaginationInstanceProps<D : Any> {
    val page: Array<out Row<D>>
    val pageCount: Int
    val pageOptions: Array<out Int>
    val canPreviousPage: Boolean
    val canNextPage: Boolean
    fun gotoPage(updater: (pageIndex: Int) -> Int)
    fun gotoPage(page: Int)
    fun previousPage()
    fun nextPage()
    fun setPageSize(pageSize: Int)
}
