// Automatically generated - do not modify!

@file:JsModule("@mui/material/Slider")

package mui.material

import js.array.ReadonlyArray
import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.system.Union
import mui.types.PropsWithComponent
import react.*
import react.dom.events.SyntheticEvent
import react.dom.html.HTMLAttributes
import react.dom.html.InputHTMLAttributes
import web.cssom.ClassName
import web.dom.ElementId
import web.events.Event
import web.html.HTMLInputElement
import web.html.HTMLSpanElement

external interface SliderProps :
    SliderOwnProps,
    SliderSlotsAndSlotProps,
    HTMLAttributes<HTMLSpanElement>,
    PropsWithComponent

external interface SliderSlots {
    /**
     * The component that renders the root.
     * @default 'span'
     */
    var root: ElementType<*>

    /**
     * The component that renders the track.
     * @default 'span'
     */
    var track: ElementType<*>

    /**
     * The component that renders the rail.
     * @default 'span'
     */
    var rail: ElementType<*>

    /**
     * The component that renders the thumb.
     * @default 'span'
     */
    var thumb: ElementType<*>

    /**
     * The component that renders the mark.
     * @default 'span'
     */
    var mark: ElementType<*>

    /**
     * The component that renders the mark label.
     * @default 'span'
     */
    var markLabel: ElementType<*>

    /**
     * The component that renders the value label.
     * @default SliderValueLabel
     */
    var valueLabel: ElementType<*>

    /**
     * The component that renders the input.
     * @default 'input'
     */
    var input: ElementType<*>
}

external interface SliderSlotProps : Props {
    /** TS: SlotProps<'span', SliderRootSlotPropsOverrides, SliderOwnerState> */
    var root: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<'span', SliderTrackSlotPropsOverrides, SliderOwnerState> */
    var track: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<'span', SliderRailSlotPropsOverrides, SliderOwnerState> */
    var rail: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<'span', SliderThumbSlotPropsOverrides, SliderOwnerState> */
    var thumb: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<'span', SliderMarkSlotPropsOverrides, SliderOwnerState> */
    var mark: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<'span', SliderMarkLabelSlotPropsOverrides, SliderOwnerState> */
    var markLabel: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotComponentProps<'span', SliderValueLabelSlotPropsOverrides, SliderOwnerState> */
    var valueLabel: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<'input', SliderInputSlotPropsOverrides, SliderOwnerState> */
    var input: InputHTMLAttributes<HTMLInputElement>?
}

external interface SliderSlotsAndSlotProps : Props {
    var slots: SliderSlots?

    var slotProps: SliderSlotProps?
}

external interface SliderOwnerState : SliderProps {
    var dragging: Boolean

    var marked: Boolean

    var focusedThumbIndex: Int
}

external interface SliderOwnProps :
    PropsWithClassName,
    PropsWithSx {
    /**
     * The label of the slider.
     */
    @JsName("aria-label")
    var ariaLabel: String?

    /**
     * The id of the element containing a label for the slider.
     */
    @JsName("aria-labelledby")
    var ariaLabelledBy: ElementId?

    /**
     * A string value that provides a user-friendly name for the current value of the slider.
     */
    @JsName("aria-valuetext")
    var ariaValueText: String?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'primary'
     */
    var color: SliderColor?

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
    var defaultValue: Any? /* number | number[] */

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
    var marks: Any? /* boolean | readonly Mark[] */

    /**
     * The maximum allowed value of the slider.
     * Should not be equal to min.
     * @default 100
     */
    var max: Double?

    /**
     * The minimum allowed value of the slider.
     * Should not be equal to max.
     * @default 0
     */
    var min: Double?

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
     * @param {Value} value The new value.
     * @param {number} activeThumb Index of the currently moved thumb.
     */
    var onChange: ((event: Event, value: ReadonlyArray<Number>, activeThumb: Number) -> Unit)?

    /**
     * Callback function that is fired when the pointer or touch interaction ends.
     *
     * @param {React.SyntheticEvent | Event} event The event source of the callback. **Warning**: This is a generic event not a change event.
     * @param {Value} value The new value.
     */
    var onChangeCommitted: ((event: SyntheticEvent<*, *>, value: ReadonlyArray<Number>) -> Unit)?

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
     * The granularity with which the slider can step through values when using Page Up/Page Down or Shift + Arrow Up/Arrow Down.
     * @default 10
     */
    var shiftStep: Number?

    /**
     * The size of the slider.
     * @default 'medium'
     */
    var size: BaseSize?

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
    var track: Union? /* 'normal' | false | 'inverted' */

    /**
     * The value of the slider.
     * For ranged sliders, provide an array with two values.
     */
    var value: Any? /* number | number[] */

    /**
     * Controls when the value label is displayed:
     *
     * - `auto` the value label will display when the thumb is hovered or focused.
     * - `on` will display persistently.
     * - `off` will never display.
     * @default 'off'
     */
    var valueLabelDisplay: Union? /* 'on' | 'auto' | 'off' */

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

@Suppress("VIRTUAL_MEMBER_HIDDEN")
external interface SliderValueLabelProps :
    HTMLAttributes<HTMLSpanElement>,
    PropsWithChildren {
    override var children: ReactNode? /* ReactElement<*>? */

    var index: Number

    var open: Boolean

    var value: ReactNode
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
external val Slider: FC<SliderProps>
