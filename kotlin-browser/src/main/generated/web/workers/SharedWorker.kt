// Automatically generated - do not modify!

package web.workers

import web.events.EventTarget
import web.messaging.MessagePort
import web.url.URL

external class SharedWorker(
    scriptURL: String,
    options: WorkerOptions /* | String */ = definedExternally,
) : EventTarget,
    AbstractWorker {
    constructor(
        scriptURL: URL,
        options: WorkerOptions /* | String */ = definedExternally,
    )

    /** Returns sharedWorker's MessagePort object which can be used to communicate with the global environment. */
    val port: MessagePort
}
