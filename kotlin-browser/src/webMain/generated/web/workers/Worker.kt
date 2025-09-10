// Automatically generated - do not modify!

package web.workers

import js.array.ReadonlyArray
import js.serialization.Transferable
import web.events.Event
import web.events.EventInstance
import web.events.EventTarget
import web.messaging.MessageEvent
import web.messaging.MessageEventTarget
import web.serialization.StructuredSerializeOptions
import web.url.URL
import kotlin.js.JsAny
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
     * The **`postMessage()`** method of the Worker interface sends a message to the worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: String,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: JsAny?,
        options: StructuredSerializeOptions = definedExternally,
    )

    fun postMessage(
        message: String,
        options: StructuredSerializeOptions = definedExternally,
    )

    /**
     * The **`terminate()`** method of the Worker interface immediately terminates the Worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/terminate)
     */
    fun terminate()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/error_event)
 */
inline val <C : Worker> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/message_event)
 */
inline val <C : Worker> C.messageEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/messageerror_event)
 */
inline val <C : Worker> C.messageErrorEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "messageerror")
