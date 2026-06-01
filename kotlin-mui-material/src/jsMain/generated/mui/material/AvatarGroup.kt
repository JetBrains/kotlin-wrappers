// Automatically generated - do not modify!

@file:JsModule("@mui/material/AvatarGroup")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.system.Union
import mui.types.PropsWithComponent
import react.*
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface AvatarGroupProps :
    AvatarGroupOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface AvatarGroupPropsVariantOverrides

external interface AvatarGroupComponentsPropsOverrides

external interface AvatarGroupSlots {
    var surplus: ElementType<*>
}

external interface AvatarGroupSlotProps : Props {
    /** TS: React.ComponentPropsWithRef<typeof Avatar> & AvatarGroupComponentsPropsOverrides */
    var additionalAvatar: Any?

    /** TS: SlotProps< React.ElementType<React.ComponentPropsWithRef<typeof Avatar>>, AvatarGroupComponentsPropsOverrides, AvatarGroupOwnerState > */
    var surplus: Any?
}

external interface AvatarGroupSlotsAndSlotProps : Props {
    var slots: AvatarGroupSlots?

    var slotProps: AvatarGroupSlotProps?
}

external interface AvatarGroupOwnProps :
    AvatarGroupSlotsAndSlotProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The avatars to stack.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AvatarGroupClasses?

    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: ElementType<*>?

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `slotProps` prop.
     *
     * @deprecated use the `slotProps` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var additionalAvatar: Props? /* React.ComponentPropsWithRef<typeof Avatar> &
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
    var renderSurplus: ((surplus: Number) -> ReactNode)?

    /**
     * Spacing between avatars.
     * @default 'medium'
     */
    var spacing: Union? /* 'small' | 'medium' | number */

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

external interface AvatarGroupOwnerState

/**
 *
 * Demos:
 *
 * - [Avatar](https://v6.mui.com/material-ui/react-avatar/)
 *
 * API:
 *
 * - [AvatarGroup API](https://v6.mui.com/material-ui/api/avatar-group/)
 */
@JsName("default")
external val AvatarGroup: FC<AvatarGroupProps>
