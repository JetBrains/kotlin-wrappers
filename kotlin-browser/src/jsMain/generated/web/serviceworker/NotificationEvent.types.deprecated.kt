// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external class NotificationEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("NotificationEvent.NOTIFICATION_CLICK"),
    )
    @JsValue("notificationclick")
    fun notificationClick(): EventType<NotificationEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("NotificationEvent.NOTIFICATION_CLOSE"),
    )
    @JsValue("notificationclose")
    fun notificationClose(): EventType<NotificationEvent>
}
