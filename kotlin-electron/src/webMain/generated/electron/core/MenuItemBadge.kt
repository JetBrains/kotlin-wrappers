// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface MenuItemBadge {
// Docs: https://electronjs.org/docs/api/structures/menu-item-badge
    /**
     * A custom string to display in the badge. Required for, and only usable with, the
     * `none` type.
     */
    var content: String?

    /**
     * The number of items the badge displays. Required for the `alerts`, `updates` and
     * `new-items` types; cannot be used with `none`.
     */
    var count: Double?

    /**
     * Can be `alerts`, `updates`, `new-items` or `none`. Default is `none`. See
     * Creating badges of a specific type for further explanation of these types.
     */
    var type: (MenuItemBadgeType)?
}
