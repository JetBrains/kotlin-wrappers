// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import js.promise.Promise
import web.events.Event
import web.events.EventHandler
import web.messaging.MessageEvent
import web.push.PushEvent
import web.workers.WorkerGlobalScope

sealed external class ServiceWorkerGlobalScope :
    WorkerGlobalScope {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/clients) */
    val clients: Clients

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/activate_event) */
    var onactivate: EventHandler<ExtendableEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/fetch_event) */
    var onfetch: EventHandler<FetchEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/install_event) */
    var oninstall: EventHandler<ExtendableEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/message_event) */
    var onmessage: EventHandler<ExtendableMessageEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/messageerror_event) */
    var onmessageerror: EventHandler<MessageEvent<*>>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclick_event) */
    var onnotificationclick: EventHandler<NotificationEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclose_event) */
    var onnotificationclose: EventHandler<NotificationEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/push_event) */
    var onpush: EventHandler<PushEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/pushsubscriptionchange_event) */
    var onpushsubscriptionchange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/registration) */
    val registration: ServiceWorkerRegistration

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/serviceWorker) */
    val serviceWorker: ServiceWorker

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/skipWaiting) */
    fun skipWaiting(): Promise<Void>
}
