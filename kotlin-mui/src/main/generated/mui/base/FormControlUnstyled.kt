// Automatically generated - do not modify!

@file:JsModule("@mui/base/FormControlUnstyled")
@file:JsNonModule

package mui.base

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
 * ⚠️ Only one `Input` can be used within a FormControl because it create visual inconsistencies.
 * For instance, only one input can be focused at the same time, the state shouldn't be shared.
 *
 * Demos:
 *
 * - [Form Control](https://mui.com/base/react-form-control/)
 *
 * API:
 *
 * - [FormControlUnstyled API](https://mui.com/base/api/form-control-unstyled/)
 */
@JsName("default")
external val FormControlUnstyled: react.FC<FormControlUnstyledProps>
