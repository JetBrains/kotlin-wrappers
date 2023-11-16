// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingOptionsBase<TData : RowData> {
    /**
     * Enables/disables grouping for the table.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#enablegrouping)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var enableGrouping: Boolean?

    /**
     * Returns the row model after grouping has taken place, but no further.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getgroupedrowmodel)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var getGroupedRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?

    /**
     * Grouping columns are automatically reordered by default to the start of the columns list. If you would rather remove them or leave them as-is, set the appropriate mode here.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#groupedcolumnmode)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var groupedColumnMode: GroupingColumnMode?

    /**
     * Enables manual grouping. If this option is set to `true`, the table will not automatically group rows using `getGroupedRowModel()` and instead will expect you to manually group the rows before passing them to the table. This is useful if you are doing server-side grouping and aggregation.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#manualgrouping)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var manualGrouping: Boolean?

    /**
     * If this function is provided, it will be called when the grouping state changes and you will be expected to manage the state yourself. You can pass the managed state back to the table via the `tableOptions.state.grouping` option.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#ongroupingchange)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var onGroupingChange: OnChangeFn<GroupingState>?
}
