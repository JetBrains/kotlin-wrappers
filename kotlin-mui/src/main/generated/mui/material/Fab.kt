// Automatically generated - do not modify!

@file:JsModule("@mui/material/Fab")
@file:JsNonModule

package mui.material

external interface FabProps :
    react.dom.html.ButtonHTMLAttributes<org.w3c.dom.HTMLButtonElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: FabClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'default'
     */
    var color: FabColor?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    override var disabled: Boolean?

    /**
     * If `true`, the  keyboard focus ripple is disabled.
     * @default false
     */
    var disableFocusRipple: Boolean?

    /**
     * If `true`, the ripple effect is disabled.
     */
    var disableRipple: Boolean?

    /**
     * The URL to link to when the button is clicked.
     * If defined, an `a` element will be used as the root node.
     */
    var href: String?

    /**
     * The size of the component.
     * `small` is equivalent to the dense button styling.
     * @default 'large'
     */
    var size: Size?

    /**
     * The variant to use.
     * @default 'circular'
     */
    var variant: FabVariant?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Floating Action Button](https://mui.com/components/floating-action-button/)
 *
 * API:
 *
 * - [Fab API](https://mui.com/api/fab/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val Fab: react.FC<FabProps>
