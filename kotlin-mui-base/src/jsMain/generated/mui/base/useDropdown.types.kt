// Automatically generated - do not modify!

package mui.base

import react.dom.events.SyntheticEvent

external interface UseDropdownParameters {
    /**
     * If `true`, the dropdown is initially open.
     */
    var defaultOpen: Boolean?

    /**
     * Callback fired when the component requests to be opened or closed.
     */
    var onOpenChange: ((event: SyntheticEvent<*, *>?, open: Boolean) -> Unit)?

    /**
     * Allows to control whether the dropdown is open.
     * This is a controlled counterpart of `defaultOpen`.
     */
    var open: Boolean?

    /**
     * The name of the component using useDropdown.
     * For debugging purposes.
     * @default 'useDropdown'
     */
    var componentName: String?
}

external interface UseDropdownReturnValue {
    /**
     * The value to be passed into the DropdownContext provider.
     */
    var contextValue: Any? /* DropdownContextValue */

    /**
     * If `true`, the dropdown is open.
     */
    var open: Boolean
}
