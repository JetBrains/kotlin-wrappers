// Automatically generated - do not modify!

@file:JsModule("@mui/material/Badge")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface BadgeProps :
    mui.base.BadgeUnstyledProps,
    react.PropsWithClassName,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    /**
     * The anchor of the badge.
     * @default {
     *   vertical: 'top',
     *   horizontal: 'right',
     * }
     */
    var anchorOrigin: BadgeOrigin?

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
    var componentsProps: mui.base.BadgeUnstyledOwnProps.SlotProps?

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
     * Wrapped shape the badge should overlap.
     * @default 'rectangular'
     */
    var overlap: BadgeOverlap?

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

external interface BadgeOrigin {
    var vertical: BadgeOriginVertical

    var horizontal: BadgeOriginHorizontal
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
