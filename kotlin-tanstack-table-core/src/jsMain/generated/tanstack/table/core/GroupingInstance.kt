// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingInstance<TData : RowData> {
    /**
     * Returns the row model for the table after grouping has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getgroupedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var getGroupedRowModel: () -> RowModel<TData>

    /**
     * Returns the row model for the table before any grouping has been applied.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getpregroupedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var getPreGroupedRowModel: () -> RowModel<TData>

    /**
     * Resets the **grouping** state to `initialState.grouping`, or `true` can be passed to force a default blank state reset to `[]`.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#resetgrouping)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var resetGrouping: (defaultState: Boolean?) -> Unit

    /**
     * Updates the grouping state of the table via an update function or value.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#setgrouping)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var setGrouping: (updater: Updater<GroupingState>) -> Unit
}
