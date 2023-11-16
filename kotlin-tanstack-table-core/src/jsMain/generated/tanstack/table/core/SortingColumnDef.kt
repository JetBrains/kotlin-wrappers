// Automatically generated - do not modify!

package tanstack.table.core

external interface SortingColumnDef<TData : RowData> {
    /**
     * Enables/Disables multi-sorting for this column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#enablemultisort)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var enableMultiSort: Boolean?

    /**
     * Enables/Disables sorting for this column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#enablesorting)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var enableSorting: Boolean?

    /**
     * Inverts the order of the sorting for this column. This is useful for values that have an inverted best/worst scale where lower numbers are better, eg. a ranking (1st, 2nd, 3rd) or golf-like scoring
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#invertsorting)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var invertSorting: Boolean?

    /**
     * Set to `true` for sorting toggles on this column to start in the descending direction.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#sortdescfirst)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var sortDescFirst: Boolean?

    /**
     * The sorting function to use with this column.
     * - A `string` referencing a built-in sorting function
     * - A custom sorting function
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/sorting#sortingfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/sorting)
     */
    var sortingFn: SortingFnOption<TData>?

    /**
     * - `false`
     *   - Undefined values will be considered tied and need to be sorted by the next column filter or original index (whichever applies)
     * - `-1`
     *   - Undefined values will be sorted with higher priority (ascending) (if ascending, undefined will appear on the beginning of the list)
     * - `1`
     *   - Undefined values will be sorted with lower priority (descending) (if ascending, undefined will appear on the end of the list)
     */
    var sortUndefined: Int /* false | -1 | 1 */?
}
