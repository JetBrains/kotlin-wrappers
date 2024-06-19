// Automatically generated - do not modify!

package web.errors

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class ErrorEventTypes {

    @JsValue("error")
    fun <C : EventTarget> error(): EventType<ErrorEvent, C>

    @JsValue("processorerror")
    fun <C : EventTarget> processorError(): EventType<ErrorEvent, C>
}
