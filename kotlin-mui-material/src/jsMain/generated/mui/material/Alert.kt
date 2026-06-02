// Automatically generated - do not modify!

@file:JsModule("@mui/material/Alert")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import mui.system.Union
import react.ElementType
import react.FC
import react.ReactNode
import react.dom.events.SyntheticEvent

external interface AlertProps :
    StandardProps,
    PaperProps,
    PropsWithSx,
    AlertSlots {
    /**
     * The action to display. It renders after the message, at the end of the alert.
     */
    var action: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AlertClasses?

    /**
     * Override the default label for the *close popup* icon button.
     *
     * For localization purposes, you can use the provided [translations](https://mui.com/material-ui/guides/localization/).
     * @default 'Close'
     */
    var closeText: String?

    /**
     * The color of the component. Unless provided, the value is taken from the `severity` prop.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     */
    var color: AlertColor?

    /**
     * The components used for each slot inside.
     *
     * @deprecated use the `slots` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     *
     * @default {}
     */
    var components: Components?

    interface Components {
        var CloseButton: ElementType<*>?
        var CloseIcon: ElementType<*>?
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * @deprecated use the `slotProps` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     *
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var closeButton: IconButtonProps?
        var closeIcon: SvgIconProps?
    }

    /**
     * The severity of the alert. This defines the color and icon used.
     * @default 'success'
     */
    var severity: Union? /* AlertColor, AlertPropsColorOverrides */

    /**
     * Override the icon displayed before the children.
     * Unless provided, the icon is mapped to the value of the `severity` prop.
     * Set to `false` to remove the `icon`.
     */
    var icon: ReactNode?

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
    var iconMapping: Any? /* Partial<
  Record<OverridableStringUnion<AlertColor, AlertPropsColorOverrides>, React.ReactNode>
> */

    /**
     * Callback fired when the component requests to be closed.
     * When provided and no `action` prop is set, a close icon button is displayed that triggers the callback when clicked.
     * @param {React.SyntheticEvent} event The event source of the callback.
     */
    var onClose: ((event: SyntheticEvent<*, *>) -> Unit)?

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

external interface AlertSlots {
    /**
     * The component that renders the root slot.
     * @default Paper
     */
    var root: ElementType<*>

    /**
     * The component that renders the icon slot.
     * @default div
     */
    var icon: ElementType<*>

    /**
     * The component that renders the message slot.
     * @default div
     */
    var message: ElementType<*>

    /**
     * The component that renders the action slot.
     * @default div
     */
    var action: ElementType<*>

    /**
     * The component that renders the close button.
     * @default IconButton
     */
    var closeButton: ElementType<*>

    /**
     * The component that renders the close icon.
     * @default svg
     */
    var closeIcon: ElementType<*>
}

/**
 *
 * Demos:
 *
 * - [Alert](https://v6.mui.com/material-ui/react-alert/)
 *
 * API:
 *
 * - [Alert API](https://v6.mui.com/material-ui/api/alert/)
 * - inherits [Paper API](https://v6.mui.com/material-ui/api/paper/)
 */
@JsName("default")
external val Alert: FC<AlertProps>
