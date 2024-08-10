// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class NotificationEventTypes {

    @JsValue("notificationclick")
    fun <C : EventTarget> notificationClick(): EventType<NotificationEvent, C>

    @JsValue("notificationclose")
    fun <C : EventTarget> notificationClose(): EventType<NotificationEvent, C>
}
