// Automatically generated - do not modify!

package web.serviceworker

import js.core.ReadonlyArray
import js.core.Void
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.notifications.Notification
import web.notifications.NotificationOptions
import web.push.PushManager
import kotlin.js.Promise

/**
 * This ServiceWorker API interface represents the service worker registration. You register a service worker to control one or more pages that share the same origin.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration)
 */
sealed external class ServiceWorkerRegistration :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/active) */
    val active: ServiceWorker?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/installing) */
    val installing: ServiceWorker?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/navigationPreload) */
    val navigationPreload: NavigationPreloadManager

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updatefound_event) */
    var onupdatefound: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/pushManager) */
    val pushManager: PushManager

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/scope) */
    val scope: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updateViaCache) */
    val updateViaCache: ServiceWorkerUpdateViaCache

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/waiting) */
    val waiting: ServiceWorker?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/getNotifications) */
    fun getNotifications(filter: GetNotificationOptions = definedExternally): Promise<ReadonlyArray<Notification>>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/showNotification) */
    fun showNotification(
        title: String,
        options: NotificationOptions = definedExternally,
    ): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/unregister) */
    fun unregister(): Promise<Boolean>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/update) */
    fun update(): Promise<Void>
}
