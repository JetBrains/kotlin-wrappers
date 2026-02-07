// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GroupingColumn<TData : RowData> {
    /**
     * Returns the aggregation function for the column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getaggregationfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val getAggregationFn: () -> AggregationFn<TData>

    /**
     * Returns the automatically inferred aggregation function for the column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getautoaggregationfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val getAutoAggregationFn: () -> AggregationFn<TData>

    /**
     * Returns whether or not the column can be grouped.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getcangroup)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val getCanGroup: () -> Boolean

    /**
     * Returns the index of the column in the grouping state.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getgroupedindex)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val getGroupedIndex: () -> Int

    /**
     * Returns whether or not the column is currently grouped.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getisgrouped)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val getIsGrouped: () -> Boolean

    /**
     * Returns a function that toggles the grouping state of the column. This is useful for passing to the `onClick` prop of a button.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#gettogglegroupinghandler)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val getToggleGroupingHandler: () -> () -> Unit

    /**
     * Toggles the grouping state of the column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#togglegrouping)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val toggleGrouping: () -> Unit
}
