// Automatically generated - do not modify!

@file:JsModule("@mui/material/ToggleButton")
@file:JsNonModule

package mui.material

external interface ToggleButtonProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ToggleButtonClasses

    /**
     * The color of the button when it is in an active state.
     * @default 'standard'
     */
    var color: Union /* 'standard' | 'primary' | 'secondary' | 'error' | 'info' | 'success' | 'warning', ToggleButtonPropsColorOverrides */

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
     * If `true`, the button will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean

    /**
     * If `true`, the button is rendered in an active state.
     */
    var selected: Boolean

    /**
     * The size of the component.
     * The prop defaults to the value inherited from the parent ToggleButtonGroup component.
     * @default 'medium'
     */
    var size: Union /* 'small' | 'medium' | 'large', ToggleButtonPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * The value to associate with the button when selected in a
     * ToggleButtonGroup.
     */
    var value: dynamic
}

/**
 *
 * Demos:
 *
 * - [Toggle Button](https://mui.com/components/toggle-button/)
 *
 * API:
 *
 * - [ToggleButton API](https://mui.com/api/toggle-button/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val ToggleButton: react.FC<ToggleButtonProps>
