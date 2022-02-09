@file:JsModule("react-table")
@file:JsNonModule

@file:Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")

package react.table

import kotlinext.js.Record
import kotlinx.js.ReadonlyArray
import react.FC

external val useGroupBy: PluginHook<Any>

external interface TableGroupByToggleProps

external interface UseGroupByOptions<D : Any> {
    var manualGroupBy: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var disableGroupBy: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var defaultCanGroupBy: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var aggregations: Record<String, AggregatorFn<D>>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var groupByFn: (rows: ReadonlyArray<Row<D>>, columnId: IdType<D>) -> Record<String, ReadonlyArray<Row<D>>>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var autoResetGroupBy: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface UseGroupByHooks<D : Any> {
    val getGroupByToggleProps: ReadonlyArray<HeaderGroupPropGetter<D>>
}

external interface UseGroupByState<D : Any> {
    var groupBy: ReadonlyArray<IdType<D>>
}

external interface UseGroupByColumnOptions<D : Any> {
    val aggregate: Aggregator
    val Aggregated: FC<CellProps<D, *>>
    val disableGroupBy: Boolean
    val defaultCanGroupBy: Boolean
}

external interface UseGroupByInstanceProps<D : Any> {
    val preGroupedRows: ReadonlyArray<Row<D>>
    val preGroupedFlatRows: ReadonlyArray<Row<D>>
    val preGroupedRowsById: Record<String, Row<D>>
    val groupedRows: ReadonlyArray<Row<D>>
    val groupedFlatRows: ReadonlyArray<Row<D>>
    val groupedRowsById: Record<String, Row<D>>
    val onlyGroupedFlatRows: ReadonlyArray<Row<D>>
    val onlyGroupedRowsById: Record<String, Row<D>>
    val nonGroupedFlatRows: ReadonlyArray<Row<D>>
    val nonGroupedRowsById: Record<String, Row<D>>
    val rows: ReadonlyArray<Row<D>>
    val flatRows: ReadonlyArray<Row<D>>
    val rowsById: Record<String, Row<D>>
    fun toggleGroupBy(columnId: IdType<D>, value: Boolean = definedExternally)
}

external interface UseGroupByColumnProps<D : Any> {
    val canGroupBy: Boolean
    val isGrouped: Boolean
    val groupedIndex: Int
    fun toggleGroupBy()
    fun getGroupByToggleProps(props: TableGroupByToggleProps = definedExternally): TableGroupByToggleProps
}

external interface UseGroupByRowProps<D : Any> {
    val isGrouped: Boolean
    val groupByID: IdType<D>
    val groupByVal: String
    val values: Record<IdType<D>, AggregatedValue>
    val subRows: ReadonlyArray<Row<D>>
    val leafRows: ReadonlyArray<Row<D>>
    val depth: Int
    val id: String
    val index: Int
}

external interface UseGroupByCellProps<D : Any> {
    val isGrouped: Boolean
    val isPlaceholder: Boolean
    val isAggregated: Boolean
}

object DefaultAggregators {
    val sum = "sum"
    val average = "average"
    val median = "median"
    val uniqueCount = "uniqueCount"
    val count = "count"
}

typealias AggregatorFn<D> = (
    columnValues: ReadonlyArray<CellValue>,
    rows: ReadonlyArray<Row<D>>,
    isAggregated: Boolean,
) -> AggregatedValue

typealias Aggregator = String
typealias AggregatedValue = Any

