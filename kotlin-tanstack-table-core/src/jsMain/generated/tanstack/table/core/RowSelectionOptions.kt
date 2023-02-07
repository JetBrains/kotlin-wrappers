// Automatically generated - do not modify!

package tanstack.table.core

external interface RowSelectionOptions<TData : RowData> {
    var enableRowSelection: (((row: Row<TData>) -> Boolean))?
    var enableMultiRowSelection: (((row: Row<TData>) -> Boolean))?
    var enableSubRowSelection: (((row: Row<TData>) -> Boolean))?
    var onRowSelectionChange: OnChangeFn<RowSelectionState>?
}
