// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.EventTarget
import web.events.EventType
import web.notifications.Notification

/**
 * The parameter passed into the onnotificationclick handler, the NotificationEvent interface represents a notification click event that is dispatched on the ServiceWorkerGlobalScope of a ServiceWorker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent)
 */
open external class NotificationEvent(
    override val type: EventType<NotificationEvent, EventTarget>,
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

    companion object : NotificationEventTypes
}
