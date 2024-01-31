// Automatically generated - do not modify!

@file:JsModule("@mui/material/InputBase")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface InputBaseProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.system.PropsWithSx {
    // var `aria-describedby`: String?

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
     * Override or extend the styles applied to the component.
     */
    var classes: InputBaseClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * The prop defaults to the value (`'primary'`) inherited from the parent FormControl component.
     */
    var color: InputBaseColor?

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
        var root: react.Props? /* React.HTMLAttributes<HTMLDivElement> & InputBaseComponentsPropsOverrides */
        var input: react.Props? /* React.InputHTMLAttributes<HTMLInputElement> & InputBaseComponentsPropsOverrides */
    }

    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: Any?

    /**
     * If `true`, the component is disabled.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var disabled: Boolean?

    /**
     * If `true`, GlobalStyles for the auto-fill keyframes will not be injected/removed on mount/unmount. Make sure to inject them at the top of your application.
     * This option is intended to help with boosting the initial rendering performance if you are loading a big amount of Input components at once.
     * @default false
     */
    var disableInjectingGlobalStyles: Boolean?

    /**
     * End `InputAdornment` for this component.
     */
    var endAdornment: react.ReactNode?

    /**
     * If `true`, the `input` will indicate an error.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var error: Boolean?

    /**
     * If `true`, the `input` will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean?

    /**
     * The id of the `input` element.
     */
    var id: String?

    /**
     * The component used for the `input` element.
     * Either a string to use a HTML element or a component.
     * @default 'input'
     */
    var inputComponent: react.ElementType<InputBaseComponentProps>?

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
     * @default {}
     */
    var inputProps: InputBaseComponentProps?

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: react.Ref<*>?

    /**
     * If `dense`, will adjust vertical spacing. This is normally obtained via context from
     * FormControl.
     * The prop defaults to the value (`'none'`) inherited from the parent FormControl component.
     */
    var margin: InputBaseMargin?

    /**
     * If `true`, a [TextareaAutosize](/material-ui/react-textarea-autosize/) element is rendered.
     * @default false
     */
    var multiline: Boolean?

    /**
     * Name attribute of the `input` element.
     */
    var name: String?

    /**
     * Callback fired when the `input` is blurred.
     *
     * Notice that the first argument (event) might be undefined.
     */
    var onBlur: react.dom.events.FocusEventHandler<web.html.HTMLElement>?

    /**
     * Callback fired when the value is changed.
     *
     * @param {React.ChangeEvent<HTMLTextAreaElement | HTMLInputElement>} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: react.dom.events.ChangeEventHandler<web.html.HTMLElement>?

    var onFocus: react.dom.events.FocusEventHandler<web.html.HTMLElement>?

    var onKeyDown: react.dom.events.KeyboardEventHandler<web.html.HTMLElement>?

    var onKeyUp: react.dom.events.KeyboardEventHandler<web.html.HTMLElement>?

    /**
     * Callback fired when the `input` doesn't satisfy its constraints.
     */
    var onInvalid: react.dom.events.FormEventHandler<web.html.HTMLElement>?

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
     * If `true`, the `input` element is required.
     * The prop defaults to the value (`false`) inherited from the parent FormControl component.
     */
    var required: Boolean?

    var renderSuffix: dynamic

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
     * The size of the component.
     */
    var size: BaseSize?

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `componentsProps` prop, which will be deprecated in the future.
     *
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* React.HTMLAttributes<HTMLDivElement> &
  InputBaseComponentsPropsOverrides & { sx */
        var input: react.Props? /* React.InputHTMLAttributes<HTMLInputElement> &
  InputBaseComponentsPropsOverrides & { sx */
    }

    /**
     * The components used for each slot inside.
     *
     * This prop is an alias for the `components` prop, which will be deprecated in the future.
     *
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: react.ElementType<*>?
        var input: react.ElementType<*>?
    }

    /**
     * Start `InputAdornment` for this component.
     */
    var startAdornment: react.ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * Type of the `input` element. It should be [a valid HTML5 input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Form_%3Cinput%3E_types).
     * @default 'text'
     */
    var type: String?

    /**
     * The value of the `input` element, required for a controlled component.
     */
    var value: Any?
}

external interface InputBaseComponentProps :
    react.dom.html.HTMLAttributes<web.html.HTMLElement>

/**
 * `InputBase` contains as few styles as possible.
 * It aims to be a simple building block for creating an input.
 * It contains a load of style reset and some state logic.
 *
 * Demos:
 *
 * - [Text Field](https://mui.com/material-ui/react-text-field/)
 *
 * API:
 *
 * - [InputBase API](https://mui.com/material-ui/api/input-base/)
 */
@JsName("default")
external val InputBase: react.FC<InputBaseProps>
