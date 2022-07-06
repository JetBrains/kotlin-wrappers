// Automatically generated - do not modify!

package tanstack.table.core

external interface RowSelectionRow {
    var getIsSelected: () -> Boolean
    var getIsSomeSelected: () -> Boolean
    var getIsAllSubRowsSelected: () -> Boolean
    var getCanSelect: () -> Boolean
    var getCanMultiSelect: () -> Boolean
    var getCanSelectSubRows: () -> Boolean
    var toggleSelected: (value: Boolean?) -> Unit
    var getToggleSelectedHandler: () -> (event: Any) -> Unit
}
