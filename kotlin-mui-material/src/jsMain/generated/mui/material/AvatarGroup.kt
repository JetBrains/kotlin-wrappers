// Automatically generated - do not modify!

@file:JsModule("@mui/material/AvatarGroup")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface AvatarGroupProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
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
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: react.ElementType<*>?

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `slotProps` prop.
     * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
     *
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var additionalAvatar: react.Props? /* React.ComponentPropsWithRef<typeof Avatar> &
  AvatarGroupComponentsPropsOverrides */
    }

    /**
     * Max avatars to show before +x.
     * @default 5
     */
    var max: Number?

    /**
     * custom renderer of extraAvatars
     * @param {number} surplus number of extra avatars
     * @returns {React.ReactNode} custom element to display
     */
    var renderSurplus: ((surplus: Number) -> react.ReactNode)?

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `componentsProps` prop, which will be deprecated in the future.
     *
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var additionalAvatar: react.Props? /* React.ComponentPropsWithRef<typeof Avatar> &
  AvatarGroupComponentsPropsOverrides */
    }

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
 * - [Avatar](https://mui.com/material-ui/react-avatar/)
 *
 * API:
 *
 * - [AvatarGroup API](https://mui.com/material-ui/api/avatar-group/)
 */
@JsName("default")
external val AvatarGroup: react.FC<AvatarGroupProps>
