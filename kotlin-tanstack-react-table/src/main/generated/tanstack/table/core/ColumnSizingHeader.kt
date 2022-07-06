// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnSizingHeader {
    var getSize: () -> Int
    var getStart: (position: ColumnPinningPosition?) -> Int
    var getResizeHandler: () -> (event: Any) -> Unit
}
