// Automatically generated - do not modify!

package mui.base

external interface BadgeProps :
    BadgeOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>

external interface BadgeOwnProps : react.PropsWithChildren {
    /**
     * The content rendered within the badge.
     */
    var badgeContent: react.ReactNode?

    /**
     * The badge will be added relative to this node.
     */
    override var children: react.ReactNode?

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
        var root: react.Props? /* SlotComponentProps<'span', BadgeRootSlotPropsOverrides, BadgeOwnerState> */
        var badge: react.Props? /* SlotComponentProps<'span', BadgeBadgeSlotPropsOverrides, BadgeOwnerState> */
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
    var root: react.ElementType<*>?

    /**
     * The component that renders the badge.
     * @default 'span'
     */
    var badge: react.ElementType<*>?
}
