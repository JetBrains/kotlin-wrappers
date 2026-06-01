// Automatically generated - do not modify!

@file:JsModule("@mui/material/Badge")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.base.BadgeOwnProps
import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*
import react.dom.html.HTMLAttributes
import web.cssom.ClassName
import web.html.HTMLSpanElement

external interface BadgeProps :
    BadgeOwnProps,
    HTMLAttributes<HTMLSpanElement>,
    PropsWithComponent

external interface BadgePropsVariantOverrides

external interface BadgePropsColorOverrides

external interface BadgeRootSlotPropsOverrides

external interface BadgeBadgeSlotPropsOverrides

external interface BadgeSlots {
    /**
     * The component that renders the root.
     * @default span
     */
    var root: ElementType<*>

    /**
     * The component that renders the badge.
     * @default span
     */
    var badge: ElementType<*>
}

external interface BadgeSlotProps : Props {
    /** TS: SlotProps<'span', BadgeRootSlotPropsOverrides, BadgeOwnerState> */
    var root: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<'span', BadgeBadgeSlotPropsOverrides, BadgeOwnerState> */
    var badge: HTMLAttributes<HTMLSpanElement>?
}

external interface BadgeSlotsAndSlotProps : Props {
    var slots: BadgeSlots?

    var slotProps: BadgeSlotProps?
}

external interface BadgeOrigin {
    var vertical: BadgeOriginVertical?

    var horizontal: BadgeOriginHorizontal?
}

external interface BadgeOwnProps :
    BadgeSlotsAndSlotProps,
    PropsWithChildren,
    PropsWithClassName,
    PropsWithSx {
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
    var badgeContent: ReactNode?

    /**
     * The badge will be added relative to this node.
     */
    override var children: ReactNode?

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
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'default'
     */
    var color: BadgeColor?

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * @deprecated use the `slotProps` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     *
     * @default {}
     */
    var componentsProps: BadgeOwnProps.SlotProps?

    /**
     * The components used for each slot inside.
     *
     * @deprecated use the `slots` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     *
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: ElementType<*>?
        var Badge: ElementType<*>?
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
 * - [Avatar](https://v6.mui.com/material-ui/react-avatar/)
 * - [Badge](https://v6.mui.com/material-ui/react-badge/)
 *
 * API:
 *
 * - [Badge API](https://v6.mui.com/material-ui/api/badge/)
 */
@JsName("default")
external val Badge: FC<BadgeProps>
