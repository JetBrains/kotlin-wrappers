// Automatically generated - do not modify!

package web.gpu

import web.events.Event
import web.events.EventType

/**
 * The **`GPUUncapturedErrorEvent`** interface of the WebGPU API is the event object type for the GPUDevice uncapturederror event, used for telemetry and to report unexpected errors.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUUncapturedErrorEvent)
 */
open external class GPUUncapturedErrorEvent(
    override val type: EventType<GPUUncapturedErrorEvent>,
    init: GPUUncapturedErrorEventInit,
) : Event {
    /**
     * The **`error`** read-only property of the GPUUncapturedErrorEvent interface is a GPUError object instance providing access to the details of the error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUUncapturedErrorEvent/error)
     */
    val error: GPUError

    companion object
}

inline val GPUUncapturedErrorEvent.Companion.UNCAPTURED_ERROR: EventType<GPUUncapturedErrorEvent>
    get() = EventType("uncapturederror")
