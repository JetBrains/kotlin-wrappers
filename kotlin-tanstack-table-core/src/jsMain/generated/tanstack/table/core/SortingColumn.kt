// Automatically generated - do not modify!

package tanstack.table.core

external interface SortingColumn<TData : RowData> {
    /**
     * Removes this column from the table's sorting state
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#clearsorting)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var clearSorting: () -> Unit

    /**
     * Returns a sort direction automatically inferred based on the columns values.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getautosortdir)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getAutoSortDir: () -> SortDirection

    /**
     * Returns a sorting function automatically inferred based on the columns values.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getautosortingfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getAutoSortingFn: () -> SortingFn<TData>

    /**
     * Returns whether this column can be multi-sorted.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getcanmultisort)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getCanMultiSort: () -> Boolean

    /**
     * Returns whether this column can be sorted.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getcansort)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getCanSort: () -> Boolean

    /**
     * Returns the first direction that should be used when sorting this column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getfirstsortdir)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getFirstSortDir: () -> SortDirection

    /**
     * Returns the current sort direction of this column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getissorted)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getIsSorted: () -> SortDirection?

    /**
     * Returns the next sorting order.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getnextsortingorder)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getNextSortingOrder: () -> SortDirection?

    /**
     * Returns the index position of this column's sorting within the sorting state
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getsortindex)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getSortIndex: () -> Int

    /**
     * Returns the resolved sorting function to be used for this column
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getsortingfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getSortingFn: () -> SortingFn<TData>

    /**
     * Returns a function that can be used to toggle this column's sorting state. This is useful for attaching a click handler to the column header.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#gettogglesortinghandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getToggleSortingHandler: () -> ((event: Any) -> Unit)?

    /**
     * Toggles this columns sorting state. If `desc` is provided, it will force the sort direction to that value. If `isMulti` is provided, it will additivity multi-sort the column (or toggle it if it is already sorted).
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#togglesorting)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var toggleSorting: (desc: Boolean?, isMulti: Boolean?) -> Unit
}
