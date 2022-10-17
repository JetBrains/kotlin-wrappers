package web.workers

import web.events.EventTarget
import web.messaging.MessagePort
import web.url.URL

open external class SharedWorker : EventTarget, AbstractWorker {
    constructor(
        scriptURL: String,
        options: WorkerOptions = definedExternally,
    )

    constructor(
        scriptURL: URL,
        options: WorkerOptions = definedExternally,
    )

    /** Returns sharedWorker's MessagePort object which can be used to communicate with the global environment. */
    val port: MessagePort
}
