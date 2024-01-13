// Automatically generated - do not modify!

@file:JsModule("@mui/material/Slider")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName
import web.events.Event

external interface SliderProps :
    SliderOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    mui.types.PropsWithComponent

external interface SliderOwnerState {
    var dragging: Boolean

    var marked: Boolean

    var focusedThumbIndex: Number
}

external interface SliderOwnProps :
    react.PropsWithClassName,
    mui.system.PropsWithSx {
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
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'primary'
     */
    var color: SliderColor?

    /**
     * The components used for each slot inside.
     *
     * This prop is an alias for the `slots` prop.
     * It's recommended to use the `slots` prop instead.
     *
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
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `slotProps` prop.
     * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
     *
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var track: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var rail: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var thumb: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var mark: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var markLabel: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var valueLabel: react.Props? /* SlotComponentProps<
  typeof SliderValueLabelComponent,
  SliderComponentsPropsOverrides,
  SliderOwnerState
> */
        var input: react.Props? /* SlotComponentProps<'input', SliderComponentsPropsOverrides, SliderOwnerState> */
    }

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SliderClasses?

    /**
     * @ignore
     */
    override var className: ClassName?

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
    var orientation: Orientation?

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
     * The size of the slider.
     * @default 'medium'
     */
    var size: BaseSize?

    /**
     * The props used for each slot inside the Slider.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var track: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var rail: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var thumb: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var mark: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var markLabel: react.Props? /* SlotComponentProps<'span', SliderComponentsPropsOverrides, SliderOwnerState> */
        var valueLabel: react.Props? /* SlotComponentProps<
  typeof SliderValueLabelComponent,
  SliderComponentsPropsOverrides,
  SliderOwnerState
> */
        var input: react.Props? /* SlotComponentProps<'input', SliderComponentsPropsOverrides, SliderOwnerState> */
    }

    /**
     * The components used for each slot inside the Slider.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: react.ElementType<*>?
        var track: react.ElementType<*>?
        var rail: react.ElementType<*>?
        var thumb: react.ElementType<*>?
        var mark: react.ElementType<*>?
        var markLabel: react.ElementType<*>?
        var valueLabel: react.ElementType<*>?
        var input: react.ElementType<*>?
    }

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
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

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
     * @param {any} x
     * @returns {any}
     * @default function Identity(x) {
     *   return x;
     * }
     */
    var valueLabelFormat: String? /* or (value: Number, index: Number) -> react.ReactNode*/
}

@Suppress("VIRTUAL_MEMBER_HIDDEN")
external interface SliderValueLabelProps :
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    react.PropsWithChildren {
    override var children: react.ReactNode? /* react.ReactElement<*>? */

    var index: Number

    var open: Boolean

    var value: Number
}

/**
 *
 * Demos:
 *
 * - [Slider](https://mui.com/material-ui/react-slider/)
 *
 * API:
 *
 * - [Slider API](https://mui.com/material-ui/api/slider/)
 */
@JsName("default")
external val Slider: react.FC<SliderProps>
