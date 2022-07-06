// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnSizingHeader {
    var getSize: () -> Number
    var getStart: (position: ColumnPinningPosition?) -> Number
    var getResizeHandler: () -> (event: Any) -> Unit
}
