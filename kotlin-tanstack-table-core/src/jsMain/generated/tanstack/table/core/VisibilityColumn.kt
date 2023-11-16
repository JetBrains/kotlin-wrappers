// Automatically generated - do not modify!

package tanstack.table.core

external interface VisibilityColumn {
    var getCanHide: () -> Boolean
    var getIsVisible: () -> Boolean
    var getToggleVisibilityHandler: () -> (event: Any) -> Unit
    var toggleVisibility: (value: Boolean?) -> Unit
}
