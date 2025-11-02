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
 * The **`ServiceWorker`** interface of the Service Worker API provides a reference to a service worker. Multiple browsing contexts (e.g., pages, workers, etc.) can be associated with the same service worker, each through a unique ServiceWorker object.
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
     * Returns the ServiceWorker serialized script URL defined as part of ServiceWorkerRegistration. Must be on the same origin as the document that registers the ServiceWorker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/scriptURL)
     */
    val scriptURL: String

    /**
     * The **`state`** read-only property of the ServiceWorker interface returns a string representing the current state of the service worker. It can be one of the following values: parsed, installing, installed, activating, activated, or redundant.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state)
     */
    val state: ServiceWorkerState

    /**
     * The **`postMessage()`** method of the ServiceWorker interface sends a message to the worker. The first parameter is the data to send to the worker. The data may be any JavaScript object which can be handled by the structured clone algorithm.
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
