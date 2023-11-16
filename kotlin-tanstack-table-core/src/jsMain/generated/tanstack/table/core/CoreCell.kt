// Automatically generated - do not modify!

package tanstack.table.core

external interface CoreCell<TData : RowData, TValue> {
    var column: Column<TData, TValue>
    var getContext: () -> CellContext<TData, TValue>
    var getValue: Getter<TValue> /* CellContext<TData, TValue>['getValue'] */
    var id: String
    var renderValue: Getter<TValue?> /* CellContext<TData, TValue>['renderValue'] */
    var row: Row<TData>
}
