// Automatically generated - do not modify!

package web.workers

import web.events.EventTarget
import web.messaging.MessagePort
import web.url.URL

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker) */
external class SharedWorker(
    scriptURL: String,
    options: String = definedExternally,
) : EventTarget,
    AbstractWorker {
    constructor(
        scriptURL: URL,
        options: String = definedExternally,
    )

    constructor(
        scriptURL: String,
        options: WorkerOptions,
    )

    constructor(
        scriptURL: URL,
        options: WorkerOptions,
    )

    /**
     * Returns sharedWorker's MessagePort object which can be used to communicate with the global environment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/port)
     */
    val port: MessagePort
}
