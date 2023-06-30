package electron.core


external interface NotificationAction {
// Docs: https://electronjs.org/docs/api/structures/notification-action
    /**
     * The label for the given action.
     */
    var text: String?

    /**
     * The type of action, can be `button`.
     */
    var type: (String /* 'button' */)
}
