@file:JsModule("react-table")
@file:JsNonModule

@file:Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")

package react.table

import kotlinext.js.jsObject
import react.Child
import react.RProps
import react.table.RenderType.Cell
import react.table.RenderType.Header

@JsName("useTable")
external fun <D> useTableRaw(
    options: TableOptions<D>,
    vararg plugins: PluginHook<D>,
): TableInstance<D>

fun <D> useTable(
    vararg plugins: PluginHook<D>,
    options: TableOptions<D>.() -> Unit,
): TableInstance<D> =
    useTableRaw(jsObject(options), *plugins)

external interface PluginHook<D> {
    val pluginName: String?
}

external interface TableInstance<D> :
    UseTableInstanceProps<D>,
    UseColumnOrderInstanceProps<D>,
    UseGroupByInstanceProps<D>,
    UseExpandedInstanceProps<D>,
    UsePaginationInstanceProps<D>

external interface UseTableInstanceProps<D> {
    val state: TableState<D>
    val plugins: Array<out PluginHook<D>>
    val columns: Array<out ColumnInstance<D, *>>
    val allColumns: Array<out ColumnInstance<D, *>>
    val visibleColumns: Array<out ColumnInstance<D, *>>
    val headerGroups: Array<out HeaderGroup<D>>
    val footerGroups: Array<out HeaderGroup<D>>
    val headers: Array<out ColumnInstance<D, *>>
    val flatHeaders: Array<out ColumnInstance<D, *>>
    val rows: Array<out Row<D>>
    val rowsById: Record<String, Row<D>>
    fun getTableProps(propGetter: TablePropGetter<D> = definedExternally): TableProps
    fun getTableBodyProps(propGetter: TableBodyPropGetter<D> = definedExternally): TableBodyProps
    val prepareRow: (row: Row<D>) -> Unit
    val flatRows: Array<out Row<D>>
    val totalColumnsWidth: Double
    val allColumnsHidden: Boolean
    val toggleHideColumn: (columnId: IdType<D>, value: Boolean?) -> Unit
    val setHiddenColumns: (param: Array<out IdType<D>>) -> Unit
    val toggleHideAllColumns: (value: Boolean?) -> Unit
    val getHooks: () -> Hooks<D>
}

external interface HeaderGroup<D> : /*ColumnInstance<D, Any>,*/ UseTableHeaderGroupProps<D>

external interface UseTableHeaderGroupProps<D> {
    val headers: Array<out ColumnInstance<D, *>>
    fun getHeaderGroupProps(propGetter: HeaderGroupPropGetter<D> = definedExternally): TableHeaderProps
    fun getFooterGroupProps(propGetter: FooterGroupPropGetter<D> = definedExternally): TableFooterProps
    val totalHeaderCount: Int
}

external interface Meta<D> {
    val instance: TableInstance<D>
    val userProps: dynamic
}

external interface ColumnMeta<D> : Meta<D> {
    val column: HeaderGroup<D>
}

external interface RowMeta<D> : Meta<D> {
    val row: Row<D>
}

external interface CellMeta<D, V> : Meta<D> {
    val cell: TableCell<D, V>
}

external interface TableCommonProps : RProps {
    // CSSProperties
    val style: dynamic
    val className: String
    val role: String
}

external interface TableKeyedProps : TableCommonProps {
    val key: ReactKey
}

external interface TableProps : TableCommonProps
external interface TableBodyProps : TableCommonProps
external interface TableHeaderGroupProps : TableKeyedProps
external interface TableFooterGroupProps : TableKeyedProps
external interface TableHeaderProps : TableKeyedProps
external interface TableFooterProps : TableKeyedProps
external interface TableRowProps : TableKeyedProps
external interface TableCellProps : TableKeyedProps

external interface Column<D, V> : ColumnInterface<D, V>
external interface Row<D> : UseTableRowProps<D>, UseGroupByRowProps<D>, UseExpandedRowProps<D>
external interface TableCell<D, V> : UseTableCellProps<D, V>

