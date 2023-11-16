// Automatically generated - do not modify!

package tanstack.table.core

external interface SortingInstance<TData : RowData> {
    /**
     * Returns the row model for the table before any sorting has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getpresortedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getPreSortedRowModel: () -> RowModel<TData>

    /**
     * Returns the row model for the table after sorting has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#getsortedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var getSortedRowModel: () -> RowModel<TData>

    /**
     * Resets the **sorting** state to `initialState.sorting`, or `true` can be passed to force a default blank state reset to `[]`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#resetsorting)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var resetSorting: (defaultState: Boolean?) -> Unit

    /**
     * Sets or updates the `state.sorting` state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#setsorting)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var setSorting: (updater: Updater<SortingState>) -> Unit
}
