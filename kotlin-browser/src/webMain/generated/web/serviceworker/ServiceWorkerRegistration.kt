// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.cookie.CookieStoreManager
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.notifications.Notification
import web.notifications.NotificationOptions
import web.push.PushManager
import kotlin.js.JsBoolean
import kotlin.js.JsName
import kotlin.js.definedExternally
import kotlin.js.toBoolean

/**
 * The **`ServiceWorkerRegistration`** interface of the Service Worker API represents the service worker registration.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration)
 */
open external class ServiceWorkerRegistration
private constructor() :
    EventTarget {
    /**
     * The **`active`** read-only property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state is `activating` or `activated`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/active)
     */
    val active: ServiceWorker?

    /**
     * The **`cookies`** read-only property of the ServiceWorkerRegistration interface returns a reference to the CookieStoreManager interface, which enables a web app to subscribe to and unsubscribe from cookie change events in a service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/cookies)
     */
    val cookies: CookieStoreManager

    /**
     * The **`installing`** read-only property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state is `installing`.
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
     * The **`pushManager`** read-only property of the ServiceWorkerRegistration interface returns a reference to the PushManager interface for managing push subscriptions; this includes support for subscribing, getting an active subscription, and accessing push permission status.
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
     * The **`waiting`** read-only property of the ServiceWorkerRegistration interface returns a service worker whose ServiceWorker.state is `installed`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/waiting)
     */
    val waiting: ServiceWorker?

    /**
     * The **`getNotifications()`** method of the ServiceWorkerRegistration interface returns a list of the notifications in the order that they were created from the current origin via the current service worker registration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/getNotifications)
     */
    @JsName("getNotifications")
    fun getNotificationsAsync(filter: GetNotificationOptions = definedExternally): Promise<ReadonlyArray<Notification>>

    /**
     * The **`showNotification()`** method of the ServiceWorkerRegistration interface creates a notification on an active service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/showNotification)
     */
    @JsName("showNotification")
    fun showNotificationAsync(
        title: String,
        options: NotificationOptions = definedExternally,
    ): Promise<Void>

    /**
     * The **`unregister()`** method of the ServiceWorkerRegistration interface unregisters the service worker registration and returns a Promise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/unregister)
     */
    @JsName("unregister")
    fun unregisterAsync(): Promise<JsBoolean>

    /**
     * The **`update()`** method of the ServiceWorkerRegistration interface attempts to update the service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/update)
     */
    @JsName("update")
    fun updateAsync(): Promise<ServiceWorkerRegistration>
}

/**
 * The **`getNotifications()`** method of the ServiceWorkerRegistration interface returns a list of the notifications in the order that they were created from the current origin via the current service worker registration.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/getNotifications)
 */
suspend inline fun ServiceWorkerRegistration.getNotifications(filter: GetNotificationOptions): ReadonlyArray<Notification> {
    return getNotificationsAsync(
        filter = filter,
    ).await()
}

/**
 * The **`getNotifications()`** method of the ServiceWorkerRegistration interface returns a list of the notifications in the order that they were created from the current origin via the current service worker registration.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/getNotifications)
 */
suspend inline fun ServiceWorkerRegistration.getNotifications(): ReadonlyArray<Notification> {
    return getNotificationsAsync().await()
}

/**
 * The **`showNotification()`** method of the ServiceWorkerRegistration interface creates a notification on an active service worker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/showNotification)
 */
suspend inline fun ServiceWorkerRegistration.showNotification(
    title: String,
    options: NotificationOptions,
) {
    showNotificationAsync(
        title = title,
        options = options,
    ).await()
}

/**
 * The **`showNotification()`** method of the ServiceWorkerRegistration interface creates a notification on an active service worker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/showNotification)
 */
suspend inline fun ServiceWorkerRegistration.showNotification(
    title: String,
) {
    showNotificationAsync(
        title = title,
    ).await()
}

/**
 * The **`unregister()`** method of the ServiceWorkerRegistration interface unregisters the service worker registration and returns a Promise.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/unregister)
 */
suspend inline fun ServiceWorkerRegistration.unregister(): Boolean {
    return unregisterAsync().await().toBoolean()
}

/**
 * The **`update()`** method of the ServiceWorkerRegistration interface attempts to update the service worker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/update)
 */
suspend inline fun ServiceWorkerRegistration.update(): ServiceWorkerRegistration {
    return updateAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updatefound_event)
 */
inline val <C : ServiceWorkerRegistration> C.updateFoundEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "updatefound")
