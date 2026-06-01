// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter as NodeEventEmitter

open external class Notification : NodeEventEmitter {
    /**
     * Notification
     */
    constructor (options: NotificationConstructorOptions = definedExternally)
// Docs: https://electronjs.org/docs/api/notification
    /**
     * @platform darwin,win32
     */

    /**
     * Emitted when the notification is clicked by the user.
     */

    /**
     * Emitted when the notification is closed by manual intervention from the user.
     *
     * This event is not guaranteed to be emitted in all cases where the notification
     * is closed.
     *
     * On Windows, the `close` event can be emitted in one of three ways: programmatic
     * dismissal with `notification.close()`, by the user closing the notification, or
     * via system timeout. If a notification is in the Action Center after the initial
     * `close` event is emitted, a call to `notification.close()` will remove the
     * notification from the action center but the `close` event will not be emitted
     * again.
     */

    /**
     * Emitted when an error is encountered while creating and showing the native
     * notification.
     *
     * @platform darwin,win32
     */

    /**
     * Emitted when the user clicks the "Reply" button on a notification with
     * `hasReply: true`.
     *
     * @platform darwin,win32
     */

    /**
     * Emitted when the notification is shown to the user. Note that this event can be
     * fired multiple times as a notification can be shown multiple times through the
     * `show()` method.
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * @platform darwin,win32
     */

    /**
     * Dismisses the notification.
     *
     * On Windows, calling `notification.close()` while the notification is visible on
     * screen will dismiss the notification and remove it from the Action Center. If
     * `notification.close()` is called after the notification is no longer visible on
     * screen, calling `notification.close()` will try remove it from the Action
     * Center.
     */
    fun close()

    /**
     * Immediately shows the notification to the user. Unlike the web notification API,
     * instantiating a `new Notification()` does not immediately show it to the user.
     * Instead, you need to call this method before the OS will display it.
     *
     * If the notification has been shown before, this method will dismiss the
     * previously shown notification and create a new one with identical properties.
     *
     * On macOS, calling `show()` on a notification returned by
     * `Notification.getHistory()` will remove the original notification from
     * Notification Center and post a new one with the same properties.
     */
    fun show()

    /**
     * A `NotificationAction[]` property representing the actions of the notification.
     */
    var actions: js.array.ReadonlyArray<NotificationAction>

    /**
     * A `string` property representing the body of the notification.
     */
    var body: String

    /**
     * A `string` property representing the close button text of the notification.
     */
    var closeButtonText: String

    /**
     * A `string` property representing the group identifier of the notification.
     * Notifications with the same `groupId` will be visually grouped together in
     * Notification Center (macOS) or Action Center (Windows).
     *
     * @platform darwin,win32
     */
    val groupId: String

    /**
     * A `string` property representing the title of the notification group header.
     *
     * @platform win32
     */
    val groupTitle: String

    /**
     * A `boolean` property representing whether the notification has a reply action.
     */
    var hasReply: Boolean

    /**
     * A `string` property representing the unique identifier of the notification. This
     * is set at construction time — either from the `id` option or as a generated UUID
     * if none was provided.
     *
     * @platform darwin,win32
     */
    val id: String

    /**
     * A `string` property representing the reply placeholder of the notification.
     */
    var replyPlaceholder: String

    /**
     * A `boolean` property representing whether the notification is silent.
     */
    var silent: Boolean

    /**
     * A `string` property representing the sound of the notification.
     */
    var sound: String

    /**
     * A `string` property representing the subtitle of the notification.
     */
    var subtitle: String

    /**
     * A `string` property representing the type of timeout duration for the
     * notification. Can be 'default' or 'never'.
     *
     * If `timeoutType` is set to 'never', the notification never expires. It stays
     * open until closed by the calling API or the user.
     *
     * @platform linux,win32
     */
    var timeoutType: (NotificationTimeoutType)

    /**
     * A `string` property representing the title of the notification.
     */
    var title: String

    /**
     * A `string` property representing the custom Toast XML of the notification.
     *
     * @platform win32
     */
    var toastXml: String

    /**
     * A `string` property representing the urgency level of the notification. Can be
     * 'normal', 'critical', or 'low'.
     *
     * Default is 'low' - see NotifyUrgency for more information.
     *
     * @platform linux
     */
    var urgency: (NotificationUrgency)

    @web.events.JsEvent("action")
    val actionEvent: node.events.EventInstance<js.array.Tuple3<Event<NotificationActionEventParams>, Double, Double>>

    @web.events.JsEvent("click")
    val clickEvent: node.events.EventInstance<js.array.Tuple1<Event<*>>>

    @web.events.JsEvent("close")
    val closeEvent: node.events.EventInstance<js.array.Tuple1<Event<NotificationCloseEventParams>>>

    @web.events.JsEvent("failed")
    val failedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("reply")
    val replyEvent: node.events.EventInstance<js.array.Tuple2<Event<NotificationReplyEventParams>, String>>

    @web.events.JsEvent("show")
    val showEvent: node.events.EventInstance<js.array.Tuple1<Event<*>>>

    companion object {
        /**
         * Resolves with an array of `Notification` objects representing all delivered
         * notifications still present in Notification Center.
         *
         * Each returned `Notification` is a live object connected to the corresponding
         * delivered notification. Interaction events (`click`, `reply`, `action`, `close`)
         * will fire on these objects when the user interacts with the notification in
         * Notification Center. This is useful after an app restart to re-attach event
         * handlers to notifications from a previous session.
         *
         * The returned notifications have their `id`, `groupId`, `title`, `subtitle`, and
         * `body` properties populated from information available in the Notification
         * Center. Other properties (e.g., `actions`, `silent`, `icon`) are not available
         * from delivered notifications and will have default values.
         *
         * > [!NOTE] Like all macOS notification APIs, this method requires the application
         * to be code-signed. In unsigned development builds, notifications are not
         * delivered to Notification Center and this method will resolve with an empty
         * array.
         *
         * > [!NOTE] Unlike notifications created with `new Notification()`, notifications
         * returned by `getHistory()` will remain visible in Notification Center when the
         * object is garbage collected. Calling `show()` on a restored notification will
         * remove the original from Notification Center and post a new one with the same
         * properties.
         *
         * @platform darwin
         */
        fun getHistory(): js.promise.Promise<js.array.ReadonlyArray<Notification>>

        /**
         * Registers a callback to handle all notification activations. The callback is
         * invoked whenever a notification is clicked, replied to, or has an action button
         * pressed - regardless of whether the original `Notification` object is still in
         * memory.
         *
         * This method handles timing automatically:
         *
         * * If an activation already occurred before calling this method, the callback is
         * invoked immediately with those details.
         * * For all subsequent activations, the callback is invoked when they occur.
         *
         * The callback remains registered until replaced by another call to
         * `handleActivation`.
         *
         * This provides a centralized way to handle notification interactions that works
         * in all scenarios:
         *
         * * Cold start (app launched from notification click)
         * * Notifications persisted in AC that have no in-memory representation after app
         * re-start
         * * Notification object was garbage collected
         * * Notification object is still in memory (callback is invoked in addition to
         * instance events)
         *
         * @platform win32
         */
        fun handleActivation(callback: (details: ActivationArguments) -> Unit)

        /**
         * Whether or not desktop notifications are supported on the current system
         */
        fun isSupported(): Boolean

        /**
         * Removes one or more delivered notifications from Notification Center by their
         * identifier(s).
         *
         * @platform darwin
         */
        fun remove(id: String)

        /**
         * Removes one or more delivered notifications from Notification Center by their
         * identifier(s).
         *
         * @platform darwin
         */
        fun remove(id: js.array.ReadonlyArray<String>)

        /**
         * Removes all of the app's delivered notifications from Notification Center.
         *
         * @platform darwin
         */
        fun removeAll()

        /**
         * Removes all delivered notifications with the given `groupId` from Notification
         * Center.
         *
         * @platform darwin
         */
        fun removeGroup(groupId: String)
    }
}
