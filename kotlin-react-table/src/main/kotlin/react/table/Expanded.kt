@file:JsModule("react-table")
@file:JsNonModule

@file:Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")

package react.table

import kotlinext.js.Record

@JsName("useExpanded")
external val useExpandedRaw: PluginHook<*>

fun <D> useExpanded(): PluginHook<D> =
    useExpandedRaw.unsafeCast<PluginHook<D>>()

external interface TableExpandedToggleProps : TableKeyedProps

external interface UseExpandedOptions<D> {
    var manualExpandedKey: IdType<D>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var paginateExpandedRows: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var expandSubRows: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var autoResetExpanded: Boolean
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface UseExpandedHooks<D> {
    val getToggleRowsExpandedProps: Array<out PropGetter<D, TableCommonProps>>
    val getToggleAllRowsExpandedProps: Array<out PropGetter<D, TableCommonProps>>
}

external interface UseExpandedState<D> {
    var expanded: Record<IdType<D>, Boolean>
}

external interface UseExpandedInstanceProps<D> {
    val preExpandedRows: Array<out Row<D>>
    val expandedRows: Array<out Row<D>>
    val rows: Array<out Row<D>>
    val expandedDepth: Int
    val isAllRowsExpanded: Boolean
    fun toggleRowExpanded(id: Array<out IdType<D>>, value: Boolean = definedExternally)
    fun toggleAllRowsExpanded(value: Boolean = definedExternally)
}

external interface UseExpandedRowProps<D> {
    val isExpanded: Boolean
    val canExpand: Boolean
    val subRows: Array<out Row<D>>
    fun toggleRowExpanded(value: Boolean = definedExternally)
    fun getToggleRowExpandedProps(props: TableExpandedToggleProps = definedExternally): TableExpandedToggleProps
}
