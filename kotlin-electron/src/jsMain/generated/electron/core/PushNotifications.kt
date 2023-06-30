package electron.core

import kotlin.js.Promise


external interface PushNotifications : node.events.IEventEmitter {
// Docs: https://electronjs.org/docs/api/push-notifications
    /**
     * Emitted when the app receives a remote notification while running. See:
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * com/documentation/appkit/nsapplicationdelegate/1428430-application?language=objc
     *
     * @platform darwin
     */
    fun on(event: PushNotificationsEvent.RECEIVED_APNS_NOTIFICATION, listener: (event: Event, userInfo: js.core.ReadonlyRecord<String, Any>) -> Unit): Unit /* this */
    fun once(event: PushNotificationsEvent.RECEIVED_APNS_NOTIFICATION, listener: (event: Event, userInfo: js.core.ReadonlyRecord<String, Any>) -> Unit): Unit /* this */
    fun addListener(event: PushNotificationsEvent.RECEIVED_APNS_NOTIFICATION, listener: (event: Event, userInfo: js.core.ReadonlyRecord<String, Any>) -> Unit): Unit /* this */
    fun removeListener(event: PushNotificationsEvent.RECEIVED_APNS_NOTIFICATION, listener: (event: Event, userInfo: js.core.ReadonlyRecord<String, Any>) -> Unit): Unit /* this */

    /**
     * Registers the app with Apple Push Notification service (APNS) to receive Badge,
     * Sound, and Alert notifications. If registration is successful, the promise will
     * be resolved with the APNS device token. Otherwise, the promise will be rejected
     * with an error message. See:
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * tion/appkit/nsapplication/1428476-registerforremotenotificationtyp?language=objc
     *
     * @platform darwin
     */
    fun registerForAPNSNotifications(): Promise<String>

    /**
     * Unregisters the app from notifications received from APNS. See:
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * tion/appkit/nsapplication/1428747-unregisterforremotenotifications?language=objc
     *
     * @platform darwin
     */
    fun unregisterForAPNSNotifications(): Unit
}
