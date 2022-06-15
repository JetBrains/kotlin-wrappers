// Automatically generated - do not modify!

package mui.base

external interface SliderUnstyledProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement> {
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
     * Override or extend the styles applied to the component.
     */
    var classes: SliderUnstyledClasses?

    /**
     * The components used for each slot inside the Slider.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
        var Track: react.ElementType<*>?
        var Rail: react.ElementType<*>?
        var Thumb: react.ElementType<*>?
        var Mark: react.ElementType<*>?
        var MarkLabel: react.ElementType<*>?
        var ValueLabel: react.ElementType<*>?
        var Input: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the Slider.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* React.ComponentPropsWithRef<'span'> & SliderUnstyledComponentsPropsOverrides */
        var track: react.Props? /* React.ComponentPropsWithRef<'span'> & SliderUnstyledComponentsPropsOverrides */
        var rail: react.Props? /* React.ComponentPropsWithRef<'span'> & SliderUnstyledComponentsPropsOverrides */
        var thumb: react.Props? /* React.ComponentPropsWithRef<'span'> & SliderUnstyledComponentsPropsOverrides */
        var mark: react.Props? /* React.ComponentPropsWithRef<'span'> & SliderUnstyledComponentsPropsOverrides */
        var markLabel: react.Props? /* React.ComponentPropsWithRef<'span'> & SliderUnstyledComponentsPropsOverrides */
        var valueLabel: react.Props? /* Partial<React.ComponentPropsWithRef<typeof SliderValueLabelUnstyled>> & SliderUnstyledComponentsPropsOverrides */
        var input: react.Props? /* React.ComponentPropsWithRef<'input'> & SliderUnstyledComponentsPropsOverrides */
    }

    /**
     * The default value. Use when the component is not controlled.
     */
    override var defaultValue: dynamic

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
     * Indicates whether the theme context has rtl direction. It is set automatically.
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
    var onChange: ((event: org.w3c.dom.events.Event, value: dynamic, activeThumb: Number) -> Unit)?

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
     * @default (x) => x
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
    override var tabIndex: Int?

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
     * Controls when the value label is displayed:
     *
     * - `auto` the value label will display when the thumb is hovered or focused.
     * - `on` will display persistently.
     * - `off` will never display.
     * @default 'off'
     */
    var valueLabelDisplay: mui.system.Union? /* 'on' | 'auto' | 'off' */

    /**
     * The format function the value label's value.
     *
     * When a function is provided, it should have the following signature:
     *
     * - {number} value The value label's value to format
     * - {number} index The value label's index to format
     * @default (x) => x
     */
    var valueLabelFormat: dynamic
}

@Suppress("VIRTUAL_MEMBER_HIDDEN")
external interface SliderValueLabelProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement> {
    var children: react.ReactElement<*>

    var index: Number

    var open: Boolean

    var value: Number
}
