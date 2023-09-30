// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName

external interface SwitchProps :
    SwitchOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>

external interface SwitchOwnProps : react.PropsWithClassName {
    /**
     * Class name applied to the root element.
     */
    override var className: ClassName?

    /**
     * The components used for each slot inside the Switch.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: SwitchSlots?

    /**
     * The props used for each slot inside the Switch.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'span', SwitchRootSlotPropsOverrides, SwitchOwnerState> */
        var thumb: react.Props? /* SlotComponentProps<'span', SwitchThumbSlotPropsOverrides, SwitchOwnerState> */
        var input: react.Props? /* SlotComponentProps<'input', SwitchInputSlotPropsOverrides, SwitchOwnerState> */
        var track: react.Props? /* SlotComponentProps<'span', SwitchTrackSlotPropsOverrides, SwitchOwnerState> */
    }
}

external interface SwitchSlots {
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
