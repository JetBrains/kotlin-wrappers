// Automatically generated - do not modify!

package web.serviceworker

import js.objects.JsPlainObject
import web.notifications.Notification

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/NotificationEvent/NotificationEvent#options)
 */
@JsPlainObject
external interface NotificationEventInit :
    ExtendableEventInit {
    var action: String?
    var notification: Notification
}
