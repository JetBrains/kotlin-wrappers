// Automatically generated - do not modify!

package tanstack.table.core

external interface RowPinningRow {
    var getCanPin: () -> Boolean
    var getIsPinned: () -> RowPinningPosition
    var getPinnedIndex: () -> Int
    var pin: (position: RowPinningPosition, includeLeafRows: Boolean?, includeParentRows: Boolean?) -> Unit
}