external interface TableOptions<D> :
    UseTableOptions<D>,
    UseGroupByOptions<D>,
    UseExpandedOptions<D>,
    UsePaginationOptions<D>

external interface UseTableOptions<D> {
    var data: Array<out D>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var columns: Array<out Column<D, *>>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var initialState: TableState<D>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var stateReducer: (
        newState: TableState<D>,
        action: ActionType,
        previousState: TableState<D>,
        instance: TableInstance<D>?,
    ) -> TableState<D>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var useControlledState: (state: TableState<D>, meta: Meta<D>) -> TableState<D>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var defaultColumn: Column<D, *>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var getSubRows: (originalRow: D, relativeIndex: Int) -> Array<out D>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var getRowId: (row: D, relativeIndex: Int, parent: Row<D>?) -> String
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface ColumnGroup<D> : Column<D, Any>, ColumnGroupInterface<D> {
    val headerProps: RProps
    fun render(type: String): Child
}

// ColumnWithLooseAccessor | ColumnWithStrictAccessor
external interface SimpleColumn<D, V> : Column<D, V>, ColumnInterfaceBasedOnValue<D, V> {
    var headerProps: RProps
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var accessor: String
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    @JsName("accessor")
    var accessorFunction: (D) -> V
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    fun render(type: String): Child
}

external interface ColumnInterface<D, V> : UseTableColumnOptions<D, V>

external interface ColumnGroupInterface<D> {
    var columns: Array<out Column<D, *>>
}

external interface UseTableColumnOptions<D, V> {
    var id: IdType<D>

    /**
     * Props are [HeaderProps<D>]
     */
    @JsName(Header)
    var header: String
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    @JsName(Header)
    var headerFunction: (HeaderProps<D, V>) -> Child
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface HeaderProps<D, V> : TableInstance<D> {
    val column: ColumnInstance<D, *>
}

external interface CellProps<D, V> : TableInstance<D> {
    val column: ColumnInstance<D, V>
    val row: Row<D>
    val cell: Cell<D, V>
    val value: V
}

external interface Cell<D, V> : UseTableCellProps<D, V>

external interface UseTableCellProps<D, V> {
    val column: ColumnInstance<D, *>
    val row: Row<D>
    val value: V
    fun getCellProps(propGetter: CellPropGetter<D, V> = definedExternally): TableCellProps
    fun getCellProps(props: TableCellProps): TableCellProps

    fun render(type: String, userProps: dynamic = definedExternally): Child
}

external interface ColumnInstance<D, V> : ColumnInterface<D, V>,
    ColumnInterfaceBasedOnValue<D, V>,
    UseTableColumnProps<D>,
    UseSortByColumnProps<D>

external interface ColumnInterfaceBasedOnValue<D, V> {
    @JsName(Cell)
    var cellFunction: (CellProps<D, V>) -> Child
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface UseTableColumnProps<D> {
    val id: IdType<D>
    val columns: Array<out ColumnInstance<D, *>>?
    val isVisible: Boolean
    fun render(type: String, props: RProps = definedExternally): Child
    val totalLeft: Int
    val totalWidth: Int
    fun toggleHidden(value: Boolean = definedExternally)
    fun getHeaderProps(propGetter: HeaderPropGetter<D> = definedExternally): TableHeaderProps
    fun getHeaderProps(props: TableHeaderProps): TableHeaderProps
    fun getFooterProps(propGetter: FooterPropGetter<D> = definedExternally): TableFooterProps
    fun getFooterProps(props: TableFooterProps): TableFooterProps
    fun getToggleHiddenProps(userProps: dynamic = definedExternally): dynamic
    val placeholderOf: ColumnInstance<D, *>?
}

external interface UseTableRowProps<D> {
    val cells: Array<out TableCell<D, *>>

    val values: Record<IdType<D>, CellValue>
    val index: Int
    val original: D
    val id: IdType<D>
    val subRows: Array<out Row<D>>
    fun getRowProps(propGetter: RowPropGetter<D> = definedExternally): TableRowProps
    fun getRowProps(props: TableRowProps): TableRowProps
}

external interface Hooks<D> : UseTableHooks<D>

external interface UseTableHooks<D> {
    val useOptions: Array<out (options: TableOptions<D>, args: TableOptions<D>) -> TableOptions<D>>
    val stateReducers: Array<out (
        newState: TableState<D>,
        action: ActionType,
        previousState: TableState<D>,
        instance: TableInstance<D>,
    ) -> ReducerTableState<D>>
    val columns: Array<out (columns: Array<out Column<D, *>>, meta: Meta<D>) -> Array<out Column<D, *>>>
    val columnsDeps: Array<out (deps: Array<out dynamic>, meta: Meta<D>) -> Array<out dynamic>>
    val allColumns: Array<out (allColumns: Array<out ColumnInstance<D, *>>, meta: Meta<D>) -> Array<out Column<D, *>>>
    val allColumnsDeps: Array<out (deps: Array<out dynamic>, meta: Meta<D>) -> Array<out dynamic>>
    val visibleColumns: Array<out (allColumns: Array<out ColumnInstance<D, *>>, meta: Meta<D>) -> Array<out Column<D, *>>>
    val visibleColumnsDeps: Array<out (deps: Array<out dynamic>, meta: Meta<D>) -> Array<out dynamic>>
    val headerGroups: Array<out (allColumns: Array<out HeaderGroup<D>>, meta: Meta<D>) -> Array<out HeaderGroup<D>>>
    val headerGroupsDeps: Array<out (deps: Array<out dynamic>, meta: Meta<D>) -> Array<out dynamic>>
    val useInstanceBeforeDimensions: Array<out (instance: TableInstance<D>) -> Unit>
    val useInstance: Array<out (instance: TableInstance<D>) -> Unit>
    val prepareRow: Array<out (row: Row<D>, meta: Meta<D>) -> Unit>
    val useControlledState: Array<out (state: TableState<D>, meta: Meta<D>) -> TableState<D>>

    val tableProps: Array<out TablePropGetter<D>>
    val tableBodyProps: Array<out TableBodyPropGetter<D>>
    val headerGroupProps: Array<out HeaderGroupPropGetter<D>>
    val footerGroupProps: Array<out FooterGroupPropGetter<D>>
    val headerProps: Array<out HeaderPropGetter<D>>
    val footerProps: Array<out FooterPropGetter<D>>
    val rowProps: Array<out RowPropGetter<D>>
    val cellProps: Array<out CellPropGetter<D, *>>
    val useFinalInstance: Array<out (instance: TableInstance<D>) -> Unit>
}

external interface TableState<D> :
    UseColumnOrderState<D>,
    UseGroupByState<D>,
    UseExpandedState<D>,
    UsePaginationState {
    var hiddenColumns: Array<out IdType<D>>
}

external interface ReducerTableState<D> : TableState<D>

external interface ActionType {
    val type: String
}

@Suppress("UNUSED_TYPEALIAS_PARAMETER")
typealias IdType<D> = String
typealias CellValue = Any
typealias ReactKey = String

typealias PropGetter<Props, Meta> = (Props, Meta) -> Array<out Props>

typealias HeaderGroupPropGetter<D> = PropGetter<TableHeaderGroupProps, ColumnMeta<D>>
typealias FooterGroupPropGetter<D> = PropGetter<TableFooterGroupProps, ColumnMeta<D>>

typealias HeaderPropGetter<D> = PropGetter<TableHeaderProps, ColumnMeta<D>>
typealias FooterPropGetter<D> = PropGetter<TableFooterProps, ColumnMeta<D>>

typealias TablePropGetter<D> = PropGetter<TableProps, Meta<D>>
typealias TableBodyPropGetter<D> = PropGetter<TableBodyProps, Meta<D>>

typealias RowPropGetter<D> = PropGetter<TableRowProps, RowMeta<D>>
typealias CellPropGetter<D, V> = PropGetter<TableCellProps, CellMeta<D, V>>

