// Automatically generated - do not modify!

package web.serviceworker

import web.notifications.Notification

external interface NotificationEventInit : ExtendableEventInit {
    val action: String?
    val notification: Notification
}
