// Automatically generated - do not modify!

package web.workers

import web.events.Event
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent
import web.messaging.MessagePort
import web.url.URL
import kotlin.js.definedExternally

/**
 * The **`SharedWorker`** interface represents a specific kind of worker that can be _accessed_ from several browsing contexts, such as several windows, iframes or even workers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker)
 */
open external class SharedWorker(
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
     * The **`port`** property of the SharedWorker interface returns a MessagePort object used to communicate and control the shared worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/port)
     */
    val port: MessagePort

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<Event, SharedWorker /* this */, SharedWorker /* this */>
}
