// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import web.events.EventType
import web.notifications.Notification

/**
 * The parameter passed into the onnotificationclick handler, the NotificationEvent interface represents a notification click event that is dispatched on the ServiceWorkerGlobalScope of a ServiceWorker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent)
 */
open external class NotificationEvent(
    override val type: EventType<NotificationEvent>,
    init: NotificationEventInit,
) : ExtendableEvent,
    NotificationEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/action)
     */
    override val action: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/notification)
     */
    override val notification: Notification

    companion object : NotificationEventTypes
}
