// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import web.events.EventType
import web.notifications.Notification

external interface NotificationEventInit : ExtendableEventInit {
    var action: String?
    var notification: Notification
}

open external class NotificationEvent(
    override val type: EventType<NotificationEvent>,
    init: NotificationEventInit,
) : ExtendableEvent {
    val action: String
    val notification: Notification

    companion object
}
