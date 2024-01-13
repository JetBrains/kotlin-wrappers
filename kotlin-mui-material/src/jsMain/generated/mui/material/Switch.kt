// Automatically generated - do not modify!

@file:JsModule("@mui/material/Switch")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface SwitchProps :
    mui.system.StandardProps,
    SwitchBaseProps,
    mui.system.PropsWithSx {
    /**
     * The icon to display when the component is checked.
     */
    var checkedIcon: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SwitchClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'primary'
     */
    var color: SwitchColor?

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean?

    /**
     * The icon to display when the component is unchecked.
     */
    var icon: react.ReactNode?

    /**
     * The size of the component.
     * `small` is equivalent to the dense switch styling.
     * @default 'medium'
     */
    var size: BaseSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The value of the component. The DOM API casts this to a string.
     * The browser uses "on" as the default value.
     */
    var value: Any?
}

/**
 *
 * Demos:
 *
 * - [Switch](https://mui.com/material-ui/react-switch/)
 * - [Transfer List](https://mui.com/material-ui/react-transfer-list/)
 *
 * API:
 *
 * - [Switch API](https://mui.com/material-ui/api/switch/)
 * - inherits [IconButton API](https://mui.com/material-ui/api/icon-button/)
 */
@JsName("default")
external val Switch: react.FC<SwitchProps>
