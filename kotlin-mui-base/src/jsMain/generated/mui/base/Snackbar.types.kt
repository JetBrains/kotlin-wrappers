// Automatically generated - do not modify!

package mui.base

external interface SnackbarProps :
    SnackbarOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface SnackbarOwnProps :
    UseSnackbarParameters,
    react.PropsWithChildren {
    override var children: react.ReactNode?

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
        var clickAwayListener: react.Props? /* SlotComponentProps<typeof ClickAwayListener, SnackbarClickAwayListenerSlotPropsOverrides, SnackbarOwnerState> */
        var root: react.Props? /* SlotComponentProps<'div', SnackbarRootSlotPropsOverrides, SnackbarOwnerState> */
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
    var root: react.ElementType<*>?
}

external interface SnackbarClickAwayListenerSlotProps : react.Props {
    var ownerState: Any
}
