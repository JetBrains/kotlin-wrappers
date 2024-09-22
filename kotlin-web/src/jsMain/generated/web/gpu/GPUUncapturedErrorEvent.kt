// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.gpu

import seskar.js.JsValue
import web.events.Event
import web.events.EventType

external class GPUUncapturedErrorEvent(
    override val type: EventType<GPUUncapturedErrorEvent>,
    init: GPUUncapturedErrorEventInit,
) : Event {
    val error: GPUError

    companion object {
        @JsValue("uncapturederror")
        val UNCAPTURED_ERROR: EventType<GPUUncapturedErrorEvent>
    }
}
