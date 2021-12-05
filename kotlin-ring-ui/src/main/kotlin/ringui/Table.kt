package ringui

import kotlinext.js.ReadonlyArray
import org.w3c.dom.events.Event
import react.*

external interface TableProps : PropsWithClassName {
    var loaderClassName: String
    var data: ReadonlyArray<RowData>
    var columns: ReadonlyArray<ColumnProps>
    var caption: String
    var isItemSelectable: (RowData) -> Boolean
    var stickyHeader: Boolean?
    var stickyHeaderOffset: String
    var loading: Boolean?
    var getItemKey: (RowData) -> String
    var getItemClassName: (RowData) -> String
    var getItemDataTest: (RowData) -> String
    var onSort: (ColumnProps, Boolean) -> Unit

    /**
     * First int - oldIndex
     *
     * Second int - newIndex
     */
    var onReorder: (RowData, Int, Int) -> Unit
    var sortKey: String
    var sortOrder: Boolean?
    var draggable: Boolean?
    var alwaysShowDragHandle: Boolean?
    var getItemLevel: (RowData) -> Int
    var isItemCollapsible: (RowData) -> Boolean
    var isParentCollapsible: (RowData) -> Boolean
    var isItemCollapsed: (RowData) -> Boolean
    var onItemCollapse: (RowData) -> Boolean
    var onItemExpand: (RowData) -> Boolean
    var isDisabledSelectionVisible: (RowData) -> Boolean
    var getCheckboxTooltip: (RowData) -> String
    var innerRef: Ref<*>
    var focused: Boolean?
    var onFocusRestore: () -> Unit
    var selection: Selection
    var selectable: Boolean?
    var onSelect: (Selection) -> Unit
    var onItemDoubleClick: (RowData) -> Unit
    var onItemClick: (RowData, Event) -> Unit
    var shortcutsMap: Map<String, Event>
    var disabledHover: Boolean?
    var remoteSelection: Boolean?
    var renderEmpty: () -> ReactElement
}

@JsModule("@jetbrains/ring-ui/components/table/table")
@JsNonModule
@JsName("default")
external val Table: ComponentClass<TableProps>

@JsModule("@jetbrains/ring-ui/components/table/multitable")
@JsNonModule
@JsName("default")
external val MultiTable: ComponentClass<PropsWithChildren>