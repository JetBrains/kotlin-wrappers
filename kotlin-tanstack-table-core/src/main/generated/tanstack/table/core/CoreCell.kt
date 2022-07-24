// Automatically generated - do not modify!

package tanstack.table.core

external interface CoreCell<TData : RowData, TValue> {
    var id: String
    var getValue: Getter<TValue> /* CellContext<TData, TValue>['getValue'] */
    var renderValue: Getter<TValue?> /* CellContext<TData, TValue>['renderValue'] */
    var row: Row<TData>
    var column: Column<TData, TValue>
    var getContext: () -> CellContext<TData, TValue>
}
