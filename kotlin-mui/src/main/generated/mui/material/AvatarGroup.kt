// Automatically generated - do not modify!

@file:JsModule("@mui/material/AvatarGroup")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface AvatarGroupProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The avatars to stack.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AvatarGroupClasses?

    /**
     * The props used for each slot inside the AvatarGroup.
     * @default {}
     */
    var componentsProps: dynamic

    /**
     * Max avatars to show before +x.
     * @default 5
     */
    var max: Number?

    /**
     * Spacing between avatars.
     * @default 'medium'
     */
    var spacing: mui.system.Union? /* 'small' | 'medium' | number */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The total number of avatars. Used for calculating the number of extra avatars.
     * @default children.length
     */
    var total: Number?

    /**
     * The variant to use.
     * @default 'circular'
     */
    var variant: AvatarGroupVariant?
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
