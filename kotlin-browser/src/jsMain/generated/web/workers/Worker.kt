// Automatically generated - do not modify!

package web.workers

import js.array.ReadonlyArray
import js.transferable.Transferable
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent
import web.serialization.StructuredSerializeOptions
import web.url.URL

/**
 * This Web Workers API interface represents a background task that can be easily created and can send messages back to its creator. Creating a worker is as simple as calling the Worker() constructor and specifying a script to be run in the worker thread.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker)
 */
open external class Worker(
    scriptURL: String,
    options: WorkerOptions = definedExternally,
) : EventTarget,
    AbstractWorker {
    constructor(
        scriptURL: URL,
        options: WorkerOptions = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, Worker, EventTarget>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/messageerror_event)
     */
    var onmessageerror: EventHandler<MessageEvent<*>, Worker, EventTarget>?

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
