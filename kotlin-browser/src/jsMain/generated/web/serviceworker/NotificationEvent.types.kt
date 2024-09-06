// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external class NotificationEventTypes :
    NotificationEventTypes_deprecated {

    @JsValue("notificationclick")
    val NOTIFICATION_CLICK: EventType<NotificationEvent>

    @JsValue("notificationclose")
    val NOTIFICATION_CLOSE: EventType<NotificationEvent>
}
