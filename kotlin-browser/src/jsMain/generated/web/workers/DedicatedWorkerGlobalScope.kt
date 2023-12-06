// Automatically generated - do not modify!

package web.workers

import js.core.ReadonlyArray
import js.core.StructuredSerializeOptions
import js.core.Transferable
import web.events.EventHandler
import web.messaging.MessageEvent

sealed external class DedicatedWorkerGlobalScope :
    WorkerGlobalScope {
    /** Returns dedicatedWorkerGlobal's name, i.e. the value given to the Worker constructor. Primarily useful for debugging. */
    val name: String
    var onmessage: EventHandler<MessageEvent<*>>?
    var onmessageerror: EventHandler<MessageEvent<*>>?

    /** Aborts dedicatedWorkerGlobal. */
    fun close()

    /** Clones message and transmits it to the Worker object associated with dedicatedWorkerGlobal. transfer can be passed as a list of objects that are to be transferred rather than cloned. */
    fun postMessage(
        message: Any?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: Any?,
        options: StructuredSerializeOptions = definedExternally,
    )
}
