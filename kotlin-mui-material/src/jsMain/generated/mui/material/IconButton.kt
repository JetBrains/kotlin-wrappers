// Automatically generated - do not modify!

@file:JsModule("@mui/material/IconButton")

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

external interface IconButtonProps :
    IconButtonOwnProps,
    ButtonHTMLAttributes<HTMLButtonElement>,
    PropsWithComponent,
    ButtonBaseProps

external interface IconButtonOwnProps :
    PropsWithChildren,
    PropsWithSx,
    ButtonBaseProps {
    /**
     * The icon to display.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: IconButtonClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'default'
     */
    var color: IconButtonColor?

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
     * If given, uses a negative margin to counteract the padding on one
     * side (this is often helpful for aligning the left or right
     * side of the icon with content above or below, without ruining the border
     * size and shape).
     * @default false
     */
    var edge: IconButtonEdge?

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
     * The size of the component.
     * `small` is equivalent to the dense button styling.
     * @default 'medium'
     */
    var size: Size?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 * Refer to the [Icons](https://v6.mui.com/material-ui/icons/) section of the documentation
 * regarding the available icon options.
 *
 * Demos:
 *
 * - [Button](https://v6.mui.com/material-ui/react-button/)
 *
 * API:
 *
 * - [IconButton API](https://v6.mui.com/material-ui/api/icon-button/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val IconButton: FC<IconButtonProps>
