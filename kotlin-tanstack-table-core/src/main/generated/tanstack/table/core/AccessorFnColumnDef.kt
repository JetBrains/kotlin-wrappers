// Automatically generated - do not modify!

package tanstack.table.core

external interface AccessorFnColumnDef<TData : RowData, TValue> : ColumnDefBase<TData, TValue>,
    ColumnIdentifiers<TData, TValue> {
    var accessorFn: AccessorFn<TData, TValue>
}
