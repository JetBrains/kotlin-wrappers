// Automatically generated - do not modify!

package web.workers

import js.core.ReadonlyArray
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent
import web.messaging.StructuredSerializeOptions
import web.messaging.Transferable
import web.url.URL

open external class Worker(
    scriptURL: String,
    options: WorkerOptions = definedExternally,
) : EventTarget,
    AbstractWorker {
    constructor(
        scriptURL: URL,
        options: WorkerOptions = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/message_event) */
    var onmessage: EventHandler<MessageEvent<*>>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/messageerror_event) */
    var onmessageerror: EventHandler<MessageEvent<*>>?

    /**
     * Clones message and transmits it to worker's global environment. transfer can be passed as a list of objects that are to be transferred rather than cloned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/postMessage)
     */
    fun postMessage(
        message: Any?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: Any?,
        options: StructuredSerializeOptions = definedExternally,
    )

    /**
     * Aborts worker's associated global environment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/terminate)
     */
    fun terminate()
}
