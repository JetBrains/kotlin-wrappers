// Automatically generated - do not modify!

@file:JsModule("@mui/material/Fab")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.ButtonHTMLAttributes
import web.html.HTMLButtonElement

external interface FabProps :
    FabOwnProps,
    ButtonHTMLAttributes<HTMLButtonElement>,
    PropsWithComponent,
    ButtonBaseProps

external interface FabPropsVariantOverrides

external interface FabPropsSizeOverrides

external interface FabPropsColorOverrides

external interface FabOwnProps :
    PropsWithChildren,
    PropsWithSx,
    ButtonBaseProps {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: FabClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
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
    override var disableRipple: Boolean?

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
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Floating Action Button](https://v6.mui.com/material-ui/react-floating-action-button/)
 *
 * API:
 *
 * - [Fab API](https://v6.mui.com/material-ui/api/fab/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val Fab: FC<FabProps>
