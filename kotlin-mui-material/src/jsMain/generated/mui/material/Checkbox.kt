// Automatically generated - do not modify!

@file:JsModule("@mui/material/Checkbox")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface CheckboxProps :
    mui.system.StandardProps,
    SwitchBaseProps,
    mui.system.PropsWithSx {
    /**
     * If `true`, the component is checked.
     */
    var checked: Boolean?

    /**
     * The icon to display when the component is checked.
     * @default <CheckBoxIcon />
     */
    var checkedIcon: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CheckboxClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'primary'
     */
    var color: CheckboxColor?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, the ripple effect is disabled.
     * @default false
     */
    var disableRipple: Boolean?

    /**
     * The icon to display when the component is unchecked.
     * @default <CheckBoxOutlineBlankIcon />
     */
    var icon: react.ReactNode?

    /**
     * The id of the `input` element.
     */
    var id: String?

    /**
     * If `true`, the component appears indeterminate.
     * This does not set the native input element to indeterminate due
     * to inconsistent behavior across browsers.
     * However, we set a `data-indeterminate` attribute on the `input`.
     * @default false
     */
    var indeterminate: Boolean?

    /**
     * The icon to display when the component is indeterminate.
     * @default <IndeterminateCheckBoxIcon />
     */
    var indeterminateIcon: react.ReactNode?

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
     */
    var inputProps: react.dom.html.InputHTMLAttributes<web.html.HTMLInputElement>?

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: react.Ref<web.html.HTMLInputElement>?

    /**
     * Callback fired when the state is changed.
     *
     * @param {React.ChangeEvent<HTMLInputElement>} event The event source of the callback.
     * You can pull out the new checked state by accessing `event.target.checked` (boolean).
     */
    var onChange: ((event: react.dom.events.ChangeEvent<web.html.HTMLInputElement>, checked: Boolean) -> Unit)?

    /**
     * If `true`, the `input` element is required.
     * @default false
     */
    var required: Boolean?

    /**
     * The size of the component.
     * `small` is equivalent to the dense checkbox styling.
     * @default 'medium'
     */
    var size: BaseSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The value of the component. The DOM API casts this to a string.
     * The browser uses "on" as the default value.
     */
    var value: dynamic /* SwitchBaseProps['value'] */
}

/**
 *
 * Demos:
 *
 * - [Checkbox](https://mui.com/material-ui/react-checkbox/)
 * - [Transfer List](https://mui.com/material-ui/react-transfer-list/)
 *
 * API:
 *
 * - [Checkbox API](https://mui.com/material-ui/api/checkbox/)
 * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val Checkbox: react.FC<CheckboxProps>
