// Automatically generated - do not modify!

package web.errors

import seskar.js.JsValue
import web.events.EventType

sealed external class ErrorEventTypes_deprecated {

    @JsValue("error")
    fun error(): EventType<ErrorEvent>

    @JsValue("processorerror")
    fun processorError(): EventType<ErrorEvent>
}
