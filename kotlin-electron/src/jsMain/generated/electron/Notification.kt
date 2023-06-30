@file:JsModule("electron/electron")

package electron

import node.events.EventEmitter as NodeEventEmitter


open external class Notification : NodeEventEmitter {
    // Docs: https://electronjs.org/docs/api/notification
    fun on(
        event: NotificationEvent.ACTION, listener: (
            event: Event,
            /**
             * The index of the action that was activated.
             */
            index: Double
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the notification is clicked by the user.
     */
    fun on(event: NotificationEvent.CLICK, listener: (event: Event) -> Unit): Unit /* this */

    /**
     * Emitted when the notification is closed by manual intervention from the user.
     *
     * This event is not guaranteed to be emitted in all cases where the notification
     * is closed.
     */
    fun on(event: NotificationEvent.CLOSE, listener: (event: Event) -> Unit): Unit /* this */

    /**
     * Emitted when an error is encountered while creating and showing the native
     * notification.
     *
     * @platform win32
     */
    fun on(
        event: NotificationEvent.FAILED, listener: (
            event: Event,
            /**
             * The error encountered during execution of the `show()` method.
             */
            error: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the user clicks the "Reply" button on a notification with
     * `hasReply: true`.
     *
     * @platform darwin
     */
    fun on(
        event: NotificationEvent.REPLY, listener: (
            event: Event,
            /**
             * The string the user entered into the inline reply field.
             */
            reply: String
        ) -> Unit
    ): Unit /* this */

    /**
     * Emitted when the notification is shown to the user. Note that this event can be
     * fired multiple times as a notification can be shown multiple times through the
     * `show()` method.
     */
    fun on(event: NotificationEvent.SHOW, listener: (event: Event) -> Unit): Unit /* this */
    fun once(
        event: NotificationEvent.ACTION, listener: (
            event: Event,
            /**
             * The index of the action that was activated.
             */
            index: Double
        ) -> Unit
    ): Unit /* this */

    fun once(event: NotificationEvent.CLICK, listener: (event: Event) -> Unit): Unit /* this */
    fun once(event: NotificationEvent.CLOSE, listener: (event: Event) -> Unit): Unit /* this */
    fun once(
        event: NotificationEvent.FAILED, listener: (
            event: Event,
            /**
             * The error encountered during execution of the `show()` method.
             */
            error: String
        ) -> Unit
    ): Unit /* this */

    fun once(
        event: NotificationEvent.REPLY, listener: (
            event: Event,
            /**
             * The string the user entered into the inline reply field.
             */
            reply: String
        ) -> Unit
    ): Unit /* this */

    fun once(event: NotificationEvent.SHOW, listener: (event: Event) -> Unit): Unit /* this */
    fun addListener(
        event: NotificationEvent.ACTION, listener: (
            event: Event,
            /**
             * The index of the action that was activated.
             */
            index: Double
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: NotificationEvent.CLICK, listener: (event: Event) -> Unit): Unit /* this */
    fun addListener(event: NotificationEvent.CLOSE, listener: (event: Event) -> Unit): Unit /* this */
    fun addListener(
        event: NotificationEvent.FAILED, listener: (
            event: Event,
            /**
             * The error encountered during execution of the `show()` method.
             */
            error: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(
        event: NotificationEvent.REPLY, listener: (
            event: Event,
            /**
             * The string the user entered into the inline reply field.
             */
            reply: String
        ) -> Unit
    ): Unit /* this */

    fun addListener(event: NotificationEvent.SHOW, listener: (event: Event) -> Unit): Unit /* this */
    fun removeListener(
        event: NotificationEvent.ACTION, listener: (
            event: Event,
            /**
             * The index of the action that was activated.
             */
            index: Double
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: NotificationEvent.CLICK, listener: (event: Event) -> Unit): Unit /* this */
    fun removeListener(event: NotificationEvent.CLOSE, listener: (event: Event) -> Unit): Unit /* this */
    fun removeListener(
        event: NotificationEvent.FAILED, listener: (
            event: Event,
            /**
             * The error encountered during execution of the `show()` method.
             */
            error: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(
        event: NotificationEvent.REPLY, listener: (
            event: Event,
            /**
             * The string the user entered into the inline reply field.
             */
            reply: String
        ) -> Unit
    ): Unit /* this */

    fun removeListener(event: NotificationEvent.SHOW, listener: (event: Event) -> Unit): Unit /* this */

    /**
     * Notification
     */
    constructor (options: NotificationConstructorOptions = definedExternally)

    /**
     * Dismisses the notification.
     */
    fun close(): Unit

    /**
     * Immediately shows the notification to the user. Unlike the web notification API,
     * instantiating a `new Notification()` does not immediately show it to the user.
     * Instead, you need to call this method before the OS will display it.
     *
     * If the notification has been shown before, this method will dismiss the
     * previously shown notification and create a new one with identical properties.
     */
    fun show(): Unit

    /**
     * A `NotificationAction[]` property representing the actions of the notification.
     */
    var actions: js.core.ReadonlyArray<NotificationAction>

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

    companion object {
        /**
         * Whether or not desktop notifications are supported on the current system
         */
        fun isSupported(): Boolean
    }

}
