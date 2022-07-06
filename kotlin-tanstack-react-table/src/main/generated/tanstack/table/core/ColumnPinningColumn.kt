// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnPinningColumn {
    var getCanPin: () -> Boolean
    var getPinnedIndex: () -> Number
    var getIsPinned: () -> ColumnPinningPosition
    var pin: (position: ColumnPinningPosition) -> Unit
}
