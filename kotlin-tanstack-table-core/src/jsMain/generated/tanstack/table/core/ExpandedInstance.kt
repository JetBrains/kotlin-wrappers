// Automatically generated - do not modify!

package tanstack.table.core

external interface ExpandedInstance<TData : RowData> {
    var getCanSomeRowsExpand: () -> Boolean
    var getExpandedDepth: () -> Int
    var getExpandedRowModel: () -> RowModel<TData>
    var getIsAllRowsExpanded: () -> Boolean
    var getIsSomeRowsExpanded: () -> Boolean
    var getPreExpandedRowModel: () -> RowModel<TData>
    var getToggleAllRowsExpandedHandler: () -> (event: Any) -> Unit
    var resetExpanded: (defaultState: Boolean?) -> Unit
    var setExpanded: (updater: Updater<ExpandedState>) -> Unit
    var toggleAllRowsExpanded: (expanded: Boolean?) -> Unit
}
