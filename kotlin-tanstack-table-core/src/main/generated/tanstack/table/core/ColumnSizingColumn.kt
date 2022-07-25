// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnSizingColumn {
    var getSize: () -> Int
    var getStart: (position: ColumnPinningPosition?) -> Int
    var getCanResize: () -> Boolean
    var getIsResizing: () -> Boolean
    var resetSize: () -> Unit
}
