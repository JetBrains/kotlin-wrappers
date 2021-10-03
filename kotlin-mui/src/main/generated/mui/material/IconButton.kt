// Automatically generated - do not modify!

@file:JsModule("@mui/material/IconButton")
@file:JsNonModule

package mui.material

external interface IconButtonProps : react.PropsWithChildren {
    /**
     * The icon to display.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: IconButtonClasses

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'default'
     */
    var color: Union /* 'inherit' | 'default' | 'primary' | 'secondary' | 'error' | 'info' | 'success' | 'warning', IconButtonPropsColorOverrides */

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean

    /**
     * If `true`, the  keyboard focus ripple is disabled.
     * @default false
     */
    var disableFocusRipple: Boolean

    /**
     * If given, uses a negative margin to counteract the padding on one
     * side (this is often helpful for aligning the left or right
     * side of the icon with content above or below, without ruining the border
     * size and shape).
     * @default false
     */
    var edge: Union /* 'start' | 'end' | false */

    /**
     * The size of the component.
     * `small` is equivalent to the dense button styling.
     * @default 'medium'
     */
    var size: Union /* 'small' | 'medium' | 'large', IconButtonPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 * Refer to the [Icons](https://mui.com/components/icons/) section of the documentation
 * regarding the available icon options.
 *
 * Demos:
 *
 * - [Buttons](https://mui.com/components/buttons/)
 *
 * API:
 *
 * - [IconButton API](https://mui.com/api/icon-button/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val IconButton: react.FC<IconButtonProps>
