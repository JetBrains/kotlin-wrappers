// Automatically generated - do not modify!

package web.gpu

import web.events.Event
import web.events.EventType

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUUncapturedErrorEvent)
 */
open external class GPUUncapturedErrorEvent(
    override val type: EventType<GPUUncapturedErrorEvent>,
    init: GPUUncapturedErrorEventInit,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUUncapturedErrorEvent/error)
     */
    val error: GPUError

    companion object
}

inline val GPUUncapturedErrorEvent.Companion.UNCAPTURED_ERROR: EventType<GPUUncapturedErrorEvent>
    get() = EventType("uncapturederror")
