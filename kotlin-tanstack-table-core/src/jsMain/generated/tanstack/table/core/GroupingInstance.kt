// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingInstance<TData : RowData> {
    var getGroupedRowModel: () -> RowModel<TData>
    var getPreGroupedRowModel: () -> RowModel<TData>
    var resetGrouping: (defaultState: Boolean?) -> Unit
    var setGrouping: (updater: Updater<GroupingState>) -> Unit
}
