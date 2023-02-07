// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingInstance<TData : RowData> {
    var setGrouping: (updater: Updater<GroupingState>) -> Unit
    var resetGrouping: (defaultState: Boolean?) -> Unit
    var getPreGroupedRowModel: () -> RowModel<TData>
    var getGroupedRowModel: () -> RowModel<TData>
}
