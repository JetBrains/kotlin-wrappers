// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.JsAny
import js.promise.Promise
import js.promise.await
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.messaging.MessageEvent
import web.url.URL
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`ServiceWorkerContainer`** interface of the Service Worker API provides an object representing the service worker as an overall unit in the network ecosystem, including facilities to register, unregister and update service workers, and access the state of service workers and their registrations.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer)
 */
external class ServiceWorkerContainer
private constructor() :
    EventTarget {
    /**
     * The **`controller`** read-only property of the ServiceWorkerContainer interface returns a `activated` (the same object returned by `null` if the request is a force refresh (_Shift_ + refresh) or if there is no active worker.
     *
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
     * The **`ready`** read-only property of the ServiceWorkerContainer interface provides a way of delaying code execution until a service worker is active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/ready)
     */
    val ready: Promise<ServiceWorkerRegistration>

    /**
     * The **`getRegistration()`** method of the client URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistration)
     */
    @JsName("getRegistration")
    fun getRegistrationAsync(clientURL: String = definedExternally): Promise<ServiceWorkerRegistration?>

    @JsName("getRegistration")
    fun getRegistrationAsync(clientURL: URL): Promise<ServiceWorkerRegistration?>

    /**
     * The **`getRegistrations()`** method of the `ServiceWorkerContainer`, in an array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistrations)
     */
    @JsName("getRegistrations")
    fun getRegistrationsAsync(): Promise<ReadonlyArray<ServiceWorkerRegistration>>

    /**
     * The **`register()`** method of the ServiceWorkerContainer interface creates or updates a ServiceWorkerRegistration for the given scope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/register)
     */
    @JsName("register")
    fun registerAsync(
        scriptURL: String,
        options: RegistrationOptions = definedExternally,
    ): Promise<ServiceWorkerRegistration>

    @JsName("register")
    fun registerAsync(
        scriptURL: URL,
        options: RegistrationOptions = definedExternally,
    ): Promise<ServiceWorkerRegistration>

    /**
     * The **`startMessages()`** method of the ServiceWorkerContainer interface explicitly starts the flow of messages being dispatched from a service worker to pages under its control (e.g., sent via Client.postMessage()).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/startMessages)
     */
    fun startMessages()
}

/**
 * The **`getRegistration()`** method of the client URL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistration)
 */
suspend inline fun ServiceWorkerContainer.getRegistration(clientURL: String): ServiceWorkerRegistration? {
    return getRegistrationAsync(clientURL = clientURL).await()
}

/**
 * The **`getRegistration()`** method of the client URL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistration)
 */
suspend inline fun ServiceWorkerContainer.getRegistration(): ServiceWorkerRegistration? {
    return getRegistrationAsync().await()
}

suspend inline fun ServiceWorkerContainer.getRegistration(clientURL: URL): ServiceWorkerRegistration? {
    return getRegistrationAsync(clientURL = clientURL).await()
}

/**
 * The **`getRegistrations()`** method of the `ServiceWorkerContainer`, in an array.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistrations)
 */
suspend inline fun ServiceWorkerContainer.getRegistrations(): ReadonlyArray<ServiceWorkerRegistration> {
    return getRegistrationsAsync().await()
}

/**
 * The **`register()`** method of the ServiceWorkerContainer interface creates or updates a ServiceWorkerRegistration for the given scope.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/register)
 */
suspend inline fun ServiceWorkerContainer.register(
    scriptURL: String,
    options: RegistrationOptions,
): ServiceWorkerRegistration {
    return registerAsync(
        scriptURL = scriptURL,
        options = options
    ).await()
}

/**
 * The **`register()`** method of the ServiceWorkerContainer interface creates or updates a ServiceWorkerRegistration for the given scope.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/register)
 */
suspend inline fun ServiceWorkerContainer.register(
    scriptURL: String,
): ServiceWorkerRegistration {
    return registerAsync(scriptURL = scriptURL).await()
}

suspend inline fun ServiceWorkerContainer.register(
    scriptURL: URL,
    options: RegistrationOptions,
): ServiceWorkerRegistration {
    return registerAsync(
        scriptURL = scriptURL,
        options = options
    ).await()
}

suspend inline fun ServiceWorkerContainer.register(
    scriptURL: URL,
): ServiceWorkerRegistration {
    return registerAsync(scriptURL = scriptURL).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/controllerchange_event)
 */
inline val ServiceWorkerContainer.controllerChangeEvent: EventInstance<Event, ServiceWorkerContainer, ServiceWorkerContainer>
    get() = EventInstance(this, "controllerchange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/message_event)
 */
inline val ServiceWorkerContainer.messageEvent: EventInstance<MessageEvent<JsAny?>, ServiceWorkerContainer, ServiceWorkerContainer>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/messageerror_event)
 */
inline val ServiceWorkerContainer.messageErrorEvent: EventInstance<MessageEvent<JsAny?>, ServiceWorkerContainer, ServiceWorkerContainer>
    get() = EventInstance(this, "messageerror")
