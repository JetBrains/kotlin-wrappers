// Automatically generated - do not modify!

package mui.base

import react.ElementType
import react.Props
import react.PropsWithClassName
import react.dom.html.HTMLAttributes
import web.cssom.ClassName
import web.html.HTMLSpanElement

external interface SwitchProps :
    SwitchOwnProps,
    HTMLAttributes<HTMLSpanElement>

external interface SwitchRootSlotPropsOverrides

external interface SwitchThumbSlotPropsOverrides

external interface SwitchInputSlotPropsOverrides

external interface SwitchTrackSlotPropsOverrides

external interface SwitchOwnProps :
    PropsWithClassName {
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
        var root: Props? /* SlotComponentProps<'span', SwitchRootSlotPropsOverrides, SwitchOwnerState> */
        var thumb: Props? /* SlotComponentProps<'span', SwitchThumbSlotPropsOverrides, SwitchOwnerState> */
        var input: Props? /* SlotComponentProps<'input', SwitchInputSlotPropsOverrides, SwitchOwnerState> */
        var track: Props? /* SlotComponentProps<'span', SwitchTrackSlotPropsOverrides, SwitchOwnerState> */
    }
}

external interface SwitchSlots {
    /**
     * The component that renders the root.
     * @default 'span'
     */
    var root: ElementType<*>?

    /**
     * The component that renders the input.
     * @default 'input'
     */
    var input: ElementType<*>?

    /**
     * The component that renders the thumb.
     * @default 'span'
     */
    var thumb: ElementType<*>?

    /**
     * The component that renders the track.
     * @default 'span'
     */
    var track: ElementType<*>?
}
