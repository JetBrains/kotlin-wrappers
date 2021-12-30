// Automatically generated - do not modify!

@file:JsModule("@mui/material/Button")
@file:JsNonModule

package mui.material

external interface ButtonProps :
    react.dom.html.ButtonHTMLAttributes<org.w3c.dom.HTMLButtonElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ButtonClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: mui.system.Union? /* 'inherit' | 'primary' | 'secondary' | 'success' | 'error' | 'info' | 'warning', ButtonPropsColorOverrides */

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    override var disabled: Boolean?

    /**
     * If `true`, no elevation is used.
     * @default false
     */
    var disableElevation: Boolean?

    /**
     * If `true`, the  keyboard focus ripple is disabled.
     * @default false
     */
    var disableFocusRipple: Boolean?

    /**
     * Element placed after the children.
     */
    var endIcon: react.ReactNode?

    /**
     * If `true`, the button will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean?

    /**
     * The URL to link to when the button is clicked.
     * If defined, an `a` element will be used as the root node.
     */
    var href: String?

    /**
     * The size of the component.
     * `small` is equivalent to the dense button styling.
     * @default 'medium'
     */
    var size: mui.system.Union? /* 'small' | 'medium' | 'large', ButtonPropsSizeOverrides */

    /**
     * Element placed before the children.
     */
    var startIcon: react.ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The variant to use.
     * @default 'text'
     */
    var variant: ButtonVariant?
}

/**
 *
 * Demos:
 *
 * - [Button Group](https://mui.com/components/button-group/)
 * - [Buttons](https://mui.com/components/buttons/)
 *
 * API:
 *
 * - [Button API](https://mui.com/api/button/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val Button: react.FC<ButtonProps>
