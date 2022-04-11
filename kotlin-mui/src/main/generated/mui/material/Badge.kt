// Automatically generated - do not modify!

@file:JsModule("@mui/material/Badge")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import csstype.ClassName
import mui.material.styles.Theme
import mui.system.SxProps

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
    var classes: dynamic

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
 * - [Avatars](https://mui.com/material-ui/react-avatar/)
 * - [Badges](https://mui.com/material-ui/react-badge/)
 *
 * API:
 *
 * - [Badge API](https://mui.com/material-ui/api/badge/)
 * - inherits [BadgeUnstyled API](https://mui.com/base/api/badge-unstyled/)
 */
@JsName("default")
external val Badge: react.FC<BadgeProps>
