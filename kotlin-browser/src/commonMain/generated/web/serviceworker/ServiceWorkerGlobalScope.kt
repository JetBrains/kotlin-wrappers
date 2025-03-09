// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.cookie.CookieStore
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
import web.messaging.MessageEvent
import web.push.PushEvent
import web.workers.WorkerGlobalScope

/**
 * This ServiceWorker API interface represents the global execution context of a service worker.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope)
 */
external class ServiceWorkerGlobalScope
private constructor() :
    WorkerGlobalScope {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/clients)
     */
    val clients: Clients

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/cookieStore)
     */
    val cookieStore: CookieStore

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/activate_event)
     */
    var onactivate: EventHandler<ExtendableEvent, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

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
    var onpushsubscriptionchange: EventHandler<Event, ServiceWorkerGlobalScope, ServiceWorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/registration)
     */
    val registration: ServiceWorkerRegistration

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/serviceWorker)
     */
    val serviceWorker: ServiceWorker

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/skipWaiting)
     */
    @JsAsync
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
    val messageErrorEvent: EventInstance<MessageEvent<Any?>, ServiceWorkerGlobalScope /* this */, ServiceWorkerGlobalScope /* this */>

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
