// Automatically generated - do not modify!

package mui.base

import csstype.ClassName

external interface InputUnstyledProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>

external interface InputOwnerState : InputUnstyledProps {
    var formControl: dynamic

    var focused: Boolean
}

external interface UseInputProps : react.Props {
    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: dynamic

    /**
     * If `true`, the component is disabled.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var disabled: Boolean?

    /**
     * If `true`, the `input` will indicate an error.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var error: Boolean?

    var onBlur: react.dom.events.FocusEventHandler<*>?

    var onClick: react.dom.events.MouseEventHandler<*>?

    var onChange: react.dom.events.ChangeEventHandler<org.w3c.dom.HTMLInputElement>?

    var onFocus: react.dom.events.FocusEventHandler<*>?

    /**
     * If `true`, the `input` element is required.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var required: Boolean?

    var value: dynamic
}

external interface InputUnstyledOwnProps :
    UseInputProps,
    react.PropsWithClassName {
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
     * The components used for each slot inside the InputBase.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
        var Input: react.ElementType<*>?
        var Textarea: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* React.ComponentPropsWithRef<'div'> & {
    ownerState: InputOwnerState
} */
        var input: react.Props? /* React.ComponentPropsWithRef<'input'> & {
    ownerState: InputOwnerState
} */
    }

    /**
     * Trailing adornment for this input.
     */
    var endAdornment: react.ReactNode?

    /**
     * The id of the `input` element.
     */
    var id: String?

    /**
     * If `true`, a `textarea` element is rendered.
     * @default false
     */
    var multiline: Boolean?

    /**
     * Name attribute of the `input` element.
     */
    var name: String?

    var onKeyDown: react.dom.events.KeyboardEventHandler<org.w3c.dom.HTMLInputElement>?

    var onKeyUp: react.dom.events.KeyboardEventHandler<org.w3c.dom.HTMLInputElement>?

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
     * Number of rows to display when multiline option is set to true.
     */
    var rows: Number?

    /**
     * Leading adornment for this input.
     */
    var startAdornment: react.ReactNode?

    /**
     * Minimum number of rows to display when multiline option is set to true.
     */
    var minRows: Number?

    /**
     * Maximum number of rows to display when multiline option is set to true.
     */
    var maxRows: Number?

    /**
     * Type of the `input` element. It should be [a valid HTML5 input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Form_%3Cinput%3E_types).
     * @default 'text'
     */
    var type: String?

    /**
     * The value of the `input` element, required for a controlled component.
     */
    override var value: dynamic
}
