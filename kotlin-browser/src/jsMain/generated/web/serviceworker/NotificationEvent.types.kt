// Automatically generated - do not modify!

package web.serviceworker

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class NotificationEventTypes :
    NotificationEventTypes_deprecated {

    @JsValue("notificationclick")
    fun <C : EventTarget> notificationClick(): EventType<NotificationEvent<C>>

    @JsValue("notificationclose")
    fun <C : EventTarget> notificationClose(): EventType<NotificationEvent<C>>
}
