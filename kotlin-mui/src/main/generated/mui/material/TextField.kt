// Automatically generated - do not modify!

@file:JsModule("@mui/material/TextField")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import kotlinext.js.ReadonlyArray

external interface TextFieldProps : react.Props

external interface BaseTextFieldProps :
    mui.system.StandardProps,
    FormControlProps,
    react.PropsWithChildren {
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
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TextFieldClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: mui.system.Union? /* 'primary' | 'secondary' | 'error' | 'info' | 'success' | 'warning', TextFieldPropsColorOverrides */

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
     * If `true`, the label is displayed in an error state.
     * @default false
     */
    var error: Boolean?

    /**
     * Props applied to the [`FormHelperText`](/api/form-helper-text/) element.
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
     * Props applied to the [`InputLabel`](/api/input-label/) element.
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

    var onBlur: react.dom.events.FocusEventHandler<org.w3c.dom.HTMLElement>?

    var onFocus: dynamic /* StandardInputProps['onFocus'] */

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
    var rows: dynamic

    /**
     * Maximum number of rows to display when multiline option is set to true.
     */
    var maxRows: Int?

    /**
     * Minimum number of rows to display when multiline option is set to true.
     */
    var minRows: Int?

    /**
     * Render a [`Select`](/api/select/) element while passing the Input element to `Select` as `input` parameter.
     * If this option is set you must pass the options of the select as children.
     * @default false
     */
    var select: Boolean?

    /**
     * Props applied to the [`Select`](/api/select/) element.
     */
    var SelectProps: SelectProps<*>?

    /**
     * The size of the component.
     */
    var size: mui.system.Union? /* 'small' | 'medium', TextFieldPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * Type of the `input` element. It should be [a valid HTML5 input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Form_%3Cinput%3E_types).
     */
    var type: react.dom.html.InputType?

    /**
     * The value of the `input` element, required for a controlled component.
     */
    var value: dynamic
}

external interface StandardTextFieldProps :
    BaseTextFieldProps,
    TextFieldProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: dynamic /* StandardInputProps['onChange'] */

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: mui.system.Union? /* 'standard' */

    /**
     * Props applied to the Input element.
     * It will be a [`FilledInput`](/api/filled-input/),
     * [`OutlinedInput`](/api/outlined-input/) or [`Input`](/api/input/)
     * component depending on the `variant` prop value.
     */
    var InputProps: InputProps?
}

external interface FilledTextFieldProps :
    BaseTextFieldProps,
    TextFieldProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: react.dom.events.ChangeEventHandler<org.w3c.dom.HTMLElement>?

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: mui.system.Union /* 'filled' */

    /**
     * Props applied to the Input element.
     * It will be a [`FilledInput`](/api/filled-input/),
     * [`OutlinedInput`](/api/outlined-input/) or [`Input`](/api/input/)
     * component depending on the `variant` prop value.
     */
    var InputProps: FilledInputProps?
}

external interface OutlinedTextFieldProps :
    BaseTextFieldProps,
    TextFieldProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: react.dom.events.ChangeEventHandler<org.w3c.dom.HTMLElement>?

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: mui.system.Union /* 'outlined' */

    /**
     * Props applied to the Input element.
     * It will be a [`FilledInput`](/api/filled-input/),
     * [`OutlinedInput`](/api/outlined-input/) or [`Input`](/api/input/)
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
 * *   [FormControl](https://mui.com/api/form-control/)
 * *   [InputLabel](https://mui.com/api/input-label/)
 * *   [FilledInput](https://mui.com/api/filled-input/)
 * *   [OutlinedInput](https://mui.com/api/outlined-input/)
 * *   [Input](https://mui.com/api/input/)
 * *   [FormHelperText](https://mui.com/api/form-helper-text/)
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
 * - [Autocomplete](https://mui.com/components/autocomplete/)
 * - [Pickers](https://mui.com/components/pickers/)
 * - [Text Fields](https://mui.com/components/text-fields/)
 *
 * API:
 *
 * - [TextField API](https://mui.com/api/text-field/)
 * - inherits [FormControl API](https://mui.com/api/form-control/)
 */
@JsName("default")
external val TextField: react.FC<TextFieldProps>
