// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingColumn<TData : RowData> {
    var getAggregationFn: () -> AggregationFn<TData>
    var getAutoAggregationFn: () -> AggregationFn<TData>
    var getCanGroup: () -> Boolean
    var getGroupedIndex: () -> Int
    var getIsGrouped: () -> Boolean
    var getToggleGroupingHandler: () -> () -> Unit
    var toggleGrouping: () -> Unit
}
