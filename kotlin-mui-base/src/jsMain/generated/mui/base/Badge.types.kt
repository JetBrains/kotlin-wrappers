// Automatically generated - do not modify!

package mui.base

import react.ElementType
import react.Props
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface BadgeProps :
    BadgeOwnProps,
    HTMLAttributes<HTMLSpanElement>

external interface BadgeOwnProps : PropsWithChildren {
    /**
     * The content rendered within the badge.
     */
    var badgeContent: ReactNode?

    /**
     * The badge will be added relative to this node.
     */
    override var children: ReactNode?

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
     * The props used for each slot inside the Badge.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: Props? /* SlotComponentProps<'span', BadgeRootSlotPropsOverrides, BadgeOwnerState> */
        var badge: Props? /* SlotComponentProps<'span', BadgeBadgeSlotPropsOverrides, BadgeOwnerState> */
    }

    /**
     * The components used for each slot inside the Badge.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: BadgeSlots?

    /**
     * Controls whether the badge is hidden when `badgeContent` is zero.
     * @default false
     */
    var showZero: Boolean?
}

external interface BadgeSlots {
    /**
     * The component that renders the root.
     * @default 'span'
     */
    var root: ElementType<*>?

    /**
     * The component that renders the badge.
     * @default 'span'
     */
    var badge: ElementType<*>?
}
