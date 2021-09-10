@file:JsModule("react-table")
@file:JsNonModule

@file:Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")

package react.table

import kotlinext.js.ReadonlyArray
import kotlinext.js.Record
import react.CSSProperties
import react.Key
import react.Props
import react.ReactNode
import react.dom.ChangeEventHandler
import react.table.RenderType.Cell
import react.table.RenderType.Header

external fun <D : Any> useTable(
    options: TableOptions<D>,
    vararg plugins: PluginHook<D>,
): TableInstance<D>

external interface TableInstance<D : Any> :
    UseTableInstanceProps<D>,
    UseColumnOrderInstanceProps<D>,
    UseGroupByInstanceProps<D>,
    UseExpandedInstanceProps<D>,
    UsePaginationInstanceProps<D>,
    UseRowSelectInstanceProps<D>,
    UseRowStateInstanceProps<D>

external interface UseTableInstanceProps<D : Any> {
    val state: TableState<D>
    val plugins: ReadonlyArray<PluginHook<D>>
    val columns: ReadonlyArray<ColumnInstance<D, *>>
    val allColumns: ReadonlyArray<ColumnInstance<D, *>>
    val visibleColumns: ReadonlyArray<ColumnInstance<D, *>>
    val headerGroups: ReadonlyArray<HeaderGroup<D>>
    val footerGroups: ReadonlyArray<HeaderGroup<D>>
    val headers: ReadonlyArray<ColumnInstance<D, *>>
    val flatHeaders: ReadonlyArray<ColumnInstance<D, *>>
    val rows: ReadonlyArray<Row<D>>
    val rowsById: Record<String, Row<D>>
    fun getTableProps(propGetter: TablePropGetter<D> = definedExternally): TableProps
    fun getTableBodyProps(propGetter: TableBodyPropGetter<D> = definedExternally): TableBodyProps
    val prepareRow: (row: Row<D>) -> Unit
    val flatRows: ReadonlyArray<Row<D>>
    val totalColumnsWidth: Double
    val allColumnsHidden: Boolean
    val toggleHideColumn: (columnId: IdType<D>, value: Boolean?) -> Unit
    val setHiddenColumns: (param: ReadonlyArray<IdType<D>>) -> Unit
    val toggleHideAllColumns: (value: Boolean?) -> Unit
    val getHooks: () -> Hooks<D>
}

external interface HeaderGroup<D : Any> : /*ColumnInstance<D, Any>,*/ UseTableHeaderGroupProps<D>

external interface UseTableHeaderGroupProps<D : Any> {
    val headers: ReadonlyArray<ColumnInstance<D, *>>
    fun getHeaderGroupProps(propGetter: HeaderGroupPropGetter<D> = definedExternally): TableHeaderProps
    fun getFooterGroupProps(propGetter: FooterGroupPropGetter<D> = definedExternally): TableFooterProps
    val totalHeaderCount: Int
}

external interface Meta<D : Any> {
    val instance: TableInstance<D>
    val userProps: dynamic
}

external interface ColumnMeta<D : Any> : Meta<D> {
    val column: HeaderGroup<D>
}

external interface RowMeta<D : Any> : Meta<D> {
    val row: Row<D>
}

external interface CellMeta<D : Any, V> : Meta<D> {
    val cell: TableCell<D, V>
}

external interface TableCommonProps : Props {
    var style: CSSProperties
    var className: String?
    var role: String?
}

external interface TableKeyedProps : TableCommonProps {
    val key: Key
}

external interface TableProps : TableCommonProps
external interface TableBodyProps : TableCommonProps
external interface TableHeaderGroupProps : TableKeyedProps
external interface TableFooterGroupProps : TableKeyedProps
external interface TableHeaderProps : TableKeyedProps
external interface TableFooterProps : TableKeyedProps
external interface TableRowProps : TableKeyedProps
external interface TableCellProps : TableKeyedProps

external interface TableToggleCommonProps : TableCommonProps {
    var onChange: ChangeEventHandler<*>
    var checked: Boolean
    var title: String
    var indeterminate: Boolean
}

external interface Column<D : Any, V> : ColumnInterface<D, V>

