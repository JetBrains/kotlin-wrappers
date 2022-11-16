// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingOptionsBase<TData : RowData> {
    var manualGrouping: Boolean?
    var onGroupingChange: OnChangeFn<GroupingState>?
    var enableGrouping: Boolean?
    var getGroupedRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?
    var groupedColumnMode: GroupingColumnMode?
}
