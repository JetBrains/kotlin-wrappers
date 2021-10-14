// Automatically generated - do not modify!

@file:JsModule("@mui/material/AvatarGroup")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import kotlinext.js.ReadonlyArray

external interface AvatarGroupProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * The avatars to stack.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AvatarGroupClasses

    /**
     * Max avatars to show before +x.
     * @default 5
     */
    var max: Number

    /**
     * Spacing between avatars.
     * @default 'medium'
     */
    var spacing: mui.system.Union /* 'small' | 'medium' | number */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>

    /**
     * The variant to use.
     * @default 'circular'
     */
    var variant: mui.system.Union /* 'circular' | 'rounded' | 'square', AvatarGroupPropsVariantOverrides */
}

/**
 *
 * Demos:
 *
 * - [Avatars](https://mui.com/components/avatars/)
 *
 * API:
 *
 * - [AvatarGroup API](https://mui.com/api/avatar-group/)
 */
@JsName("default")
external val AvatarGroup: react.FC<AvatarGroupProps>
