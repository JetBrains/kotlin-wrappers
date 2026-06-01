// Automatically generated - do not modify!

package mui.base

import react.ElementType
import react.Props
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface SnackbarProps :
    SnackbarOwnProps,
    HTMLAttributes<HTMLDivElement>

external interface SnackbarRootSlotPropsOverrides

external interface SnackbarClickAwayListenerSlotPropsOverrides

external interface SnackbarOwnProps :
    UseSnackbarParameters,
    PropsWithChildren {
    override var children: ReactNode?

    /**
     * The components used for each slot inside the Snackbar.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: SnackbarSlots?

    /**
     * The props used for each slot inside the Snackbar.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var clickAwayListener: Props? /* SlotComponentProps<typeof ClickAwayListener, SnackbarClickAwayListenerSlotPropsOverrides, SnackbarOwnerState> */
        var root: Props? /* SlotComponentProps<'div', SnackbarRootSlotPropsOverrides, SnackbarOwnerState> */
    }

    /**
     * The prop used to handle exited transition and unmount the component.
     * @default true
     */
    var exited: Boolean?
}

external interface SnackbarSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: ElementType<*>?
}

external interface SnackbarClickAwayListenerSlotProps :
    ClickAwayListenerProps {
    var ownerState: Any
}
