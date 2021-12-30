// Automatically generated - do not modify!

@file:JsModule("@mui/material/Badge")
@file:JsNonModule

package mui.material

external interface BadgeProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement> {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'default'
     */
    var color: BadgeColor?

    /**
     * Wrapped shape the badge should overlap.
     * @default 'rectangular'
     */
    var overlap: mui.system.Union? /* 'rectangular' | 'circular' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

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
