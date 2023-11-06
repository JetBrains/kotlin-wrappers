// Automatically generated - do not modify!

@file:JsModule("@mui/material/Badge")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface BadgeProps :
    BadgeOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    mui.types.PropsWithComponent

external interface BadgeOrigin {
    var vertical: BadgeOriginVertical

    var horizontal: BadgeOriginHorizontal
}

external interface BadgeOwnProps :
    react.PropsWithChildren,
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * The anchor of the badge.
     * @default {
     *   vertical: 'top',
     *   horizontal: 'right',
     * }
     */
    var anchorOrigin: BadgeOrigin?

    /**
     * The content rendered within the badge.
     */
    var badgeContent: react.ReactNode?

    /**
     * The badge will be added relative to this node.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: BadgeClasses?

    /**
     * @ignore
     */
    override var className: ClassName?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
     * @default 'default'
     */
    var color: BadgeColor?

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `slotProps` prop.
     * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
     *
     * @default {}
     */
    var componentsProps: mui.base.BadgeOwnProps.SlotProps?

    /**
     * The components used for each slot inside.
     *
     * This prop is an alias for the `slots` prop.
     * It's recommended to use the `slots` prop instead.
     *
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
        var Badge: react.ElementType<*>?
    }

    /**
     * If `true`, the badge is invisible.
     * @default false
     */
    var invisible: Boolean?

    /**
     * Max count to show.
     * @default 99
     */
    var max: Number?

    /**
     * Wrapped shape the badge should overlap.
     * @default 'rectangular'
     */
    var overlap: BadgeOverlap?

    /**
     * The props used for each slot inside the Badge.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'span', BadgeRootSlotPropsOverrides, BadgeOwnerState> */
        var badge: react.Props? /* SlotComponentProps<'span', BadgeBadgeSlotPropsOverrides, BadgeOwnerState> */
    }

    /**
     * The components used for each slot inside the Badge.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: react.ElementType<*>?
        var badge: react.ElementType<*>?
    }

    /**
     * Controls whether the badge is hidden when `badgeContent` is zero.
     * @default false
     */
    var showZero: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The variant to use.
     * @default 'standard'
     */
    var variant: BadgeVariant?
}

/**
 *
 * Demos:
 *
 * - [Avatar](https://mui.com/material-ui/react-avatar/)
 * - [Badge](https://mui.com/material-ui/react-badge/)
 *
 * API:
 *
 * - [Badge API](https://mui.com/material-ui/api/badge/)
 */
@JsName("default")
external val Badge: react.FC<BadgeProps>
