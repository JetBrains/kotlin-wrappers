// Automatically generated - do not modify!

package web.workers

import js.array.ReadonlyArray
import js.core.JsAny
import js.serialization.Transferable
import web.events.EventHandler
import web.events.EventInstance
import web.messaging.MessageEvent
import web.messaging.MessageEventTarget
import web.rtc.RTCTransformEvent
import web.serialization.StructuredSerializeOptions
import kotlin.js.definedExternally

/**
 * The **`DedicatedWorkerGlobalScope`** object (the Worker global scope) is accessible through the WorkerGlobalScope.self keyword.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope)
 */
open external class DedicatedWorkerGlobalScope
private constructor() :
    WorkerGlobalScope,
    MessageEventTarget {
    /**
     * The **`name`** read-only property of the DedicatedWorkerGlobalScope interface returns the name that the Worker was (optionally) given when it was created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/rtctransform_event)
     */
    var onrtctransform: EventHandler<RTCTransformEvent, DedicatedWorkerGlobalScope, DedicatedWorkerGlobalScope>?

    /**
     * The **`close()`** method of the DedicatedWorkerGlobalScope interface discards any tasks queued in the `DedicatedWorkerGlobalScope`'s event loop, effectively closing this particular scope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/close)
     */
    fun close()

    /**
     * The **`postMessage()`** method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that spawned it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/postMessage)
     */
    fun postMessage(
        message: JsAny?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: JsAny?,
        options: StructuredSerializeOptions = definedExternally,
    )
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/message_event)
 */
inline val <C : DedicatedWorkerGlobalScope> C.messageEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/messageerror_event)
 */
inline val <C : DedicatedWorkerGlobalScope> C.messageErrorEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "messageerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/rtctransform_event)
 */
inline val <C : DedicatedWorkerGlobalScope> C.rtcTransformEvent: EventInstance<RTCTransformEvent, C, C>
    get() = EventInstance(this, "rtctransform")
