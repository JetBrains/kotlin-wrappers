// Automatically generated - do not modify!

@file:JsModule("@mui/material/FormControl")
@file:JsNonModule

package mui.material

external interface FormControlProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FormControlClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: mui.system.Union? /* 'primary' | 'secondary' | 'error' | 'info' | 'success' | 'warning', FormControlPropsColorOverrides */

    /**
     * If `true`, the label, input and helper text should be displayed in a disabled state.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, the label is displayed in an error state.
     * @default false
     */
    var error: Boolean?

    /**
     * If `true`, the component will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean?

    /**
     * If `true`, the component is displayed in focused state.
     */
    var focused: Boolean?

    /**
     * If `true`, the label is hidden.
     * This is used to increase density for a `FilledInput`.
     * Be sure to add `aria-label` to the `input` element.
     * @default false
     */
    var hiddenLabel: Boolean?

    /**
     * If `dense` or `normal`, will adjust vertical spacing of this and contained components.
     * @default 'none'
     */
    var margin: mui.system.Union? /* 'dense' | 'normal' | 'none' */

    /**
     * If `true`, the label will indicate that the `input` is required.
     * @default false
     */
    var required: Boolean?

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: mui.system.Union? /* 'small' | 'medium', FormControlPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: mui.system.Union? /* 'standard' | 'outlined' | 'filled' */
}

/**
 * Provides context such as filled/focused/error/required for form inputs.
 * Relying on the context provides high flexibility and ensures that the state always stays
 * consistent across the children of the `FormControl`.
 * This context is used by the following components:
 *
 * *   FormLabel
 * *   FormHelperText
 * *   Input
 * *   InputLabel
 *
 * You can find one composition example below and more going to [the demos](https://mui.com/components/text-fields/#components).
 *
 * ```jsx
 * <FormControl>
 *   <InputLabel htmlFor="my-input">Email address</InputLabel>
 *   <Input id="my-input" aria-describedby="my-helper-text" />
 *   <FormHelperText id="my-helper-text">We'll never share your email.</FormHelperText>
 * </FormControl>
 * ```
 *
 * ⚠️ Only one `InputBase` can be used within a FormControl because it create visual inconsistencies.
 * For instance, only one input can be focused at the same time, the state shouldn't be shared.
 *
 * Demos:
 *
 * - [Checkboxes](https://mui.com/components/checkboxes/)
 * - [Radio Buttons](https://mui.com/components/radio-buttons/)
 * - [Switches](https://mui.com/components/switches/)
 * - [Text Fields](https://mui.com/components/text-fields/)
 *
 * API:
 *
 * - [FormControl API](https://mui.com/api/form-control/)
 */
@JsName("default")
external val FormControl: react.FC<FormControlProps>
