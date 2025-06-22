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
external class DedicatedWorkerGlobalScope
private constructor() :
    WorkerGlobalScope,
    MessageEventTarget {
    /**
     * The **`name`** read-only property of the the Worker.Worker constructor can pass to get a reference to the DedicatedWorkerGlobalScope.
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
inline val DedicatedWorkerGlobalScope.messageEvent: EventInstance<MessageEvent<JsAny?>, DedicatedWorkerGlobalScope, DedicatedWorkerGlobalScope>
    get() = EventInstance(this, "message")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/messageerror_event)
 */
inline val DedicatedWorkerGlobalScope.messageErrorEvent: EventInstance<MessageEvent<JsAny?>, DedicatedWorkerGlobalScope, DedicatedWorkerGlobalScope>
    get() = EventInstance(this, "messageerror")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/rtctransform_event)
 */
inline val DedicatedWorkerGlobalScope.rtcTransformEvent: EventInstance<RTCTransformEvent, DedicatedWorkerGlobalScope, DedicatedWorkerGlobalScope>
    get() = EventInstance(this, "rtctransform")
