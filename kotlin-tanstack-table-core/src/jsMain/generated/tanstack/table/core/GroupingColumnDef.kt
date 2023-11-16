// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingColumnDef<TData : RowData, TValue> {
    var aggregatedCell: ColumnDefTemplate<CellContext<TData, TValue>>?
    var aggregationFn: AggregationFnOption<TData>?
    var enableGrouping: Boolean?
    var getGroupingValue: ((row: TData) -> Any)?
}
