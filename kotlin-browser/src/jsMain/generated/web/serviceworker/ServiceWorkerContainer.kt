// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync
import web.events.*
import web.messaging.MessageEvent
import web.url.URL

/**
 * The ServiceWorkerContainer interface of the ServiceWorker API provides an object representing the service worker as an overall unit in the network ecosystem, including facilities to register, unregister and update service workers, and access the state of service workers and their registrations.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer)
 */
sealed external class ServiceWorkerContainer :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/controller)
     */
    val controller: ServiceWorker?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/controllerchange_event)
     */
    var oncontrollerchange: EventHandler<Event, ServiceWorkerContainer, ServiceWorkerContainer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, ServiceWorkerContainer, ServiceWorkerContainer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/messageerror_event)
     */
    var onmessageerror: EventHandler<MessageEvent<*>, ServiceWorkerContainer, ServiceWorkerContainer>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/ready)
     */
    val ready: Promise<ServiceWorkerRegistration>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistration)
     */
    @JsAsync
    suspend fun getRegistration(clientURL: String = definedExternally): ServiceWorkerRegistration?

    @JsName("getRegistration")
    fun getRegistrationAsync(clientURL: String = definedExternally): Promise<ServiceWorkerRegistration?>

    @JsAsync
    suspend fun getRegistration(clientURL: URL): ServiceWorkerRegistration?

    @JsName("getRegistration")
    fun getRegistrationAsync(clientURL: URL): Promise<ServiceWorkerRegistration?>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistrations)
     */
    @JsAsync
    suspend fun getRegistrations(): ReadonlyArray<ServiceWorkerRegistration>

    @JsName("getRegistrations")
    fun getRegistrationsAsync(): Promise<ReadonlyArray<ServiceWorkerRegistration>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/register)
     */
    @JsAsync
    suspend fun register(
        scriptURL: String,
        options: RegistrationOptions = definedExternally,
    ): ServiceWorkerRegistration

    @JsName("register")
    fun registerAsync(
        scriptURL: String,
        options: RegistrationOptions = definedExternally,
    ): Promise<ServiceWorkerRegistration>

    @JsAsync
    suspend fun register(
        scriptURL: URL,
        options: RegistrationOptions = definedExternally,
    ): ServiceWorkerRegistration

    @JsName("register")
    fun registerAsync(
        scriptURL: URL,
        options: RegistrationOptions = definedExternally,
    ): Promise<ServiceWorkerRegistration>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/startMessages)
     */
    fun startMessages()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/controllerchange_event)
     */
    @JsEvent("controllerchange")
    val controllerChangeEvent: EventInstance<Event, ServiceWorkerContainer /* this */, ServiceWorkerContainer /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/message_event)
     */
    @JsEvent("message")
    val messageEvent: EventInstance<MessageEvent<Any?>, ServiceWorkerContainer /* this */, ServiceWorkerContainer /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/messageerror_event)
     */
    @JsEvent("messageerror")
    val messageErrorEvent: EventInstance<MessageEvent<Any?>, ServiceWorkerContainer /* this */, ServiceWorkerContainer /* this */>
}
