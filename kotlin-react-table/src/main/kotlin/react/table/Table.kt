@file:JsModule("react-table")
@file:JsNonModule

@file:Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")

package react.table

import kotlinext.js.Record
import org.w3c.dom.events.Event
import react.Child
import react.RProps
import react.table.RenderType.Cell
import react.table.RenderType.Header

external fun <D: Any> useTable(
    options: TableOptions<D>,
    vararg plugins: PluginHook<D>,
): TableInstance<D>

external interface TableInstance<D: Any> :
    UseTableInstanceProps<D>,
    UseColumnOrderInstanceProps<D>,
    UseGroupByInstanceProps<D>,
    UseExpandedInstanceProps<D>,
    UsePaginationInstanceProps<D>,
    UseRowSelectInstanceProps<D>,
    UseRowStateInstanceProps<D>

external interface UseTableInstanceProps<D: Any> {
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

external interface HeaderGroup<D: Any> : /*ColumnInstance<D, Any>,*/ UseTableHeaderGroupProps<D>

external interface UseTableHeaderGroupProps<D: Any> {
    val headers: Array<out ColumnInstance<D, *>>
    fun getHeaderGroupProps(propGetter: HeaderGroupPropGetter<D> = definedExternally): TableHeaderProps
    fun getFooterGroupProps(propGetter: FooterGroupPropGetter<D> = definedExternally): TableFooterProps
    val totalHeaderCount: Int
}

external interface Meta<D: Any> {
    val instance: TableInstance<D>
    val userProps: dynamic
}

external interface ColumnMeta<D: Any> : Meta<D> {
    val column: HeaderGroup<D>
}

external interface RowMeta<D: Any> : Meta<D> {
    val row: Row<D>
}

external interface CellMeta<D: Any, V> : Meta<D> {
    val cell: TableCell<D, V>
}

external interface TableCommonProps : RProps {
    // CSSProperties
    var style: dynamic
    var className: String?
    var role: String?
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

external interface TableToggleCommonProps : TableCommonProps {
    var onChange: (Event) -> Unit
    var checked: Boolean
    var title: String
    var indeterminate: Boolean
}

external interface Column<D: Any, V> : ColumnInterface<D, V>

external interface Row<D: Any> :
    UseTableRowProps<D>,
    UseGroupByRowProps<D>,
    UseExpandedRowProps<D>,
    UseRowSelectRowProps<D>,
    UseRowStateRowProps<D>

external interface TableCell<D: Any, V> : UseTableCellProps<D, V>

external interface TableOptions<D: Any> :
    UseTableOptions<D>,
    UseGroupByOptions<D>,
    UseExpandedOptions<D>,
    UsePaginationOptions<D>,
    UseRowSelectOptions<D>,
    UseRowStateOptions<D>

external interface UseTableOptions<D: Any> {
    var data: Array<out D>
    var columns: Array<out Column<D, *>>
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

    var getSubRows: (originalRow: D, relativeIndex: Int) -> Array<out D>
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get

    var getRowId: (row: D, relativeIndex: Int, parent: Row<D>?) -> String
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface ColumnGroup<D: Any> : Column<D, Any>, ColumnGroupInterface<D> {
    val headerProps: RProps
    fun render(type: String): Child
}

// ColumnWithLooseAccessor | ColumnWithStrictAccessor
external interface SimpleColumn<D: Any, V> : Column<D, V>, ColumnInterfaceBasedOnValue<D, V> {
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

external interface ColumnInterface<D: Any, V> : UseTableColumnOptions<D, V>

external interface ColumnGroupInterface<D: Any> {
    var columns: Array<out Column<D, *>>
}

external interface UseTableColumnOptions<D: Any, V> {
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

external interface HeaderProps<D: Any, V> : TableInstance<D> {
    val column: ColumnInstance<D, *>
}

external interface CellProps<D: Any, V> : TableInstance<D> {
    val column: ColumnInstance<D, V>
    val row: Row<D>
    val cell: Cell<D, V>
    val value: V
}

external interface Cell<D: Any, V> :
    UseTableCellProps<D, V>,
    UseGroupByCellProps<D>,
    UseRowStateCellProps<D>

external interface UseTableCellProps<D: Any, V> {
    val column: ColumnInstance<D, *>
    val row: Row<D>
    val value: V
    fun getCellProps(propGetter: CellPropGetter<D, V> = definedExternally): TableCellProps
    fun getCellProps(props: TableCellProps): TableCellProps

    fun render(type: String, userProps: dynamic = definedExternally): Child
}

external interface ColumnInstance<D: Any, V> :
    Column<D, V>,
    ColumnInterface<D, V>,
    ColumnInterfaceBasedOnValue<D, V>,
    UseTableColumnProps<D>,
    UseSortByColumnProps<D>

external interface ColumnInterfaceBasedOnValue<D: Any, V> {
    @JsName(Cell)
    var cellFunction: (CellProps<D, V>) -> Child
        @Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
        get
}

external interface UseTableColumnProps<D: Any> {
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

external interface UseTableRowProps<D: Any> {
    val cells: Array<out TableCell<D, *>>

    val values: Record<IdType<D>, CellValue>
    val index: Int
    val original: D
    val id: IdType<D>
    val subRows: Array<out Row<D>>
    fun getRowProps(propGetter: RowPropGetter<D> = definedExternally): TableRowProps
    fun getRowProps(props: TableRowProps): TableRowProps
}

external interface Hooks<D: Any> :
    UseTableHooks<D>,
    UseGroupByHooks<D>,
    UseExpandedHooks<D>,
    UseRowSelectHooks<D>

external interface UseTableHooks<D: Any> {
    var useOptions: Array<out (options: TableOptions<D>, args: TableOptions<D>) -> TableOptions<D>>
    var stateReducers: Array<out (
        newState: TableState<D>,
        action: ActionType,
        previousState: TableState<D>,
        instance: TableInstance<D>,
    ) -> ReducerTableState<D>>
    var columns: Array<out (columns: Array<out Column<D, *>>, meta: Meta<D>) -> Array<out Column<D, *>>>
    var columnsDeps: Array<out (deps: Array<out dynamic>, meta: Meta<D>) -> Array<out dynamic>>
    var allColumns: Array<out (allColumns: Array<out ColumnInstance<D, *>>, meta: Meta<D>) -> Array<out Column<D, *>>>
    var allColumnsDeps: Array<out (deps: Array<out dynamic>, meta: Meta<D>) -> Array<out dynamic>>
    var visibleColumns: Array<out (allColumns: Array<out ColumnInstance<D, *>>, meta: Meta<D>) -> Array<out Column<D, *>>>
    var visibleColumnsDeps: Array<out (deps: Array<out dynamic>, meta: Meta<D>) -> Array<out dynamic>>
    var headerGroups: Array<out (allColumns: Array<out HeaderGroup<D>>, meta: Meta<D>) -> Array<out HeaderGroup<D>>>
    var headerGroupsDeps: Array<out (deps: Array<out dynamic>, meta: Meta<D>) -> Array<out dynamic>>
    var useInstanceBeforeDimensions: Array<out (instance: TableInstance<D>) -> Unit>
    var useInstance: Array<out (instance: TableInstance<D>) -> Unit>
    var prepareRow: Array<out (row: Row<D>, meta: Meta<D>) -> Unit>
    var useControlledState: Array<out (state: TableState<D>, meta: Meta<D>) -> TableState<D>>

    var getTableProps: Array<out TablePropGetter<D>>
    var getTableBodyProps: Array<out TableBodyPropGetter<D>>
    var getHeaderGroupProps: Array<out HeaderGroupPropGetter<D>>
    var getFooterGroupProps: Array<out FooterGroupPropGetter<D>>
    var getHeaderProps: Array<out HeaderPropGetter<D>>
    var getFooterProps: Array<out FooterPropGetter<D>>
    var getRowProps: Array<out RowPropGetter<D>>
    var getCellProps: Array<out CellPropGetter<D, *>>
    var useFinalInstance: Array<out (instance: TableInstance<D>) -> Unit>
}

external interface TableState<D: Any> :
    UseColumnOrderState<D>,
    UseGroupByState<D>,
    UseExpandedState<D>,
    UsePaginationState,
    UseRowSelectState<D>,
    UseRowStateState<D> {
    var hiddenColumns: Array<out IdType<D>>
}

external interface ReducerTableState<D: Any> : TableState<D>

external interface ActionType {
    val type: String
}

@Suppress("UNUSED_TYPEALIAS_PARAMETER")
typealias IdType<D> = String
typealias CellValue = Any
typealias ReactKey = String

typealias PropGetter<Props, Meta> = (Props, Meta) -> Props

typealias HeaderGroupPropGetter<D> = PropGetter<TableHeaderGroupProps, ColumnMeta<D>>
typealias FooterGroupPropGetter<D> = PropGetter<TableFooterGroupProps, ColumnMeta<D>>

typealias HeaderPropGetter<D> = PropGetter<TableHeaderProps, ColumnMeta<D>>
typealias FooterPropGetter<D> = PropGetter<TableFooterProps, ColumnMeta<D>>

typealias TablePropGetter<D> = PropGetter<TableProps, Meta<D>>
typealias TableBodyPropGetter<D> = PropGetter<TableBodyProps, Meta<D>>

typealias RowPropGetter<D> = PropGetter<TableRowProps, RowMeta<D>>
typealias CellPropGetter<D, V> = PropGetter<TableCellProps, CellMeta<D, V>>

