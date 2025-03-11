// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.JsAny
import js.transferable.Transferable
import web.events.*
import web.messaging.MessageEventSource
import web.serialization.StructuredSerializeOptions
import web.workers.AbstractWorker
import kotlin.js.definedExternally

/**
 * This ServiceWorker API interface provides a reference to a service worker. Multiple browsing contexts (e.g. pages, workers, etc.) can be associated with the same service worker, each through a unique ServiceWorker object.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker)
 */
external class ServiceWorker
private constructor() :
    EventTarget,
    AbstractWorker,
    MessageEventSource {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/statechange_event)
     */
    var onstatechange: EventHandler<Event, ServiceWorker, ServiceWorker>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/scriptURL)
     */
    val scriptURL: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state)
     */
    val state: ServiceWorkerState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: JsAny?,
        options: StructuredSerializeOptions = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<Event, ServiceWorker /* this */, ServiceWorker /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/statechange_event)
     */
    @JsEvent("statechange")
    val stateChangeEvent: EventInstance<Event, ServiceWorker /* this */, ServiceWorker /* this */>
}
