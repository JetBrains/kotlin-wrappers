// Automatically generated - do not modify!

@file:JsModule("@mui/material/Switch")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface SwitchProps :
    mui.system.StandardProps,
    SwitchBaseProps {
    /**
     * The icon to display when the component is checked.
     */
    var checkedIcon: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SwitchClasses

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: mui.system.Union /* 'primary' | 'secondary' | 'error' | 'info' | 'success' | 'warning' | 'default', SwitchPropsColorOverrides */

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean

    /**
     * The icon to display when the component is unchecked.
     */
    var icon: react.ReactNode

    /**
     * The size of the component.
     * `small` is equivalent to the dense switch styling.
     * @default 'medium'
     */
    var size: mui.system.Union /* 'small' | 'medium', SwitchPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>

    /**
     * The value of the component. The DOM API casts this to a string.
     * The browser uses "on" as the default value.
     */
    var value: dynamic
}

/**
 *
 * Demos:
 *
 * - [Switches](https://mui.com/components/switches/)
 * - [Transfer List](https://mui.com/components/transfer-list/)
 *
 * API:
 *
 * - [Switch API](https://mui.com/api/switch/)
 * - inherits [IconButton API](https://mui.com/api/icon-button/)
 */
@JsName("default")
external val Switch: react.FC<SwitchProps>
