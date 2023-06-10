// Automatically generated - do not modify!

package mui.base

import web.events.Event

external interface SliderUnstyledProps :
    SliderUnstyledOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>

external interface SliderUnstyledOwnerState {
    var disabled: Boolean

    var focusedThumbIndex: Number

    var isRtl: Boolean

    var max: Number

    var min: Number

    var dragging: Boolean

    var marked: Boolean

    var orientation: mui.material.Orientation

    var scale: (value: Number) -> Number

    var step: Number?

    var track: mui.system.Union /* 'normal' | false | 'inverted' */

    var valueLabelFormat: String /* or (value: Number, index: Number) -> react.ReactNode*/
}

external interface SliderUnstyledOwnProps : react.Props {
    /**
     * The label of the slider.
     */
    // var `aria-label`: String?

    /**
     * The id of the element containing a label for the slider.
     */
    // var `aria-labelledby`: String?

    /**
     * A string value that provides a user-friendly name for the current value of the slider.
     */
    // var `aria-valuetext`: String?

    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: dynamic

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, the active thumb doesn't swap when moving pointer over a thumb while dragging another thumb.
     * @default false
     */
    var disableSwap: Boolean?

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
     * If `true` the Slider will be rendered right-to-left (with the lowest value on the right-hand side).
     * @default false
     */
    var isRtl: Boolean?

    /**
     * Marks indicate predetermined values to which the user can move the slider.
     * If `true` the marks are spaced according the value of the `step` prop.
     * If an array, it should contain objects with `value` and an optional `label` keys.
     * @default false
     */
    var marks: dynamic

    /**
     * The maximum allowed value of the slider.
     * Should not be equal to min.
     * @default 100
     */
    var max: Number?

    /**
     * The minimum allowed value of the slider.
     * Should not be equal to max.
     * @default 0
     */
    var min: Number?

    /**
     * Name attribute of the hidden `input` element.
     */
    var name: String?

    /**
     * Callback function that is fired when the slider's value changed.
     *
     * @param {Event} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (any).
     * **Warning**: This is a generic event not a change event.
     * @param {number | number[]} value The new value.
     * @param {number} activeThumb Index of the currently moved thumb.
     */
    var onChange: ((event: Event, value: dynamic, activeThumb: Number) -> Unit)?

    /**
     * Callback function that is fired when the `mouseup` is triggered.
     *
     * @param {React.SyntheticEvent | Event} event The event source of the callback. **Warning**: This is a generic event not a change event.
     * @param {number | number[]} value The new value.
     */
    var onChangeCommitted: ((event: react.dom.events.SyntheticEvent<*, *>, value: dynamic) -> Unit)?

    /**
     * The component orientation.
     * @default 'horizontal'
     */
    var orientation: mui.material.Orientation?

    /**
     * A transformation function, to change the scale of the slider.
     * @param {any} x
     * @returns {any}
     * @default function Identity(x) {
     *   return x;
     * }
     */
    var scale: ((value: Number) -> Number)?

    /**
     * The props used for each slot inside the Slider.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'span', SliderUnstyledRootSlotPropsOverrides, SliderUnstyledOwnerState> */
        var track: react.Props? /* SlotComponentProps<'span', SliderUnstyledTrackSlotPropsOverrides, SliderUnstyledOwnerState> */
        var rail: react.Props? /* SlotComponentProps<'span', SliderUnstyledRailSlotPropsOverrides, SliderUnstyledOwnerState> */
        var thumb: react.Props? /* SlotComponentProps<'span', SliderUnstyledThumbSlotPropsOverrides, SliderUnstyledOwnerState> */
        var mark: react.Props? /* SlotComponentProps<'span', SliderUnstyledMarkSlotPropsOverrides, SliderUnstyledOwnerState> */
        var markLabel: react.Props? /* SlotComponentProps<'span', SliderUnstyledMarkLabelSlotPropsOverrides, SliderUnstyledOwnerState> */
        var valueLabel: react.Props? /* SlotComponentProps<React.ElementType, SliderUnstyledValueLabelSlotPropsOverrides, SliderUnstyledOwnerState> */
        var input: react.Props? /* SlotComponentProps<'input', SliderUnstyledInputSlotPropsOverrides, SliderUnstyledOwnerState> */
    }

    /**
     * The components used for each slot inside the Slider.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: SliderUnstyledSlots?

    /**
     * The granularity with which the slider can step through values. (A "discrete" slider.)
     * The `min` prop serves as the origin for the valid values.
     * We recommend (max - min) to be evenly divisible by the step.
     *
     * When step is `null`, the thumb can only be slid onto marks provided with the `marks` prop.
     * @default 1
     */
    var step: Number?

    /**
     * Tab index attribute of the hidden `input` element.
     */
    var tabIndex: Int?

    /**
     * The track presentation:
     *
     * - `normal` the track will render a bar representing the slider value.
     * - `inverted` the track will render a bar representing the remaining slider value.
     * - `false` the track will render without a bar.
     * @default 'normal'
     */
    var track: mui.system.Union? /* 'normal' | false | 'inverted' */

    /**
     * The value of the slider.
     * For ranged sliders, provide an array with two values.
     */
    var value: dynamic

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
    var valueLabelFormat: String? /* or (value: Number, index: Number) -> react.ReactNode*/
}

external interface SliderUnstyledSlots {
    /**
     * The component that renders the root.
     * @default 'span'
     */
    var root: react.ElementType<*>?

    /**
     * The component that renders the track.
     * @default 'span'
     */
    var track: react.ElementType<*>?

    /**
     * The component that renders the rail.
     * @default 'span'
     */
    var rail: react.ElementType<*>?

    /**
     * The component that renders the thumb.
     * @default 'span'
     */
    var thumb: react.ElementType<*>?

    /**
     * The component that renders the mark.
     * @default 'span'
     */
    var mark: react.ElementType<*>?

    /**
     * The component that renders the mark label.
     * @default 'span'
     */
    var markLabel: react.ElementType<*>?

    /**
     * The component that renders the value label.
     */
    var valueLabel: react.ElementType<*>?

    /**
     * The component that renders the input.
     * @default 'input'
     */
    var input: react.ElementType<*>?
}
