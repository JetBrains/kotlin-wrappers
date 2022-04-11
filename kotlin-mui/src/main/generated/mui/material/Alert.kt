// Automatically generated - do not modify!

@file:JsModule("@mui/material/Alert")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface AlertProps :
    mui.system.StandardProps,
    PaperProps,
    mui.system.PropsWithSx {
    /**
     * The action to display. It renders after the message, at the end of the alert.
     */
    var action: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AlertClasses?

    /**
     * Override the default label for the *close popup* icon button.
     *
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @default 'Close'
     */
    var closeText: String?

    /**
     * The color of the component. Unless provided, the value is taken from the `severity` prop.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
     */
    var color: AlertColor?

    /**
     * The severity of the alert. This defines the color and icon used.
     * @default 'success'
     */
    var severity: AlertColor?

    /**
     * Override the icon displayed before the children.
     * Unless provided, the icon is mapped to the value of the `severity` prop.
     * Set to `false` to remove the `icon`.
     */
    var icon: react.ReactNode?

    /**
     * The ARIA role attribute of the element.
     * @default 'alert'
     */
    var role: String?

    /**
     * The component maps the `severity` prop to a range of different icons,
     * for instance success to `<SuccessOutlined>`.
     * If you wish to change this mapping, you can provide your own.
     * Alternatively, you can use the `icon` prop to override the icon displayed.
     */
    var iconMapping: dynamic

    /**
     * Callback fired when the component requests to be closed.
     * When provided and no `action` prop is set, a close icon button is displayed that triggers the callback when clicked.
     * @param {React.SyntheticEvent} event The event source of the callback.
     */
    var onClose: ((event: react.dom.events.SyntheticEvent<*, *>) -> Unit)?

    /**
     * The variant to use.
     * @default 'standard'
     */
    var variant: AlertVariant?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Alert](https://mui.com/material-ui/react-alert/)
 *
 * API:
 *
 * - [Alert API](https://mui.com/material-ui/api/alert/)
 * - inherits [Paper API](https://mui.com/material-ui/api/paper/)
 */
@JsName("default")
external val Alert: react.FC<AlertProps>
