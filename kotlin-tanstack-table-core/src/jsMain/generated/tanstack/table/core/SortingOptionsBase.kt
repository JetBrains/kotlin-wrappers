// Automatically generated - do not modify!

package tanstack.table.core

external interface SortingOptionsBase<TData : RowData> {
    /**
     * Enables/disables the ability to remove multi-sorts
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#enablemultiremove)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var enableMultiRemove: Boolean?

    /**
     * Enables/Disables multi-sorting for the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#enablemultisort)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var enableMultiSort: Boolean?

    /**
     * Enables/Disables sorting for the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#enablesorting)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var enableSorting: Boolean?

    /**
     * Enables/Disables the ability to remove sorting for the table.
     * - If `true` then changing sort order will circle like: 'none' -> 'desc' -> 'asc' -> 'none' -> ...
     * - If `false` then changing sort order will circle like: 'none' -> 'desc' -> 'asc' -> 'desc' -> 'asc' -> ...
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#enablesortingremoval)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var enableSortingRemoval: Boolean?

    /**
     * This function is used to retrieve the sorted row model. If using server-side sorting, this function is not required. To use client-side sorting, pass the exported `getSortedRowModel()` from your adapter to your table or implement your own.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getsortedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getSortedRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?

    /**
     * Pass a custom function that will be used to determine if a multi-sort event should be triggered. It is passed the event from the sort toggle handler and should return `true` if the event should trigger a multi-sort.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#ismultisortevent)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var isMultiSortEvent: ((e: Any) -> Boolean)?

    /**
     * Enables manual sorting for the table. If this is `true`, you will be expected to sort your data before it is passed to the table. This is useful if you are doing server-side sorting.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#manualsorting)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var manualSorting: Boolean?

    /**
     * Set a maximum number of columns that can be multi-sorted.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#maxmultisortcolcount)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var maxMultiSortColCount: Int?

    /**
     * If provided, this function will be called with an `updaterFn` when `state.sorting` changes. This overrides the default internal state management, so you will need to persist the state change either fully or partially outside of the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#onsortingchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var onSortingChange: OnChangeFn<SortingState>?

    /**
     * If `true`, all sorts will default to descending as their first toggle state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#sortdescfirst)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var sortDescFirst: Boolean?
}
