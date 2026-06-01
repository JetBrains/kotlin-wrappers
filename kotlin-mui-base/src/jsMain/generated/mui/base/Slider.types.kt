// Automatically generated - do not modify!

package mui.base

import mui.system.Union
import react.ElementType
import react.Props
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface SliderProps :
    SliderOwnProps,
    HTMLAttributes<HTMLSpanElement>

external interface SliderRootSlotPropsOverrides

external interface SliderTrackSlotPropsOverrides

external interface SliderRailSlotPropsOverrides

external interface SliderThumbSlotPropsOverrides

external interface SliderMarkSlotPropsOverrides

external interface SliderMarkLabelSlotPropsOverrides

external interface SliderValueLabelSlotPropsOverrides

external interface SliderInputSlotPropsOverrides

external interface SliderThumbSlotState {
    var focused: Boolean

    var active: Boolean

    var index: Number
}

external interface SliderOwnProps :
    UseSliderParameters {
    /**
     * The label of the slider.
     */
    // var `aria-label`: String?

    /**
     * A string value that provides a user-friendly name for the current value of the slider.
     */
    // var `aria-valuetext`: String?

    /**
     * Accepts a function which returns a string value that provides a user-friendly name for the thumb labels of the slider.
     * This is important for screen reader users.
     * @param {number} index The thumb label's index to format.
     * @returns {string}
     */
    var getAriaLabel: ((index: Number) -> String)?

    /**
     * Accepts a function which returns a string value that provides a user-friendly name for the current value of the slider.
     * This is important for screen reader users.
     * @param {number} value The thumb label's value to format.
     * @param {number} index The thumb label's index to format.
     * @returns {string}
     */
    var getAriaValueText: ((value: Number, index: Number) -> String)?

    /**
     * The props used for each slot inside the Slider.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: Props? /* SlotComponentProps<'span', SliderRootSlotPropsOverrides, SliderOwnerState> */
        var track: Props? /* SlotComponentProps<'span', SliderTrackSlotPropsOverrides, SliderOwnerState> */
        var rail: Props? /* SlotComponentProps<'span', SliderRailSlotPropsOverrides, SliderOwnerState> */
        var thumb: Props? /* SlotComponentPropsWithSlotState<'span', SliderThumbSlotPropsOverrides, SliderOwnerState, SliderThumbSlotState> */
        var mark: Props? /* SlotComponentProps<'span', SliderMarkSlotPropsOverrides, SliderOwnerState> */
        var markLabel: Props? /* SlotComponentProps<'span', SliderMarkLabelSlotPropsOverrides, SliderOwnerState> */
        var valueLabel: Props? /* SlotComponentProps<React.ElementType, SliderValueLabelSlotPropsOverrides, SliderOwnerState> */
        var input: Props? /* SlotComponentProps<'input', SliderInputSlotPropsOverrides, SliderOwnerState> */
    }

    /**
     * The components used for each slot inside the Slider.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: SliderSlots?

    /**
     * The track presentation:
     *
     * - `normal` the track will render a bar representing the slider value.
     * - `inverted` the track will render a bar representing the remaining slider value.
     * - `false` the track will render without a bar.
     * @default 'normal'
     */
    var track: Union? /* 'normal' | false | 'inverted' */

    /**
     * The format function the value label's value.
     *
     * When a function is provided, it should have the following signature:
     *
     * - {number} value The value label's value to format
     * - {number} index The value label's index to format
     * @param {any} x
     * @returns {any}
     * @default function Identity(x) {
     *   return x;
     * }
     */
    var valueLabelFormat: String? /* or (value: Number, index: Number) -> ReactNode*/
}

external interface SliderSlots {
    /**
     * The component that renders the root.
     * @default 'span'
     */
    var root: ElementType<*>?

    /**
     * The component that renders the track.
     * @default 'span'
     */
    var track: ElementType<*>?

    /**
     * The component that renders the rail.
     * @default 'span'
     */
    var rail: ElementType<*>?

    /**
     * The component that renders the thumb.
     * @default 'span'
     */
    var thumb: ElementType<*>?

    /**
     * The component that renders the mark.
     * @default 'span'
     */
    var mark: ElementType<*>?

    /**
     * The component that renders the mark label.
     * @default 'span'
     */
    var markLabel: ElementType<*>?

    /**
     * The component that renders the value label.
     */
    var valueLabel: ElementType<*>?

    /**
     * The component that renders the input.
     * @default 'input'
     */
    var input: ElementType<*>?
}
