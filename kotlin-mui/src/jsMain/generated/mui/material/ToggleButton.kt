// Automatically generated - do not modify!

@file:JsModule("@mui/material/ToggleButton")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ToggleButtonProps :
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    ButtonBaseProps {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ToggleButtonClasses?

    /**
     * The color of the button when it is in an active state.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
     * @default 'standard'
     */
    var color: ToggleButtonColor?

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
     * If `true`, the button will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean?

    /**
     * Callback fired when the state changes.
     *
     * @param {React.MouseEvent<HTMLElement>} event The event source of the callback.
     * @param {any} value of the selected button.
     */
    var onChange: ((event: react.dom.events.MouseEvent<web.html.HTMLElement, *>, value: dynamic) -> Unit)?

    /**
     * Callback fired when the button is clicked.
     *
     * @param {React.MouseEvent<HTMLElement>} event The event source of the callback.
     * @param {any} value of the selected button.
     */
    var onClick: ((event: react.dom.events.MouseEvent<web.html.HTMLElement, *>, value: dynamic) -> Unit)?

    /**
     * If `true`, the button is rendered in an active state.
     */
    var selected: Boolean?

    /**
     * The size of the component.
     * The prop defaults to the value inherited from the parent ToggleButtonGroup component.
     * @default 'medium'
     */
    var size: Size?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The value to associate with the button when selected in a
     * ToggleButtonGroup.
     */
    override var value: dynamic
}

/**
 *
 * Demos:
 *
 * - [Toggle Button](https://mui.com/material-ui/react-toggle-button/)
 *
 * API:
 *
 * - [ToggleButton API](https://mui.com/material-ui/api/toggle-button/)
 * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val ToggleButton: react.FC<ToggleButtonProps>
