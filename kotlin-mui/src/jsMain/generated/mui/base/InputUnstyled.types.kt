// Automatically generated - do not modify!

package mui.base

import web.cssom.ClassName
import web.html.InputType

external interface InputUnstyledProps :
    InputUnstyledOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLInputElement>

external interface InputUnstyledBaseProps : react.Props {
    /**
     * Maximum number of rows to display when multiline option is set to true.
     */
    var maxRows: Number?

    /**
     * Minimum number of rows to display when multiline option is set to true.
     */
    var minRows: Number?

    /**
     * If `true`, a `textarea` element is rendered.
     * @default false
     */
    var multiline: Boolean /* true */

    /**
     * Number of rows to display when multiline option is set to true.
     */
    var rows: Number?

    /**
     * Type of the `input` element. It should be [a valid HTML5 input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Form_%3Cinput%3E_types).
     * @default 'text'
     */
    var type: InputType?
}

external interface InputUnstyledOwnProps :
    react.PropsWithClassName,
    InputUnstyledBaseProps {
    // var `aria-describedby`: String?

    // var `aria-label`: String?

    // var `aria-labelledby`: String?

    /**
     * This prop helps users to fill forms faster, especially on mobile devices.
     * The name can be confusing, as it's more like an autofill.
     * You can learn more about it [following the specification](https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill).
     */
    var autoComplete: String?

    /**
     * If `true`, the `input` element is focused during the first mount.
     */
    var autoFocus: Boolean?

    /**
     * Class name applied to the root element.
     */
    override var className: ClassName?

    /**
     * Trailing adornment for this input.
     */
    var endAdornment: react.ReactNode?

    /**
     * If `true`, the `input` will indicate an error by setting the `aria-invalid` attribute on the input and the `Mui-error` class on the root element.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var error: Boolean?

    /**
     * The id of the `input` element.
     */
    var id: String?

    /**
     * Name attribute of the `input` element.
     */
    var name: String?

    var onKeyDown: react.dom.events.KeyboardEventHandler<web.html.HTMLInputElement>?

    var onKeyUp: react.dom.events.KeyboardEventHandler<web.html.HTMLInputElement>?

    /**
     * The short hint displayed in the `input` before the user enters a value.
     */
    var placeholder: String?

    /**
     * It prevents the user from changing the value of the field
     * (not from interacting with the field).
     */
    var readOnly: Boolean?

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'div', InputUnstyledRootSlotPropsOverrides, InputUnstyledOwnerState> */
        var input: react.Props? /* SlotComponentProps<'input', InputUnstyledInputSlotPropsOverrides, InputUnstyledOwnerState> */
    }

    /**
     * The components used for each slot inside the InputBase.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: InputUnstyledSlots?

    /**
     * Leading adornment for this input.
     */
    var startAdornment: react.ReactNode?

    /**
     * The value of the `input` element, required for a controlled component.
     */
    var value: Any?
}

external interface InputUnstyledSlots {
    /**
     * The component used to render the root.
     * @default 'div'
     */
    var root: react.ElementType<*>?

    /**
     * The component used to render the input.
     * @default 'input'
     */
    var input: react.ElementType<*>?

    /**
     * The component used to render the textarea.
     * @default 'textarea'
     */
    var textarea: react.ElementType<*>?
}
