// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingRow {
    /**
     * Returns the grouping value for any row and column (including leaf rows).
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getgroupingvalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var getGroupingValue: (columnId: String) -> Any

    /**
     * Returns whether or not the row is currently grouped.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getisgrouped)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var getIsGrouped: () -> Boolean

    /**
     * If this row is grouped, this is the id of the column that this row is grouped by.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#groupingcolumnid)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var groupingColumnId: String?

    /**
     * If this row is grouped, this is the unique/shared value for the `groupingColumnId` for all of the rows in this group.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#groupingvalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var groupingValue: Any?
}
