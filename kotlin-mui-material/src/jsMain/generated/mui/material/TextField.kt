// Automatically generated - do not modify!

@file:JsModule("@mui/material/TextField")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps
import web.html.InputType

typealias TextFieldProps = BaseTextFieldProps

external interface BaseTextFieldProps :
    mui.system.StandardProps,
    FormControlProps,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
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
    override var children: react.ReactNode?

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
     * Props applied to the [`FormHelperText`](/material-ui/api/form-helper-text/) element.
     */
    var FormHelperTextProps: FormHelperTextProps?

    /**
     * If `true`, the input will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean?

    /**
     * The helper text content.
     */
    var helperText: react.ReactNode?

    /**
     * The id of the `input` element.
     * Use this prop to make `label` and `helperText` accessible for screen readers.
     */
    var id: String?

    /**
     * Props applied to the [`InputLabel`](/material-ui/api/input-label/) element.
     * Pointer events like `onClick` are enabled if and only if `shrink` is `true`.
     */
    var InputLabelProps: InputLabelProps?

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
     */
    var inputProps: InputBaseComponentProps?

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: react.Ref<*>?

    /**
     * The label content.
     */
    var label: react.ReactNode?

    /**
     * If `true`, a `textarea` element is rendered instead of an input.
     * @default false
     */
    var multiline: Boolean?

    /**
     * Name attribute of the `input` element.
     */
    var name: String?

    var onBlur: react.dom.events.FocusEventHandler<web.html.HTMLElement>?

    var onFocus: react.dom.events.FocusEventHandler<web.html.HTMLElement>?

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
     * Render a [`Select`](/material-ui/api/select/) element while passing the Input element to `Select` as `input` parameter.
     * If this option is set you must pass the options of the select as children.
     * @default false
     */
    var select: Boolean?

    /**
     * Props applied to the [`Select`](/material-ui/api/select/) element.
     */
    var SelectProps: SelectProps<*>?

    /**
     * The size of the component.
     */
    var size: BaseSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Type of the `input` element. It should be [a valid HTML5 input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Form_%3Cinput%3E_types).
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
    var onChange: react.dom.events.ChangeEventHandler<web.html.HTMLElement>?

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: mui.system.Union? /* 'standard' */

    /**
     * Props applied to the Input element.
     * It will be a [`FilledInput`](/material-ui/api/filled-input/),
     * [`OutlinedInput`](/material-ui/api/outlined-input/) or [`Input`](/material-ui/api/input/)
     * component depending on the `variant` prop value.
     */
    var InputProps: InputProps?
}

external interface FilledTextFieldProps :
    BaseTextFieldProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: react.dom.events.ChangeEventHandler<web.html.HTMLElement>?

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: mui.system.Union /* 'filled' */

    /**
     * Props applied to the Input element.
     * It will be a [`FilledInput`](/material-ui/api/filled-input/),
     * [`OutlinedInput`](/material-ui/api/outlined-input/) or [`Input`](/material-ui/api/input/)
     * component depending on the `variant` prop value.
     */
    var InputProps: FilledInputProps?
}

external interface OutlinedTextFieldProps :
    BaseTextFieldProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: react.dom.events.ChangeEventHandler<web.html.HTMLElement>?

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: mui.system.Union /* 'outlined' */

    /**
     * Props applied to the Input element.
     * It will be a [`FilledInput`](/material-ui/api/filled-input/),
     * [`OutlinedInput`](/material-ui/api/outlined-input/) or [`Input`](/material-ui/api/input/)
     * component depending on the `variant` prop value.
     */
    var InputProps: OutlinedInputProps?
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
 * *   [FormControl](https://mui.com/material-ui/api/form-control/)
 * *   [InputLabel](https://mui.com/material-ui/api/input-label/)
 * *   [FilledInput](https://mui.com/material-ui/api/filled-input/)
 * *   [OutlinedInput](https://mui.com/material-ui/api/outlined-input/)
 * *   [Input](https://mui.com/material-ui/api/input/)
 * *   [FormHelperText](https://mui.com/material-ui/api/form-helper-text/)
 *
 * If you wish to alter the props applied to the `input` element, you can do so as follows:
 *
 * ```jsx
 * const inputProps = {
 *   step: 300,
 * };
 *
 * return <TextField id="time" type="time" inputProps={inputProps} />;
 * ```
 *
 * For advanced cases, please look at the source of TextField by clicking on the
 * "Edit this page" button above. Consider either:
 *
 * *   using the upper case props for passing values directly to the components
 * *   using the underlying components directly as shown in the demos
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
external val TextField: react.FC<TextFieldProps>
