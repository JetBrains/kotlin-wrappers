// Automatically generated - do not modify!

package tanstack.table.core

external interface RowSelectionRow {
    var getCanMultiSelect: () -> Boolean
    var getCanSelect: () -> Boolean
    var getCanSelectSubRows: () -> Boolean
    var getIsAllSubRowsSelected: () -> Boolean
    var getIsSelected: () -> Boolean
    var getIsSomeSelected: () -> Boolean
    var getToggleSelectedHandler: () -> (event: Any) -> Unit
    var toggleSelected: (value: Boolean?, opts: ToggleSelectedOptions?) -> Unit

    sealed interface ToggleSelectedOptions {
        var selectChildren: Boolean?
    }
}
