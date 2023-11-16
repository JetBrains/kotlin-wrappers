// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingCell {
    /**
     * Returns whether or not the cell is currently aggregated.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getisaggregated)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var getIsAggregated: () -> Boolean

    /**
     * Returns whether or not the cell is currently grouped.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getisgrouped)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var getIsGrouped: () -> Boolean

    /**
     * Returns whether or not the cell is currently a placeholder cell.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getisplaceholder)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    var getIsPlaceholder: () -> Boolean
}
