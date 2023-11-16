// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnSizingHeader {
    var getResizeHandler: () -> (event: Any) -> Unit
    var getSize: () -> Int
    var getStart: (position: ColumnPinningPosition?) -> Int
}
