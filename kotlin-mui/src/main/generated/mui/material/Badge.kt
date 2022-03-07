// Automatically generated - do not modify!

@file:JsModule("@mui/material/Badge")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface BadgeProps :
    mui.base.BadgeUnstyledProps,
    mui.types.PropsWithComponent {
    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: dynamic

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
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
    var sx: SxProps<Theme>?

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
 * - [Avatars](https://mui.com/components/avatars/)
 * - [Badges](https://mui.com/components/badges/)
 *
 * API:
 *
 * - [Badge API](https://mui.com/api/badge/)
 * - inherits [BadgeUnstyled API](https://mui.com/api/badge-unstyled/)
 */
@JsName("default")
external val Badge: react.FC<BadgeProps>
