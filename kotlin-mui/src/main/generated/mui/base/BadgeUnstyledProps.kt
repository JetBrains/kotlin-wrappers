// Automatically generated - do not modify!

@file:JsModule("@mui/base/BadgeUnstyledProps")
@file:JsNonModule

package mui.base

external interface BadgeUnstyledProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement>,
    react.PropsWithChildren {
    /**
     * The anchor of the badge.
     * @default {
     *   vertical: 'top',
     *   horizontal: 'right',
     * }
     */
    var anchorOrigin: BadgeOrigin?

    /**
     * The components used for each slot inside the Badge.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the Badge.
     * @default {}
     */
    var componentsProps: dynamic

    /**
     * The content rendered within the badge.
     */
    var badgeContent: react.ReactNode?

    /**
     * The badge will be added relative to this node.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: BadgeUnstyledClasses?

    /**
     * If `true`, the badge is invisible.
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

    /**
     * The variant to use.
     * @default 'standard'
     */
    var variant: String?
}

external interface BadgeOrigin {
    var vertical: BadgeUnstyledOriginVertical

    var horizontal: BadgeUnstyledOriginHorizontal
}
