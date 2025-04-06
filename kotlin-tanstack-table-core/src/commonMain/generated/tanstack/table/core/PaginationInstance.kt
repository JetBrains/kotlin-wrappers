// Automatically generated - do not modify!

package tanstack.table.core

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface PaginationInstance<TData : RowData> {
    /**
     * Returns whether the table can go to the next page.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#getcannextpage)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val getCanNextPage: () -> Boolean

    /**
     * Returns whether the table can go to the previous page.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#getcanpreviouspage)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val getCanPreviousPage: () -> Boolean

    /**
     * Returns the page count. If manually paginating or controlling the pagination state, this will come directly from the `options.pageCount` table option, otherwise it will be calculated from the table data using the total row count and current page size.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#getpagecount)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val getPageCount: () -> Int

    /**
     * Returns the row count. If manually paginating or controlling the pagination state, this will come directly from the `options.rowCount` table option, otherwise it will be calculated from the table data.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#getrowcount)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val getRowCount: () -> Int

    /**
     * Returns an array of page options (zero-index-based) for the current page size.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#getpageoptions)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val getPageOptions: () -> ReadonlyArray<Int>

    /**
     * Returns the row model for the table after pagination has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#getpaginationrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val getPaginationRowModel: () -> RowModel<TData>

    /**
     * Returns the row model for the table before any pagination has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#getprepaginationrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val getPrePaginationRowModel: () -> RowModel<TData>

    /**
     * Increments the page index by one, if possible.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#nextpage)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val nextPage: () -> Unit

    /**
     * Decrements the page index by one, if possible.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#previouspage)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val previousPage: () -> Unit

    /**
     * Sets the page index to `0`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#firstpage)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val firstPage: () -> Unit

    /**
     * Sets the page index to the last page.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#lastpage)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val lastPage: () -> Unit

    /**
     * Resets the page index to its initial state. If `defaultState` is `true`, the page index will be reset to `0` regardless of initial state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#resetpageindex)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val resetPageIndex: (defaultState: Boolean?) -> Unit

    /**
     * Resets the page size to its initial state. If `defaultState` is `true`, the page size will be reset to `10` regardless of initial state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#resetpagesize)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val resetPageSize: (defaultState: Boolean?) -> Unit

    /**
     * Resets the **pagination** state to `initialState.pagination`, or `true` can be passed to force a default blank state reset to `[]`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#resetpagination)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val resetPagination: (defaultState: Boolean?) -> Unit

    /**
     * @deprecated The page count no longer exists in the pagination state. Just pass as a table option instead.
     */
    val setPageCount: (updater: Updater<Int>) -> Unit

    /**
     * Updates the page index using the provided function or value in the `state.pagination.pageIndex` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#setpageindex)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val setPageIndex: (updater: Updater<Int>) -> Unit

    /**
     * Updates the page size using the provided function or value in the `state.pagination.pageSize` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#setpagesize)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val setPageSize: (updater: Updater<Int>) -> Unit

    /**
     * Sets or updates the `state.pagination` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#setpagination)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    val setPagination: (updater: Updater<PaginationState>) -> Unit
}
