// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventType

sealed external class NotificationEventTypes_deprecated {

    @JsValue("notificationclick")
    fun notificationClick(): EventType<NotificationEvent>

    @JsValue("notificationclose")
    fun notificationClose(): EventType<NotificationEvent>
}
