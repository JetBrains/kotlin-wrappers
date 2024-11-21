// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.gpu

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
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

    @JsAlias(THIS)
    override fun asInit(): GPUUncapturedErrorEventInit

    companion object {
        @JsValue("uncapturederror")
        val UNCAPTURED_ERROR: EventType<GPUUncapturedErrorEvent>
    }
}
