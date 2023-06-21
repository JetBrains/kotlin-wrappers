// Automatically generated - do not modify!

package web.serviceworker

import js.core.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.StructuredSerializeOptions
import web.messaging.Transferable
import web.workers.AbstractWorker

sealed external class ServiceWorker :
    EventTarget,
    AbstractWorker {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/statechange_event) */
    var onstatechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/scriptURL) */
    val scriptURL: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state) */
    val state: ServiceWorkerState

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/postMessage) */
    fun postMessage(
        message: Any?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: Any?,
        options: StructuredSerializeOptions = definedExternally,
    )
}
