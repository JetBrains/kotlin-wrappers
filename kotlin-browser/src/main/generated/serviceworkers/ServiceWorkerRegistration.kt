// Automatically generated - do not modify!

package serviceworkers

import js.core.ReadonlyArray
import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.notifications.Notification
import web.notifications.NotificationOptions
import kotlin.js.Promise

sealed external class ServiceWorkerRegistration :
    EventTarget {
    val active: ServiceWorker?
    val installing: ServiceWorker?
    val navigationPreload: NavigationPreloadManager
    var onupdatefound: EventHandler<Event>?
    val pushManager: Any /* PushManager */
    val scope: String
    val updateViaCache: ServiceWorkerUpdateViaCache
    val waiting: ServiceWorker?
    fun getNotifications(filter: GetNotificationOptions = definedExternally): Promise<ReadonlyArray<Notification>>
    fun showNotification(
        title: String,
        options: NotificationOptions = definedExternally,
    ): Promise<Void>

    fun unregister(): Promise<Boolean>
    fun update(): Promise<Void>
}
