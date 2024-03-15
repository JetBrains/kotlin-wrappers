// Automatically generated - do not modify!

package web.errors

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class ErrorEventTypes {

    @JsValue("error")
    fun <C : EventTarget> error(): EventType<ErrorEvent, C>

    @JsValue("processorerror")
    fun <C : EventTarget> processorError(): EventType<ErrorEvent, C>
}
