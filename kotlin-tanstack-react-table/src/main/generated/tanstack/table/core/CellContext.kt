// Automatically generated - do not modify!

package tanstack.table.core

external interface CellContext<TData : RowData, TValue> {
    var table: Table<TData>
    var column: Column<TData, TValue>
    var row: Row<TData>
    var cell: Cell<TData, TValue>
    var getValue: Getter<TValue>
    var renderValue: Getter<TValue?>
}
