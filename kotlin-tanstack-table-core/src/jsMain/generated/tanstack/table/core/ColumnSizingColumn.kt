// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnSizingColumn {
    var getCanResize: () -> Boolean
    var getIsResizing: () -> Boolean
    var getSize: () -> Int
    var getStart: (position: ColumnPinningPosition?) -> Int
    var resetSize: () -> Unit
}
