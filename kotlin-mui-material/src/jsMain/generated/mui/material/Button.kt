// Automatically generated - do not modify!

@file:JsModule("@mui/material/Button")

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

external interface ButtonProps :
    ButtonOwnProps,
    ButtonHTMLAttributes<HTMLButtonElement>,
    PropsWithComponent

external interface ButtonOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ButtonClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'primary'
     */
    var color: ButtonColor?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

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
    var endIcon: ReactNode?

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
     * If `true`, the loading indicator is visible and the button is disabled.
     * If `true | false`, the loading wrapper is always rendered before the children to prevent [Google Translation Crash](https://github.com/mui/material-ui/issues/27853).
     * @default null
     */
    var loading: Boolean?

    /**
     * Element placed before the children if the button is in loading state.
     * The node should contain an element with `role="progressbar"` with an accessible name.
     * By default, it renders a `CircularProgress` that is labeled by the button itself.
     * @default <CircularProgress color="inherit" size={16} />
     */
    var loadingIndicator: ReactNode?

    /**
     * The loading indicator can be positioned on the start, end, or the center of the button.
     * @default 'center'
     */
    var loadingPosition: LoadingPosition?

    /**
     * The size of the component.
     * `small` is equivalent to the dense button styling.
     * @default 'medium'
     */
    var size: Size?

    /**
     * Element placed before the children.
     */
    var startIcon: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

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
 * - [Button Group](https://v6.mui.com/material-ui/react-button-group/)
 * - [Button](https://v6.mui.com/material-ui/react-button/)
 *
 * API:
 *
 * - [Button API](https://v6.mui.com/material-ui/api/button/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val Button: FC<ButtonProps>
