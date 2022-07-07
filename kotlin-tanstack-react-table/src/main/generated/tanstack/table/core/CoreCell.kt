// Automatically generated - do not modify!

package tanstack.table.core

external interface CoreCell<TData : RowData> {
    var id: String
    var getValue: () -> Any
    var renderValue: () -> Any
    var row: Row<TData>
    var column: Column<TData>
    var getContext: () -> Context<TData>

    interface Context<TData : RowData> {
        var table: Table<TData>
        var column: Column<TData>
        var row: Row<TData>
        var cell: Cell<TData>
        var getValue: () -> Any
        var renderValue: () -> Any
    }

}
