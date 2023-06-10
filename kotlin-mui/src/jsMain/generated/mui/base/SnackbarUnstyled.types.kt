// Automatically generated - do not modify!

package mui.base

external interface SnackbarUnstyledProps :
    SnackbarUnstyledOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>

external interface SnackbarUnstyledOwnProps :
    UseSnackbarParameters,
    react.PropsWithChildren {
    override var children: react.ReactNode?

    /**
     * The components used for each slot inside the Snackbar.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: SnackbarUnstyledSlots?

    /**
     * The props used for each slot inside the Snackbar.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var clickAwayListener: react.Props? /* SlotComponentProps<typeof ClickAwayListener, SnackbarUnstyledClickAwayListenerSlotPropsOverrides, SnackbarUnstyledOwnerState> */
        var root: react.Props? /* SlotComponentProps<'div', SnackbarUnstyledRootSlotPropsOverrides, SnackbarUnstyledOwnerState> */
    }

    /**
     * The prop used to handle exited transition and unmount the component.
     * @default true
     */
    var exited: Boolean?
}

external interface SnackbarUnstyledSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: react.ElementType<*>?
}

external interface SnackbarUnstyledClickAwayListenerSlotProps : react.Props {
    var ownerState: Any
}
