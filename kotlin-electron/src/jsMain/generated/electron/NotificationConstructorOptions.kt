package electron


external interface NotificationConstructorOptions {
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
     * An icon to use in the notification.
     */
    var icon: Any /* (string) | (NativeImage) */?

    /**
     * Whether or not to add an inline reply option to the notification.
     *
     * @platform darwin
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
     * @platform darwin
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
     * @platform linux
     */
    var urgency: (NotificationConstructorOptionsUrgency)?

    /**
     * Actions to add to the notification. Please read the available actions and
     * limitations in the `NotificationAction` documentation.
     *
     * @platform darwin
     */
    var actions: js.core.ReadonlyArray<NotificationAction>?

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
