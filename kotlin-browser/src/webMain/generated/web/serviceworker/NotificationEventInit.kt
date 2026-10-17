// Automatically generated - do not modify!

package web.serviceworker

import kotlinx.js.JsPlainObject
import web.notifications.Notification

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/NotificationEvent#options)
 */
@JsPlainObject
external interface NotificationEventInit :
    ExtendableEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/NotificationEvent#action)
     */
    var action: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/NotificationEvent#notification)
     */
    var notification: Notification
}
