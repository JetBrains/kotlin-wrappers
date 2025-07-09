// Automatically generated - do not modify!

package web.serviceworker

import js.core.JsAny
import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import web.cookie.CookieStore
import web.cookie.ExtendableCookieChangeEvent
import web.events.EventHandler
import web.events.EventInstance
import web.messaging.MessageEvent
import web.push.PushEvent
import web.push.PushSubscriptionChangeEvent
import web.workers.WorkerGlobalScope
import kotlin.js.JsName

/**
 * The **`ServiceWorkerGlobalScope`** interface of the Service Worker API represents the global execution context of a service worker.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope)
 */
external class ServiceWorkerGlobalScope
private constructor() :
    WorkerGlobalScope {
    /**
     * The **`clients`** read-only property of the object associated with the service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/clients)
     */
    val clients: Clients

    /**
     * The **`cookieStore`** read-only property of the ServiceWorkerGlobalScope interface returns a reference to the CookieStore object associated with this service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/cookieStore)
     */
    val cookieStore: CookieStore

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/activate_event)
     */
    var onactivate: EventHandler<ExtendableEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/cookiechange_event)
     */
    var oncookiechange: EventHandler<ExtendableCookieChangeEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/fetch_event)
     */
    var onfetch: EventHandler<FetchEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/install_event)
     */
    var oninstall: EventHandler<ExtendableEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/message_event)
     */
    var onmessage: EventHandler<ExtendableMessageEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/messageerror_event)
     */
    var onmessageerror: EventHandler<MessageEvent<*>, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclick_event)
     */
    var onnotificationclick: EventHandler<NotificationEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclose_event)
     */
    var onnotificationclose: EventHandler<NotificationEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/push_event)
     */
    var onpush: EventHandler<PushEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/pushsubscriptionchange_event)
     */
    var onpushsubscriptionchange: EventHandler<PushSubscriptionChangeEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * The **`registration`** read-only property of the ServiceWorkerGlobalScope interface returns a reference to the ServiceWorkerRegistration object, which represents the service worker's registration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/registration)
     */
    val registration: ServiceWorkerRegistration

    /**
     * The **`serviceWorker`** read-only property of the ServiceWorkerGlobalScope interface returns a reference to the ServiceWorker object, which represents the service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/serviceWorker)
     */
    val serviceWorker: ServiceWorker

    /**
     * The **`skipWaiting()`** method of the ServiceWorkerGlobalScope interface forces the waiting service worker to become the active service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/skipWaiting)
     */
    @JsName("skipWaiting")
    fun skipWaitingAsync(): Promise<Void>
}

/**
 * The **`skipWaiting()`** method of the ServiceWorkerGlobalScope interface forces the waiting service worker to become the active service worker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/skipWaiting)
 */
suspend inline fun ServiceWorkerGlobalScope.skipWaiting() {
    awaitPromiseLike(skipWaitingAsync())
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/activate_event)
 */
inline val ServiceWorkerGlobalScope.activateEvent: EventInstance<ExtendableEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>
    get() = EventInstance(this, "activate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/fetch_event)
 */
inline val ServiceWorkerGlobalScope.fetchEvent: EventInstance<FetchEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>
    get() = EventInstance(this, "fetch")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/message_event)
 */
inline val ServiceWorkerGlobalScope.messageEvent: EventInstance<ExtendableMessageEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/messageerror_event)
 */
inline val ServiceWorkerGlobalScope.messageErrorEvent: EventInstance<MessageEvent<JsAny?>, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>
    get() = EventInstance(this, "messageerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclick_event)
 */
inline val ServiceWorkerGlobalScope.notificationClickEvent: EventInstance<NotificationEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>
    get() = EventInstance(this, "notificationclick")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclose_event)
 */
inline val ServiceWorkerGlobalScope.notificationCloseEvent: EventInstance<NotificationEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>
    get() = EventInstance(this, "notificationclose")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/push_event)
 */
inline val ServiceWorkerGlobalScope.pushEvent: EventInstance<PushEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>
    get() = EventInstance(this, "push")
