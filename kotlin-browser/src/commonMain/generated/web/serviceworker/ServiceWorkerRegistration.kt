// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.JsBoolean
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*
import web.notifications.Notification
import web.notifications.NotificationOptions
import web.push.PushManager
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`ServiceWorkerRegistration`** interface of the Service Worker API represents the service worker registration.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration)
 */
external class ServiceWorkerRegistration
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/active)
     */
    val active: ServiceWorker?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/installing)
     */
    val installing: ServiceWorker?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/navigationPreload)
     */
    val navigationPreload: NavigationPreloadManager

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updatefound_event)
     */
    var onupdatefound: EventHandler<Event, ServiceWorkerRegistration, ServiceWorkerRegistration>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/pushManager)
     */
    val pushManager: PushManager

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/scope)
     */
    val scope: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updateViaCache)
     */
    val updateViaCache: ServiceWorkerUpdateViaCache

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/waiting)
     */
    val waiting: ServiceWorker?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/getNotifications)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getNotifications(filter: GetNotificationOptions = definedExternally): ReadonlyArray<Notification>

    @JsName("getNotifications")
    fun getNotificationsAsync(filter: GetNotificationOptions = definedExternally): Promise<ReadonlyArray<Notification>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/showNotification)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun showNotification(
        title: String,
        options: NotificationOptions = definedExternally,
    )

    @JsName("showNotification")
    fun showNotificationAsync(
        title: String,
        options: NotificationOptions = definedExternally,
    ): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/unregister)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun unregister(): Boolean

    @JsName("unregister")
    fun unregisterAsync(): Promise<JsBoolean>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/update)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun update()

    @JsName("update")
    fun updateAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updatefound_event)
     */
    @JsEvent("updatefound")
    val updateFoundEvent: EventInstance<Event, ServiceWorkerRegistration /* this */, ServiceWorkerRegistration /* this */>
}
