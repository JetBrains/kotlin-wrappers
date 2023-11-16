// Automatically generated - do not modify!

package tanstack.table.core

external interface PaginationOptions<TData : RowData> {
    /**
     * If set to `true`, pagination will be reset to the first page when page-altering state changes eg. `data` is updated, filters change, grouping changes, etc.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#autoresetpageindex)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    var autoResetPageIndex: Boolean?

    /**
     * Returns the row model after pagination has taken place, but no further.
     *
     * Pagination columns are automatically reordered by default to the start of the columns list. If you would rather remove them or leave them as-is, set the appropriate mode here.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#getpaginationrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    var getPaginationRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?

    /**
     * Enables manual pagination. If this option is set to `true`, the table will not automatically paginate rows using `getPaginationRowModel()` and instead will expect you to manually paginate the rows before passing them to the table. This is useful if you are doing server-side pagination and aggregation.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#manualpagination)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    var manualPagination: Boolean?

    /**
     * If this function is provided, it will be called when the pagination state changes and you will be expected to manage the state yourself. You can pass the managed state back to the table via the `tableOptions.state.pagination` option.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#onpaginationchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    var onPaginationChange: OnChangeFn<PaginationState>?

    /**
     * When manually controlling pagination, you should supply a total `pageCount` value to the table if you know it. If you do not know how many pages there are, you can set this to `-1`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/pagination#pagecount)
     * [Guide](https://tanstack.com/table/v8/docs/guide/pagination)
     */
    var pageCount: Int?
}
