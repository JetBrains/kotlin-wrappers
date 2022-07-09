// Automatically generated - do not modify!

package tanstack.table.core

external interface CoreCell<TData : RowData, TValue> {
    var id: String
    var getValue: () -> TValue
    var renderValue: () -> TValue?
    var row: Row<TData>
    var column: Column<TData, TValue>
    var getContext: () -> Context<TData, TValue>

    interface Context<TData : RowData, TValue> {
        var table: Table<TData>
        var column: Column<TData, TValue>
        var row: Row<TData>
        var cell: Cell<TData, TValue>
        var getValue: () -> TValue
        var renderValue: () -> TValue?
    }

}
