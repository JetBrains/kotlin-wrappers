// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class GPUUncapturedErrorEventTypes {

    @JsValue("uncapturederror")
    fun <C : EventTarget> uncapturedError(): EventType<GPUUncapturedErrorEvent, C>
}