external interface Row<D : Any> :
    UseTableRowProps<D>,
    UseGroupByRowProps<D>,
    UseExpandedRowProps<D>,
    UseRowSelectRowProps<D>,
    UseRowStateRowProps<D>

external interface TableCell<D : Any, V> : UseTableCellProps<D, V>

external interface TableOptions<D : Any> :
    UseTableOptions<D>,
    UseGroupByOptions<D>,
    UseExpandedOptions<D>,
    UsePaginationOptions<D>,
    UseRowSelectOptions<D>,
    UseRowStateOptions<D>

external interface UseTableOptions<D : Any> {
    var data: ReadonlyArray<D>
    var columns: ReadonlyArray<Column<D, *>>
    var initialState: TableState<D>

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

    var getSubRows: (originalRow: D, relativeIndex: Int) -> ReadonlyArray<D>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var getRowId: (row: D, relativeIndex: Int, parent: Row<D>?) -> String
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface ColumnGroup<D : Any> : Column<D, Any>, ColumnGroupInterface<D> {
    val headerProps: Props
    fun render(type: String): ReactNode
}

// ColumnWithLooseAccessor | ColumnWithStrictAccessor
external interface SimpleColumn<D : Any, V> : Column<D, V>, ColumnInterfaceBasedOnValue<D, V> {
    var headerProps: Props
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var accessor: String
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    @JsName("accessor")
    var accessorFunction: (D) -> V
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    fun render(type: String): ReactNode
}

external interface ColumnInterface<D : Any, V> : UseTableColumnOptions<D, V>

external interface ColumnGroupInterface<D : Any> {
    var columns: ReadonlyArray<Column<D, *>>
}

external interface UseTableColumnOptions<D : Any, V> {
    var id: IdType<D>

    /**
     * Props are [HeaderProps<D>]
     */
    @JsName(Header)
    var header: String
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    @JsName(Header)
    var headerFunction: (HeaderProps<D, V>) -> ReactNode
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface HeaderProps<D : Any, V> : TableInstance<D> {
    val column: ColumnInstance<D, *>
}

external interface CellProps<D : Any, V> : TableInstance<D>, Props {
    val column: ColumnInstance<D, V>
    val row: Row<D>
    val cell: Cell<D, V>
    val value: V
}

external interface Cell<D : Any, V> :
    UseTableCellProps<D, V>,
    UseGroupByCellProps<D>,
    UseRowStateCellProps<D>

external interface UseTableCellProps<D : Any, V> {
    val column: ColumnInstance<D, *>
    val row: Row<D>
    val value: V
    fun getCellProps(propGetter: CellPropGetter<D, V> = definedExternally): TableCellProps
    fun getCellProps(props: TableCellProps): TableCellProps

    fun render(type: String, userProps: dynamic = definedExternally): ReactNode
}

external interface ColumnInstance<D : Any, V> :
    Column<D, V>,
    ColumnInterface<D, V>,
    ColumnInterfaceBasedOnValue<D, V>,
    UseTableColumnProps<D>,
    UseSortByColumnProps<D>

external interface ColumnInterfaceBasedOnValue<D : Any, V> {
    @JsName(Cell)
    var cellFunction: (CellProps<D, V>) -> ReactNode
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface UseTableColumnProps<D : Any> {
    val id: IdType<D>
    val columns: ReadonlyArray<ColumnInstance<D, *>>?
    val isVisible: Boolean
    fun render(type: String, props: Props = definedExternally): ReactNode
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

external interface UseTableRowProps<D : Any> {
    val cells: ReadonlyArray<TableCell<D, *>>

    val values: Record<IdType<D>, CellValue>
    val index: Int
    val original: D
    val id: IdType<D>
    val subRows: ReadonlyArray<Row<D>>
    fun getRowProps(propGetter: RowPropGetter<D> = definedExternally): TableRowProps
    fun getRowProps(props: TableRowProps): TableRowProps
}

external interface Hooks<D : Any> :
    UseTableHooks<D>,
    UseGroupByHooks<D>,
    UseExpandedHooks<D>,
    UseRowSelectHooks<D>

external interface UseTableHooks<D : Any> {
    var useOptions: ReadonlyArray<(options: TableOptions<D>, args: TableOptions<D>) -> TableOptions<D>>
    var stateReducers: ReadonlyArray<(
        newState: TableState<D>,
        action: ActionType,
        previousState: TableState<D>,
        instance: TableInstance<D>,
    ) -> ReducerTableState<D>>
    var columns: ReadonlyArray<(columns: ReadonlyArray<Column<D, *>>, meta: Meta<D>) -> ReadonlyArray<Column<D, *>>>
    var columnsDeps: ReadonlyArray<(deps: ReadonlyArray<dynamic>, meta: Meta<D>) -> ReadonlyArray<dynamic>>
    var allColumns: ReadonlyArray<(allColumns: ReadonlyArray<ColumnInstance<D, *>>, meta: Meta<D>) -> ReadonlyArray<Column<D, *>>>
    var allColumnsDeps: ReadonlyArray<(deps: ReadonlyArray<dynamic>, meta: Meta<D>) -> ReadonlyArray<dynamic>>
    var visibleColumns: ReadonlyArray<(allColumns: ReadonlyArray<ColumnInstance<D, *>>, meta: Meta<D>) -> ReadonlyArray<Column<D, *>>>
    var visibleColumnsDeps: ReadonlyArray<(deps: ReadonlyArray<dynamic>, meta: Meta<D>) -> ReadonlyArray<dynamic>>
    var headerGroups: ReadonlyArray<(allColumns: ReadonlyArray<HeaderGroup<D>>, meta: Meta<D>) -> ReadonlyArray<HeaderGroup<D>>>
    var headerGroupsDeps: ReadonlyArray<(deps: ReadonlyArray<dynamic>, meta: Meta<D>) -> ReadonlyArray<dynamic>>
    var useInstanceBeforeDimensions: ReadonlyArray<(instance: TableInstance<D>) -> Unit>
    var useInstance: ReadonlyArray<(instance: TableInstance<D>) -> Unit>
    var prepareRow: ReadonlyArray<(row: Row<D>, meta: Meta<D>) -> Unit>
    var useControlledState: ReadonlyArray<(state: TableState<D>, meta: Meta<D>) -> TableState<D>>

    var getTableProps: ReadonlyArray<TablePropGetter<D>>
    var getTableBodyProps: ReadonlyArray<TableBodyPropGetter<D>>
    var getHeaderGroupProps: ReadonlyArray<HeaderGroupPropGetter<D>>
    var getFooterGroupProps: ReadonlyArray<FooterGroupPropGetter<D>>
    var getHeaderProps: ReadonlyArray<HeaderPropGetter<D>>
    var getFooterProps: ReadonlyArray<FooterPropGetter<D>>
    var getRowProps: ReadonlyArray<RowPropGetter<D>>
    var getCellProps: ReadonlyArray<CellPropGetter<D, *>>
    var useFinalInstance: ReadonlyArray<(instance: TableInstance<D>) -> Unit>
}

external interface TableState<D : Any> :
    UseColumnOrderState<D>,
    UseGroupByState<D>,
    UseExpandedState<D>,
    UsePaginationState,
    UseRowSelectState<D>,
    UseRowStateState<D> {
    var hiddenColumns: ReadonlyArray<IdType<D>>
}

external interface ReducerTableState<D : Any> : TableState<D>

external interface ActionType {
    val type: String
}

@Suppress("UNUSED_TYPEALIAS_PARAMETER")
typealias IdType<D> = String
typealias CellValue = Any

typealias PropGetter<Props, Meta> = (Props, Meta) -> Props

typealias HeaderGroupPropGetter<D> = PropGetter<TableHeaderGroupProps, ColumnMeta<D>>
typealias FooterGroupPropGetter<D> = PropGetter<TableFooterGroupProps, ColumnMeta<D>>

typealias HeaderPropGetter<D> = PropGetter<TableHeaderProps, ColumnMeta<D>>
typealias FooterPropGetter<D> = PropGetter<TableFooterProps, ColumnMeta<D>>

typealias TablePropGetter<D> = PropGetter<TableProps, Meta<D>>
typealias TableBodyPropGetter<D> = PropGetter<TableBodyProps, Meta<D>>

typealias RowPropGetter<D> = PropGetter<TableRowProps, RowMeta<D>>
typealias CellPropGetter<D, V> = PropGetter<TableCellProps, CellMeta<D, V>>

