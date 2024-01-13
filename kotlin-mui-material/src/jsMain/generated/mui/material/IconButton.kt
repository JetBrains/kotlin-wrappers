// Automatically generated - do not modify!

@file:JsModule("@mui/material/IconButton")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface IconButtonProps :
    IconButtonOwnProps,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
    mui.types.PropsWithComponent,
    ButtonBaseProps

external interface IconButtonOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    ButtonBaseProps {
    /**
     * The icon to display.
     */
    override var children: react.ReactNode?

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
 * Refer to the [Icons](https://mui.com/material-ui/icons/) section of the documentation
 * regarding the available icon options.
 *
 * Demos:
 *
 * - [Button](https://mui.com/material-ui/react-button/)
 *
 * API:
 *
 * - [IconButton API](https://mui.com/material-ui/api/icon-button/)
 * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val IconButton: react.FC<IconButtonProps>
