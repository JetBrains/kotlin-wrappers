// Automatically generated - do not modify!

package mui.base

import web.events.Event

external interface UseSliderParameters {
    /**
     * The id of the element containing a label for the slider.
     */
    // var `aria-labelledby`: String?

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
     * The ref attached to the root of the Slider.
     */
    var rootRef: react.Ref<web.dom.Element>?

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
     * The value of the slider.
     * For ranged sliders, provide an array with two values.
     */
    var value: dynamic
}

external interface Mark {
    var value: Number

    var label: react.ReactNode?
}

external interface UseSliderReturnValue {
    /**
     * The active index of the slider.
     */
    var active: Number

    /**
     * The orientation of the slider.
     */
    var axis: dynamic

    /**
     * Returns the `offset` and `leap` methods to calculate the positioning styles based on the slider axis.
     */
    var axisProps: react.Props /* { [key in Axis]: AxisProps<key>; } */

    /**
     * If `true`, the slider is being dragged.
     */
    var dragging: Boolean

    /**
     * The index of the thumb which is focused on the slider.
     */
    var focusedThumbIndex: Number

    /**
     * Resolver for the hidden input slot's props.
     * @param otherHandlers props for the hidden input slot
     * @returns props that should be spread on the hidden input slot
     */
    var getHiddenInputProps: react.Props /* <TOther extends EventHandlers = {}>(otherHandlers?: TOther) => UseSliderHiddenInputProps<TOther> */

    /**
     * Resolver for the root slot's props.
     * @param otherHandlers props for the root slot
     * @returns props that should be spread on the root slot
     */
    var getRootProps: react.Props /* <TOther extends EventHandlers = {}>(otherHandlers?: TOther) => UseSliderRootSlotProps<TOther> */

    /**
     * Resolver for the thumb slot's props.
     * @param otherHandlers props for the thumb slot
     * @returns props that should be spread on the thumb slot
     */
    var getThumbProps: react.Props /* <TOther extends EventHandlers = {}>(otherHandlers?: TOther) => UseSliderThumbSlotProps<TOther> */

    /**
     * The marks of the slider. Marks indicate predetermined values to which the user can move the slider.
     */
    var marks: dynamic

    /**
     * The thumb index for the current value when in hover state.
     */
    var open: Number

    /**
     * If `true`, the slider is a range slider when the `value` prop passed is an array.
     */
    var range: Boolean

    /**
     * Ref to the root slot's DOM node.
     */
    var rootRef: react.RefCallback<web.dom.Element>?

    /**
     * The track leap for the current value of the slider.
     */
    var trackLeap: Number

    /**
     * The track offset for the current value of the slider.
     */
    var trackOffset: Number

    /**
     * The possible values of the slider.
     */
    var values: dynamic
}
