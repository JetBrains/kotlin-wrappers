// Automatically generated - do not modify!

package web.workers

import js.array.ReadonlyArray
import js.core.JsAny
import js.serialization.Transferable
import web.events.Event
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent
import web.messaging.MessageEvent
import web.messaging.MessageEventTarget
import web.serialization.StructuredSerializeOptions
import web.url.URL
import kotlin.js.definedExternally

/**
 * The **`Worker`** interface of the Web Workers API represents a background task that can be created via script, which can send messages back to its creator.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker)
 */
open external class Worker(
    scriptURL: String,
    options: WorkerOptions = definedExternally,
) : EventTarget,
    AbstractWorker,
    MessageEventTarget {
    constructor(
        scriptURL: URL,
        options: WorkerOptions = definedExternally,
    )

    /**
     * Clones message and transmits it to worker's global environment. transfer can be passed as a list of objects that are to be transferred rather than cloned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: JsAny?,
        options: StructuredSerializeOptions = definedExternally,
    )

    /**
     * Aborts worker's associated global environment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/terminate)
     */
    fun terminate()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<Event, Worker /* this */, Worker /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/message_event)
     */
    @JsEvent("message")
    val messageEvent: EventInstance<MessageEvent<JsAny?>, Worker /* this */, Worker /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/messageerror_event)
     */
    @JsEvent("messageerror")
    val messageErrorEvent: EventInstance<MessageEvent<JsAny?>, Worker /* this */, Worker /* this */>
}
