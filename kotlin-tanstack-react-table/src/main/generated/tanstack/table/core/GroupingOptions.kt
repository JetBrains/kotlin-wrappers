// Automatically generated - do not modify!

package tanstack.table.core

external interface GroupingOptions {
    var manualGrouping: Boolean?
    var onGroupingChange: OnChangeFn<GroupingState>?
    var enableGrouping: Boolean?
    var getGroupedRowModel: ((table: Table<*>) -> () -> RowModel<*>)?
    var groupedColumnMode: GroupingColumnMode?
}
