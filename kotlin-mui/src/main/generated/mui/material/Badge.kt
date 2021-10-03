// Automatically generated - do not modify!

@file:JsModule("@mui/material/Badge")
@file:JsNonModule

package mui.material

external interface BadgeProps : react.Props {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic
    var colorPrimary: dynamic
    var colorSecondary: dynamic
    var colorError: dynamic
    var colorInfo: dynamic
    var colorSuccess: dynamic
    var colorWarning: dynamic

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'default'
     */
    var color: Union /* 'primary' | 'secondary' | 'default' | 'error' | 'info' | 'success' | 'warning', BadgePropsColorOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * The variant to use.
     * @default 'standard'
     */
    var variant: Union /* 'standard' | 'dot', BadgePropsVariantOverrides */
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
