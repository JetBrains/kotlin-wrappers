// Automatically generated - do not modify!

package serviceworkers

import kotlinx.js.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.StructuredSerializeOptions
import web.messaging.Transferable
import web.workers.AbstractWorker

sealed external class ServiceWorker :
    EventTarget,
    AbstractWorker {
    var onstatechange: EventHandler<Event>?
    val scriptURL: String
    val state: ServiceWorkerState
    fun postMessage(
        message: Any?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: Any?,
        options: StructuredSerializeOptions = definedExternally,
    )
}
