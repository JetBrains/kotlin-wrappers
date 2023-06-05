// Automatically generated - do not modify!

package mui.base

external interface UseBadgeParameters {
    /**
     * The content rendered within the badge.
     */
    var badgeContent: react.ReactNode?

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

external interface UseBadgeReturnValue {
    /**
     * Defines the content that's displayed inside the badge.
     */
    var badgeContent: react.ReactNode

    /**
     * If `true`, the component will not be visible.
     * @default false
     */
    var invisible: Boolean

    /**
     * Maximum number to be displayed in the badge.
     * @default 99
     */
    var max: Number

    /**
     * Value to be displayed in the badge. If `badgeContent` is greater than `max`, it will return `max+`.
     * @default badgeContent
     */
    var displayValue: react.ReactNode
}
