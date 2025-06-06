// Automatically generated - do not modify!

package web.serviceworker

import js.core.JsAny
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.cookie.CookieStore
import web.cookie.ExtendableCookieChangeEvent
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
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
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun skipWaiting()

    @JsName("skipWaiting")
    fun skipWaitingAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/activate_event)
     */
    @JsEvent("activate")
    val activateEvent: EventInstance<ExtendableEvent, ServiceWorkerGlobalScope /* this */, ServiceWorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/fetch_event)
     */
    @JsEvent("fetch")
    val fetchEvent: EventInstance<FetchEvent, ServiceWorkerGlobalScope /* this */, ServiceWorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/message_event)
     */
    @JsEvent("message")
    val messageEvent: EventInstance<ExtendableMessageEvent, ServiceWorkerGlobalScope /* this */, ServiceWorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/messageerror_event)
     */
    @JsEvent("messageerror")
    val messageErrorEvent: EventInstance<MessageEvent<JsAny?>, ServiceWorkerGlobalScope /* this */, ServiceWorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclick_event)
     */
    @JsEvent("notificationclick")
    val notificationClickEvent: EventInstance<NotificationEvent, ServiceWorkerGlobalScope /* this */, ServiceWorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclose_event)
     */
    @JsEvent("notificationclose")
    val notificationCloseEvent: EventInstance<NotificationEvent, ServiceWorkerGlobalScope /* this */, ServiceWorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/push_event)
     */
    @JsEvent("push")
    val pushEvent: EventInstance<PushEvent, ServiceWorkerGlobalScope /* this */, ServiceWorkerGlobalScope /* this */>
}
