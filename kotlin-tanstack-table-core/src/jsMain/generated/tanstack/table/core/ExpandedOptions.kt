// Automatically generated - do not modify!

package tanstack.table.core

external interface ExpandedOptions<TData : RowData> {
    var autoResetExpanded: Boolean?
    var enableExpanding: Boolean?
    var getExpandedRowModel: ((table: Table<TData>) -> () -> RowModel<TData>)?
    var getIsRowExpanded: ((row: Row<TData>) -> Boolean)?
    var getRowCanExpand: ((row: Row<TData>) -> Boolean)?
    var manualExpanding: Boolean?
    var onExpandedChange: OnChangeFn<ExpandedState>?
    var paginateExpandedRows: Boolean?
}
