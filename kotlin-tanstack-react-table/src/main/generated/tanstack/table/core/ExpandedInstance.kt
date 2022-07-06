// Automatically generated - do not modify!

package tanstack.table.core

external interface ExpandedInstance<TData : RowData> {
    var setExpanded: (updater: Updater<ExpandedState>) -> Unit
    var toggleAllRowsExpanded: (expanded: Boolean?) -> Unit
    var resetExpanded: (defaultState: Boolean?) -> Unit
    var getCanSomeRowsExpand: () -> Boolean
    var getToggleAllRowsExpandedHandler: () -> (event: Any) -> Unit
    var getIsSomeRowsExpanded: () -> Boolean
    var getIsAllRowsExpanded: () -> Boolean
    var getExpandedDepth: () -> Number
    var getExpandedRowModel: () -> RowModel<TData>
    var getPreExpandedRowModel: () -> RowModel<TData>
}
