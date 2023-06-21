// Automatically generated - do not modify!

package web.serviceworker

import js.core.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent
import web.url.URL
import kotlin.js.Promise

sealed external class ServiceWorkerContainer :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/controller) */
    val controller: ServiceWorker?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/controllerchange_event) */
    var oncontrollerchange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/message_event) */
    var onmessage: EventHandler<MessageEvent<*>>?
    var onmessageerror: EventHandler<MessageEvent<*>>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/ready) */
    val ready: Promise<ServiceWorkerRegistration>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistration) */
    fun getRegistration(clientURL: String = definedExternally): Promise<ServiceWorkerRegistration?>
    fun getRegistration(clientURL: URL): Promise<ServiceWorkerRegistration?>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistrations) */
    fun getRegistrations(): Promise<ReadonlyArray<ServiceWorkerRegistration>>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/register) */
    fun register(
        scriptURL: String,
        options: RegistrationOptions = definedExternally,
    ): Promise<ServiceWorkerRegistration>

    fun register(
        scriptURL: URL,
        options: RegistrationOptions = definedExternally,
    ): Promise<ServiceWorkerRegistration>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/startMessages) */
    fun startMessages()
}
