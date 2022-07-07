// Automatically generated - do not modify!

package tanstack.table.core

external interface ExpandedOptions<TData : RowData> {
    var manualExpanding: Boolean?
    var onExpandedChange: OnChangeFn<ExpandedState>?
    var autoResetExpanded: Boolean?
    var enableExpanding: Boolean?
    var getExpandedRowModel: ((table: Table<*>) -> () -> RowModel<*>)?
    var getIsRowExpanded: ((row: Row<TData>) -> Boolean)?
    var getRowCanExpand: ((row: Row<TData>) -> Boolean)?
    var paginateExpandedRows: Boolean?
}
