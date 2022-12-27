// Automatically generated - do not modify!

package serviceworkers

import web.events.EventType
import web.notifications.Notification

external interface NotificationEventInit : ExtendableEventInit {
    var action: String?
    var notification: Notification
}

open external class NotificationEvent(
    type: EventType<NotificationEvent>,
    init: NotificationEventInit,
) : ExtendableEvent {
    val action: String
    val notification: Notification

    companion object
}
