// Automatically generated - do not modify!

package web.serviceworker

import kotlinx.js.JsPlainObject
import web.notifications.Notification

@JsPlainObject
external interface NotificationEventInit :
    ExtendableEventInit {
    val action: String?
    val notification: Notification
}
