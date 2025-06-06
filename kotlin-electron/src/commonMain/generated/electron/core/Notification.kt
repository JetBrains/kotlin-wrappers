// Generated by Karakum - do not modify it manually!

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
     * @platform darwin
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
     * @platform win32
     */

    /**
     * Emitted when the user clicks the "Reply" button on a notification with
     * `hasReply: true`.
     *
     * @platform darwin
     */

    /**
     * Emitted when the notification is shown to the user. Note that this event can be
     * fired multiple times as a notification can be shown multiple times through the
     * `show()` method.
     */

    /**
     * @platform darwin
     */

    /**
     * @platform win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform win32
     */

    /**
     * @platform darwin
     */

    /**
     * @platform darwin
     */

    /**
     * @platform win32
     */

    /**
     * @platform darwin
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
     * A `boolean` property representing whether the notification has a reply action.
     */
    var hasReply: Boolean

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
    val actionEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, Double>>

    @web.events.JsEvent("click")
    val clickEvent: node.events.EventInstance<js.array.Tuple1<Event<*>>>

    @web.events.JsEvent("close")
    val closeEvent: node.events.EventInstance<js.array.Tuple1<Event<*>>>

    @web.events.JsEvent("failed")
    val failedEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("reply")
    val replyEvent: node.events.EventInstance<js.array.Tuple2<Event<*>, String>>

    @web.events.JsEvent("show")
    val showEvent: node.events.EventInstance<js.array.Tuple1<Event<*>>>

    companion object {
        /**
         * Whether or not desktop notifications are supported on the current system
         */
        fun isSupported(): Boolean
    }
}
