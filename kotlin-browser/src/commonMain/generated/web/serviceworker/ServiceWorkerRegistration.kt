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
     * The **`active`** read-only property of the This property is initially set to `null`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/active)
     */
    val active: ServiceWorker?

    /**
     * The **`installing`** read-only property of the initially set to `null`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/installing)
     */
    val installing: ServiceWorker?

    /**
     * The **`navigationPreload`** read-only property of the ServiceWorkerRegistration interface returns the NavigationPreloadManager associated with the current service worker registration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/navigationPreload)
     */
    val navigationPreload: NavigationPreloadManager

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updatefound_event)
     */
    var onupdatefound: EventHandler<Event, ServiceWorkerRegistration, ServiceWorkerRegistration>?

    /**
     * The **`pushManager`** read-only property of the support for subscribing, getting an active subscription, and accessing push permission status.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/pushManager)
     */
    val pushManager: PushManager

    /**
     * The **`scope`** read-only property of the ServiceWorkerRegistration interface returns a string representing a URL that defines a service worker's registration scope; that is, the range of URLs a service worker can control.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/scope)
     */
    val scope: String

    /**
     * The **`updateViaCache`** read-only property of the ServiceWorkerRegistration interface returns the value of the setting used to determine the circumstances in which the browser will consult the HTTP cache when it tries to update the service worker or any scripts that are imported via WorkerGlobalScope.importScripts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updateViaCache)
     */
    val updateViaCache: ServiceWorkerUpdateViaCache

    /**
     * The **`waiting`** read-only property of the set to `null`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/waiting)
     */
    val waiting: ServiceWorker?

    /**
     * The **`getNotifications()`** method of the ServiceWorkerRegistration interface returns a list of the notifications in the order that they were created from the current origin via the current service worker registration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/getNotifications)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getNotifications(filter: GetNotificationOptions = definedExternally): ReadonlyArray<Notification>

    @JsName("getNotifications")
    fun getNotificationsAsync(filter: GetNotificationOptions = definedExternally): Promise<ReadonlyArray<Notification>>

    /**
     * The **`showNotification()`** method of the service worker.
     *
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
     * The **`unregister()`** method of the registration and returns a Promise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/unregister)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun unregister(): Boolean

    @JsName("unregister")
    fun unregisterAsync(): Promise<JsBoolean>

    /**
     * The **`update()`** method of the worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/update)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun update(): ServiceWorkerRegistration

    @JsName("update")
    fun updateAsync(): Promise<ServiceWorkerRegistration>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updatefound_event)
     */
    @JsEvent("updatefound")
    val updateFoundEvent: EventInstance<Event, ServiceWorkerRegistration /* this */, ServiceWorkerRegistration /* this */>
}
