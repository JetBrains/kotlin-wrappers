// Automatically generated - do not modify!

package tanstack.table.core

external interface IdentifiedColumnDef<TData : RowData, TValue> : ColumnDefBase<TData, TValue> {
    var id: String?
    var header: StringOrTemplateHeader<TData, TValue>?
}
