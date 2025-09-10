// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.serialization.Transferable
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.messaging.MessageEventSource
import web.serialization.StructuredSerializeOptions
import web.workers.AbstractWorker
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`ServiceWorker`** interface of the Service Worker API provides a reference to a service worker.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker)
 */
open external class ServiceWorker
private constructor() :
    EventTarget,
    AbstractWorker,
    MessageEventSource {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/statechange_event)
     */
    var onstatechange: EventHandler<Event, ServiceWorker, ServiceWorker>?

    /**
     * Returns the `ServiceWorker` serialized script URL defined as part of `ServiceWorkerRegistration`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/scriptURL)
     */
    val scriptURL: String

    /**
     * The **`state`** read-only property of the ServiceWorker interface returns a string representing the current state of the service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state)
     */
    val state: ServiceWorkerState

    /**
     * The **`postMessage()`** method of the ServiceWorker interface sends a message to the worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: String,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: JsAny?,
        options: StructuredSerializeOptions = definedExternally,
    )

    fun postMessage(
        message: String,
        options: StructuredSerializeOptions = definedExternally,
    )
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/error_event)
 */
inline val <C : ServiceWorker> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/statechange_event)
 */
inline val <C : ServiceWorker> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "statechange")
