// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import web.events.EventType

sealed external class GPUUncapturedErrorEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("GPUUncapturedErrorEvent.UNCAPTURED_ERROR"),
    )
    @JsValue("uncapturederror")
    fun uncapturedError(): EventType<GPUUncapturedErrorEvent>
}
