package web.workers

import kotlinx.js.ReadonlyArray
import web.events.EventTarget
import web.events.MessageEvent
import web.url.URL

open external class Worker : EventTarget, AbstractWorker {
    constructor(
        scriptURL: String,
        options: WorkerOptions = definedExternally,
    )

    constructor(
        scriptURL: URL,
        options: WorkerOptions = definedExternally,
    )


    var onmessage: ((event: MessageEvent) -> Unit)?
    var onmessageerror: ((event: MessageEvent) -> Unit)?

    /** Clones message and transmits it to worker's global environment. transfer can be passed as a list of objects that are to be transferred rather than cloned. */
    fun postMessage(
        message: Any?,
        transfer: ReadonlyArray<Any /* Transferable */>,
    )

    fun postMessage(
        message: Any?,
        /* options?: StructuredSerializeOptions, */
    )

    /** Aborts worker's associated global environment. */
    fun terminate()
}
