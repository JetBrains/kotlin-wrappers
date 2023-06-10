// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface SwitchUnstyledProps :
    SwitchUnstyledOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>

external interface SwitchUnstyledOwnProps : react.PropsWithClassName {
    /**
     * Class name applied to the root element.
     */
    override var className: ClassName?

    /**
     * The components used for each slot inside the Switch.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: SwitchUnstyledSlots?

    /**
     * The props used for each slot inside the Switch.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'span', SwitchUnstyledRootSlotPropsOverrides, SwitchUnstyledOwnerState> */
        var thumb: react.Props? /* SlotComponentProps<'span', SwitchUnstyledThumbSlotPropsOverrides, SwitchUnstyledOwnerState> */
        var input: react.Props? /* SlotComponentProps<'input', SwitchUnstyledInputSlotPropsOverrides, SwitchUnstyledOwnerState> */
        var track: react.Props? /* SlotComponentProps<'span', SwitchUnstyledTrackSlotPropsOverrides, SwitchUnstyledOwnerState> */
    }
}

external interface SwitchUnstyledSlots {
    /**
     * The component that renders the root.
     * @default 'span'
     */
    var root: react.ElementType<*>?

    /**
     * The component that renders the input.
     * @default 'input'
     */
    var input: react.ElementType<*>?

    /**
     * The component that renders the thumb.
     * @default 'span'
     */
    var thumb: react.ElementType<*>?

    /**
     * The component that renders the track.
     * @default 'span'
     */
    var track: react.ElementType<*>?
}
