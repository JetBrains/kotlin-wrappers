// Automatically generated - do not modify!

package mui.base

external interface DropdownProps : react.PropsWithChildren {
    override var children: react.ReactNode?

    /**
     * If `true`, the dropdown is initially open.
     */
    var defaultOpen: Boolean?

    /**
     * Callback fired when the component requests to be opened or closed.
     */
    var onOpenChange: ((event: react.dom.events.SyntheticEvent<*, *>?, open: Boolean) -> Unit)?

    /**
     * Allows to control whether the dropdown is open.
     * This is a controlled counterpart of `defaultOpen`.
     */
    var open: Boolean?
}
