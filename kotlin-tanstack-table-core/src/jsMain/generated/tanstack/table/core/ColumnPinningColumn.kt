// Automatically generated - do not modify!

package tanstack.table.core

external interface ColumnPinningColumn {
    var getCanPin: () -> Boolean
    var getIsPinned: () -> ColumnPinningPosition
    var getPinnedIndex: () -> Int
    var pin: (position: ColumnPinningPosition) -> Unit
}
