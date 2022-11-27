// Automatically generated - do not modify!

package serviceworkers

import js.core.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent
import web.url.URL
import kotlin.js.Promise

sealed external class ServiceWorkerContainer :
    EventTarget {
    val controller: ServiceWorker?
    var oncontrollerchange: EventHandler<Event>?
    var onmessage: EventHandler<MessageEvent<*>>?
    var onmessageerror: EventHandler<MessageEvent<*>>?
    val ready: Promise<ServiceWorkerRegistration>
    fun getRegistration(clientURL: String = definedExternally): Promise<ServiceWorkerRegistration?>
    fun getRegistration(clientURL: URL): Promise<ServiceWorkerRegistration?>
    fun getRegistrations(): Promise<ReadonlyArray<ServiceWorkerRegistration>>
    fun register(
        scriptURL: String,
        options: RegistrationOptions = definedExternally,
    ): Promise<ServiceWorkerRegistration>

    fun register(
        scriptURL: URL,
        options: RegistrationOptions = definedExternally,
    ): Promise<ServiceWorkerRegistration>

    fun startMessages()
}
