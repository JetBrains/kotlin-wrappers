// Automatically generated - do not modify!

package tanstack.table.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GroupingColumnDef<TData : RowData, TValue> {
    /**
     * The cell to display each row for the column if the cell is an aggregate. If a function is passed, it will be passed a props object with the context of the cell and should return the property type for your adapter (the exact type depends on the adapter being used).
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#aggregatedcell)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val aggregatedCell: ColumnDefTemplate<CellContext<TData, TValue>>?

    /**
     * The resolved aggregation function for the column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#aggregationfn)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val aggregationFn: AggregationFnOption<TData>?

    /**
     * Enables/disables grouping for this column.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#enablegrouping)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val enableGrouping: Boolean?

    /**
     * Specify a value to be used for grouping rows on this column. If this option is not specified, the value derived from `accessorKey` / `accessorFn` will be used instead.
     * [API Docs](https://tanstack.com/table/v8/docs/api/features/grouping#getgroupingvalue)
     * [Guide](https://tanstack.com/table/v8/docs/guide/grouping)
     */
    val getGroupingValue: ((row: TData) -> Any)?
}
