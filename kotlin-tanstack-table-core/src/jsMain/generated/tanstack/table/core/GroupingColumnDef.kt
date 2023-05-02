// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingColumnDef<TData : RowData, TValue> {
    var aggregationFn: AggregationFnOption<TData>?
    var aggregatedCell: ColumnDefTemplate<CellContext<TData, TValue>>?
    var enableGrouping: Boolean?
    var getGroupingValue: ((row: TData) -> Any)?
}
