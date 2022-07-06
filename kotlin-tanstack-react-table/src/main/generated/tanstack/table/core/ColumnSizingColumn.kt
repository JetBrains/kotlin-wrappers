// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnSizingColumn {
    var getSize: () -> Number
    var getStart: (position: ColumnPinningPosition?) -> Number
    var getCanResize: () -> Boolean
    var getIsResizing: () -> Boolean
    var resetSize: () -> Unit
}
