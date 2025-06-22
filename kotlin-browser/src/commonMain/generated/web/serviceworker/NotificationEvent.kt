// Automatically generated - do not modify!

package web.serviceworker

import js.reflect.unsafeCast
import seskar.js.JsValue
import web.events.EventType
import web.notifications.Notification

/**
 * The **`NotificationEvent`** interface of the Notifications API represents a notification event dispatched on the ServiceWorkerGlobalScope of a ServiceWorker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent)
 */
open external class NotificationEvent(
    override val type: EventType<NotificationEvent>,
    init: NotificationEventInit,
) : ExtendableEvent {
    /**
     * The **`action`** read-only property of the NotificationEvent interface returns the string ID of the notification button the user clicked.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/action)
     */
    val action: String

    /**
     * The **`notification`** read-only property of the NotificationEvent interface returns the instance of the Notification that was clicked to fire the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/notification)
     */
    val notification: Notification

    companion object {
        @JsValue("notificationclick")
        val NOTIFICATION_CLICK: EventType<NotificationEvent>

        @JsValue("notificationclose")
        val NOTIFICATION_CLOSE: EventType<NotificationEvent>
    }
}

inline fun NotificationEvent.asInit(): NotificationEventInit =
    unsafeCast(this)
