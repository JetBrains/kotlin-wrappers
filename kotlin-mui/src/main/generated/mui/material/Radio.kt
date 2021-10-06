// Automatically generated - do not modify!

@file:JsModule("@mui/material/Radio")
@file:JsNonModule

package mui.material

external interface RadioProps : react.Props {
    /**
     * The icon to display when the component is checked.
     * @default <RadioButtonIcon checked />
     */
    var checkedIcon: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: RadioClasses

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: mui.system.Union /* 'primary' | 'secondary' | 'error' | 'info' | 'success' | 'warning' | 'default', RadioPropsColorOverrides */

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean

    /**
     * The icon to display when the component is unchecked.
     * @default <RadioButtonIcon />
     */
    var icon: react.ReactNode

    /**
     * The size of the component.
     * `small` is equivalent to the dense radio styling.
     * @default 'medium'
     */
    var size: mui.system.Union /* 'small' | 'medium', RadioPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}

/**
 *
 * Demos:
 *
 * - [Radio Buttons](https://mui.com/components/radio-buttons/)
 *
 * API:
 *
 * - [Radio API](https://mui.com/api/radio/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val Radio: react.FC<RadioProps>
