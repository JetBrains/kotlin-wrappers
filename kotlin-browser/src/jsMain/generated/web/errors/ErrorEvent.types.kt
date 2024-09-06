// Automatically generated - do not modify!

package web.errors

import seskar.js.JsValue
import web.events.EventType

sealed external class ErrorEventTypes :
    ErrorEventTypes_deprecated {

    @JsValue("error")
    val ERROR: EventType<ErrorEvent>

    @JsValue("processorerror")
    val PROCESSOR_ERROR: EventType<ErrorEvent>
}
