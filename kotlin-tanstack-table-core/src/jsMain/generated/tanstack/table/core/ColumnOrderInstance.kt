// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnOrderInstance<TData : RowData> {
    var resetColumnOrder: (defaultState: Boolean?) -> Unit
    var setColumnOrder: (updater: Updater<ColumnOrderState>) -> Unit
}
