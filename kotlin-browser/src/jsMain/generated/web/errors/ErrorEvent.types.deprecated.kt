// Automatically generated - do not modify!

package web.errors

import seskar.js.JsValue
import web.events.EventType

sealed external class ErrorEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ErrorEvent.ERROR"),
    )
    @JsValue("error")
    fun error(): EventType<ErrorEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("ErrorEvent.PROCESSOR_ERROR"),
    )
    @JsValue("processorerror")
    fun processorError(): EventType<ErrorEvent>
}
