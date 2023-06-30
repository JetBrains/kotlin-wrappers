package electron.core


external interface NotificationResponse {
// Docs: https://electronjs.org/docs/api/structures/notification-response
    /**
     * The identifier string of the action that the user selected.
     */
    var actionIdentifier: String

    /**
     * The delivery date of the notification.
     */
    var date: Double

    /**
     * The unique identifier for this notification request.
     */
    var identifier: String

    /**
     * A dictionary of custom information associated with the notification.
     */
    var userInfo: js.core.ReadonlyRecord<String, Any>

    /**
     * The text entered or chosen by the user.
     */
    var userText: String?
}
