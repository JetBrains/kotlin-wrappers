// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/action)
     */
    val action: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/notification)
     */
    val notification: Notification

    @JsAlias(THIS)
    override fun asInit(): NotificationEventInit

    companion object {
        @JsValue("notificationclick")
        val NOTIFICATION_CLICK: EventType<NotificationEvent>

        @JsValue("notificationclose")
        val NOTIFICATION_CLOSE: EventType<NotificationEvent>
    }
}
