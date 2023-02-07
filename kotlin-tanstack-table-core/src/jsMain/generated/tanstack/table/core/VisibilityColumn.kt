// Automatically generated - do not modify!

package tanstack.table.core

external interface VisibilityColumn {
    var getCanHide: () -> Boolean
    var getIsVisible: () -> Boolean
    var toggleVisibility: (value: Boolean?) -> Unit
    var getToggleVisibilityHandler: () -> (event: Any) -> Unit
}
