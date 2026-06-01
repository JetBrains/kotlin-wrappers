// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface NotificationConstructorOptions {
    /**
     * A unique identifier for the notification. On macOS, maps to
     * `UNNotificationRequest`'s `identifier` property. On Windows, maps to the toast
     * notification's `Tag` property. Defaults to a random UUID if not provided or if
     * an empty string is passed. Use this identifier with `Notification.remove()` to
     * remove specific delivered notifications, or with `Notification.getHistory()` to
     * identify them.
     *
     * @platform darwin,win32
     */
    var id: String?

    /**
     * A string identifier used to visually group notifications together in
     * Notification Center / Action Center. On macOS, maps to `UNNotificationContent`'s
     * `threadIdentifier` property. On Windows, maps to the toast notification's
     * `Group` property. Use this identifier with `Notification.removeGroup()` to
     * remove all notifications in a group.
     *
     * @platform darwin,win32
     */
    var groupId: String?

    /**
     * A title for the notification group header. When both `groupId` and `groupTitle`
     * are specified, Windows will display a header above the notification that groups
     * related notifications together. Maps to the toast notification's `header`
     * element.
     *
     * @platform win32
     */
    var groupTitle: String?

    /**
     * A title for the notification, which will be displayed at the top of the
     * notification window when it is shown.
     */
    var title: String?

    /**
     * A subtitle for the notification, which will be displayed below the title.
     *
     * @platform darwin
     */
    var subtitle: String?

    /**
     * The body text of the notification, which will be displayed below the title or
     * subtitle.
     */
    var body: String?

    /**
     * Whether or not to suppress the OS notification noise when showing the
     * notification.
     */
    var silent: Boolean?

    /**
     * An icon to use in the notification. If a string is passed, it must be a valid
     * path to a local icon file.
     */
    var icon: (Any /* (string) | (NativeImage) */)?

    /**
     * Whether or not to add an inline reply option to the notification.
     *
     * @platform darwin,win32
     */
    var hasReply: Boolean?

    /**
     * The timeout duration of the notification. Can be 'default' or 'never'.
     *
     * @platform linux,win32
     */
    var timeoutType: (NotificationConstructorOptionsTimeoutType)?

    /**
     * The placeholder to write in the inline reply input field.
     *
     * @platform darwin,win32
     */
    var replyPlaceholder: String?

    /**
     * The name of the sound file to play when the notification is shown.
     *
     * @platform darwin
     */
    var sound: String?

    /**
     * The urgency level of the notification. Can be 'normal', 'critical', or 'low'.
     *
     * @platform linux,win32
     */
    var urgency: (NotificationConstructorOptionsUrgency)?

    /**
     * Actions to add to the notification. Please read the available actions and
     * limitations in the `NotificationAction` documentation.
     *
     * @platform darwin,win32
     */
    var actions: js.array.ReadonlyArray<NotificationAction>?

    /**
     * A custom title for the close button of an alert. An empty string will cause the
     * default localized text to be used.
     *
     * @platform darwin
     */
    var closeButtonText: String?

    /**
     * A custom description of the Notification on Windows superseding all properties
     * above. Provides full customization of design and behavior of the notification.
     *
     * @platform win32
     */
    var toastXml: String?
}
