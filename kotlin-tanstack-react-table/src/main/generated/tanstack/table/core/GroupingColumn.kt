// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingColumn<TData : RowData> {
    var getCanGroup: () -> Boolean
    var getIsGrouped: () -> Boolean
    var getGroupedIndex: () -> Int
    var toggleGrouping: () -> Unit
    var getToggleGroupingHandler: () -> () -> Unit
    var getAutoAggregationFn: () -> AggregationFn<TData>
    var getAggregationFn: () -> AggregationFn<TData>
}
