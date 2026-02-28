// Automatically generated - do not modify!

package electron.core

external interface NotificationAction {
// Docs: https://electronjs.org/docs/api/structures/notification-action
    /**
     * The list of items for the `selection` action `type`.
     *
     * @platform win32
     */
    var items: js.array.ReadonlyArray<String>?

    /**
     * The label for the given action.
     */
    var text: String?

    /**
     * The type of action, can be `button` or `selection`. `selection` is only
     * supported on Windows.
     */
    var type: (NotificationActionType)
}
