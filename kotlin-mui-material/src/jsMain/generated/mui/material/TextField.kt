// Automatically generated - do not modify!

@file:JsModule("@mui/material/TextField")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import mui.system.Union
import react.*
import react.dom.events.ChangeEventHandler
import react.dom.events.FocusEventHandler
import web.dom.ElementId
import web.html.HTMLElement
import web.html.InputType

typealias TextFieldProps = BaseTextFieldProps

external interface TextFieldSlots {
    /**
     * The component that renders the root.
     * @default FormControl
     */
    var root: ElementType<*>

    /**
     * The component that renders the input.
     * @default OutlinedInput
     */
    var input: ElementType<*>

    /**
     * The component that renders the input's label.
     * @default InputLabel
     */
    var inputLabel: ElementType<*>

    /**
     * The html input element.
     * @default 'input'
     */
    var htmlInput: ElementType<*>

    /**
     * The component that renders the helper text.
     * @default FormHelperText
     */
    var formHelperText: ElementType<*>

    /**
     * The component that renders the select.
     * @default Select
     */
    var select: ElementType<*>
}

external interface BaseTextFieldProps :
    StandardProps,
    FormControlProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * This prop helps users to fill forms faster, especially on mobile devices.
     * The name can be confusing, as it's more like an autofill.
     * You can learn more about it [following the specification](https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill).
     */
    var autoComplete: String?

    /**
     * If `true`, the `input` element is focused during the first mount.
     * @default false
     */
    var autoFocus: Boolean?

    /**
     * @ignore
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TextFieldClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'primary'
     */
    var color: TextFieldColor?

    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: Any?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, the label is displayed in an error state.
     * @default false
     */
    var error: Boolean?

    /**
     * If `true`, the input will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean?

    /**
     * The helper text content.
     */
    var helperText: ReactNode?

    /**
     * The id of the `input` element.
     * Use this prop to make `label` and `helperText` accessible for screen readers.
     */
    var id: ElementId?

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: Ref<*>?

    /**
     * The label content.
     */
    var label: ReactNode?

    /**
     * If `true`, a `textarea` element is rendered instead of an input.
     * @default false
     */
    var multiline: Boolean?

    /**
     * Name attribute of the `input` element.
     */
    var name: String?

    var onBlur: FocusEventHandler<HTMLElement>?

    var onFocus: FocusEventHandler<HTMLElement>?

    /**
     * The short hint displayed in the `input` before the user enters a value.
     */
    var placeholder: String?

    /**
     * If `true`, the label is displayed as required and the `input` element is required.
     * @default false
     */
    var required: Boolean?

    /**
     * Number of rows to display when multiline option is set to true.
     */
    var rows: Any? /* String or Number */

    /**
     * Maximum number of rows to display when multiline option is set to true.
     */
    var maxRows: Any? /* String or Number */

    /**
     * Minimum number of rows to display when multiline option is set to true.
     */
    var minRows: Any? /* String or Number */

    /**
     * Render a [`Select`](https://mui.com/material-ui/api/select/) element while passing the Input element to `Select` as `input` parameter.
     * If this option is set you must pass the options of the select as children.
     * @default false
     */
    var select: Boolean?

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: BaseSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Type of the `input` element. It should be [a valid HTML5 input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Reference/Elements/input#input_types).
     */
    var type: InputType?

    /**
     * The value of the `input` element, required for a controlled component.
     */
    var value: Any?
}

external interface StandardTextFieldProps :
    BaseTextFieldProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: ChangeEventHandler<HTMLElement, *>?

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: Union? /* 'standard' */
}

external interface FilledTextFieldProps :
    BaseTextFieldProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: ChangeEventHandler<HTMLElement, *>?

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: Union /* 'filled' */
}

external interface OutlinedTextFieldProps :
    BaseTextFieldProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: ChangeEventHandler<HTMLElement, *>?

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: Union /* 'outlined' */
}

/**
 * The `TextField` is a convenience wrapper for the most common cases (80%).
 * It cannot be all things to all people, otherwise the API would grow out of control.
 *
 * ## Advanced Configuration
 *
 * It's important to understand that the text field is a simple abstraction
 * on top of the following components:
 *
 * * [FormControl](https://mui.com/material-ui/api/form-control/)
 * * [InputLabel](https://mui.com/material-ui/api/input-label/)
 * * [FilledInput](https://mui.com/material-ui/api/filled-input/)
 * * [OutlinedInput](https://mui.com/material-ui/api/outlined-input/)
 * * [Input](https://mui.com/material-ui/api/input/)
 * * [FormHelperText](https://mui.com/material-ui/api/form-helper-text/)
 *
 * If you wish to alter the props applied to the `input` element, you can do so as follows:
 *
 * ```jsx
 * const slotProps = {
 *   htmlInput: {
 *      step: 300
 *   }
 * };
 *
 * return <TextField id="time" type="time" slotProps={slotProps} />;
 * ```
 *
 * For advanced cases, please look at the source of TextField by clicking on the
 * "Edit this page" button above. Consider either:
 *
 * * using the `slotProps` prop for passing values directly to the components
 * * using the underlying components directly as shown in the demos
 *
 * Demos:
 *
 * - [Autocomplete](https://mui.com/material-ui/react-autocomplete/)
 * - [Text Field](https://mui.com/material-ui/react-text-field/)
 *
 * API:
 *
 * - [TextField API](https://mui.com/material-ui/api/text-field/)
 * - inherits [FormControl API](https://mui.com/material-ui/api/form-control/)
 */
@JsName("default")
external val TextField: FC<TextFieldProps>
