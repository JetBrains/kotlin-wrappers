// Automatically generated - do not modify!

package mui.base

import react.PropsWithChildren
import react.ReactNode
import react.dom.events.SyntheticEvent

external interface DropdownProps : PropsWithChildren {
    override var children: ReactNode?

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
}
