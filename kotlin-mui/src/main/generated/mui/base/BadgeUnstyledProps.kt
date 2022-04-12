// Automatically generated - do not modify!

package mui.base

external interface BadgeUnstyledProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement>,
    react.PropsWithChildren {
    /**
     * The components used for each slot inside the Badge.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
        var Badge: react.ElementType<*>?
    }

    /**
     * The props used for each slot inside the Badge.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* React.HTMLAttributes<HTMLSpanElement> & BadgeUnstyledComponentsPropsOverrides */
        var badge: react.Props? /* React.HTMLAttributes<HTMLSpanElement> & BadgeUnstyledComponentsPropsOverrides */
    }

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
     * Controls whether the badge is hidden when `badgeContent` is zero.
     * @default false
     */
    var showZero: Boolean?
}
